package view;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bean.Dish;
import bean.Dish.Kind;
import model.DataModel;
import static util.PrintUtils.*;

public class Ex07StreamDemo {
	
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		// 1. liệt kê những đĩa thức ăn có lượng "calo > 250"
		
		// B1: chuyển đổi từ CTDL nào đó --> CTDL stream
		// Stream<Dish> streamingDish = menu.stream();
		
		// B2: Sử dụng những hàm có sẵn trong stream để xử lý
		// 	 : KQ trả về Stream<?> là 1 tập các phần tử trong Stream
		//	 : builder và strategy pattern
		// Stream<Dish> filteredDish = streamingDish.filter(d -> d.getCalories() > 400);
		
		// B3: Chuyển đổi từ Stream<?> sang CTDL mong muốn
		// --> list, set, map, array, String, int, Integer
		// List<Dish> result = filteredDish.collect(Collectors.toList());
		
		List<Dish> dishesByCalories = menu.stream()
								.filter(d -> d.getCalories() > 400)
								.collect(Collectors.toList());
		
		print("Câu 1: Liệt kê những đĩa thức ăn có lượng calo > 400", dishesByCalories);
		
		List<Kind> getKinds = menu.stream() 
								  .map(Dish::getKind) // Stream<Kind>
								  .toList();
		
		
		// Câu 3: Liệt kê tên của những đĩa ăn chay
		Set<String> veggieDishes = menu.stream()
							.filter(d -> Kind.VEGGIE.equals(d.getKind()))
							.map(Dish::getName)
							.collect(Collectors.toSet());
		
		print("Câu 3: Liệt kê tên của những đĩa ăn chay", veggieDishes);
		
		
	}
}
