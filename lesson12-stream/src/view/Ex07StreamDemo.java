package view;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Dish;
import bean.Dish.Kind;
import model.DataModel;
import static utils.PrintUtils.*;

public class Ex07StreamDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		// 1. chuyển đổi những đĩa thức ăn có lượng "calo > 400" --> filter
		// B1: Chuyển đổi từ KDL nào đó --> CTDL Stream<T>
		// B2: Sử dụng những hàm có sẵn trong stream để xử lý
		// 	 : Kết quả trả về Stream<?> là 1 tập các phần tử trong Stream
		//   : builder và strategy pattern
		// B3: Chuyển đổi từ Stream<?> sang CTDL mong muốn
		// --> list, set, map, array, String, int, Integer
		
		
		List<Dish> dishByCalories = menu.stream().filter(d -> d.getCalories() > 400).collect(Collectors.toList());
		print("Câu 1: Liệt kê những đĩa thức ăn có lượng calo > 400", dishByCalories);
		
		Set<Kind> kinds = menu.stream().map(Dish::getKind).collect(Collectors.toSet());
//		menu.stream().map(Dish::getName).collect(Collectors.toList()).forEach(System.out::println);
		print("Câu 2: Liệt kê tên của những loại thức ăn", kinds);
		
		Set<String> veggieDishes = menu.stream()
								.filter(d -> Kind.VEGGIE.equals(d.getKind()))
								.map(Dish::getName)
								.collect(Collectors.toSet());
		print("Câu 3: Liệt kê tên của những đĩa thức ăn chay", veggieDishes);
		
		
	}
}
