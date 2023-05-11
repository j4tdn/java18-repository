package view;

import static utils.PrintUtils.print;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Dish;
import bean.Dish.Kind;
import model.DataModel;

public class Ex07StreamDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		// 1. "Liệt kê" những đĩa thức ăn có lượng "calo > 250" --> filter
		// B1: chuyển đổi từ CTDL nào đó --> CTDL stream
		//Stream<Dish> streamingDish = menu.stream();
		
		// B2: sử dụng hàm có sẵn trong steam để xử lý
		//   : KQ trả về Stream<?> là một tập các phần tử trong Stream
		//   : sử dụng Builder và Strategy Pattern
		//Stream<Dish> filteredDish = streamingDish.filter(d -> d.getCalories() > 250);
		
		// B3: chuyển đổi từ Stream<?> sang một CTDL mong muốn
		// --> List, Set, Map, array, String, int, Integer
		//List<Dish> result = filteredDish.collect(Collectors.toList());
		
		List<Dish> dishesByCalories = menu.stream()
				                .filter(d -> d.getCalories() > 250)
				                .collect(Collectors.toList());
		print("1. Liệt kê những đĩa thức ăn có lượng calo > 250", dishesByCalories);
		
		Set<Kind> kinds = menu.stream() // Stream<Dish>
				               .map(Dish::getKind) // Stream<Kind>
				               .collect(Collectors.toSet());
		print("2. Liệt kê những loại thức ăn", kinds);
		
		Set<String> veggieDishes = menu.stream()
								.filter(d -> Kind.VEGGIE.equals(d.getKind()))
								.map(Dish::getName)
								.collect(Collectors.toSet());
		print("Câu 3: Liệt kê những đĩa thức ăn chay", veggieDishes);
		
	}
	
	// tự viết ra hàm để get thuộc tính của đối tượng (giống hàm map trong Stream)
	public static <T, R> Set<R> transformer(List<T> list, Function<T, R> func) {
		Set<R> result = new HashSet<>();
		
		for (T item : list) {
			result.add(func.apply(item));
		}
		return result;
	}
}
