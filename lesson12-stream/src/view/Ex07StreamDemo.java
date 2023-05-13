package view;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bean.Apple;
import bean.Dish;
import bean.Dish.Kind;
import model.DataModel;

import static utils.PrintUtils.print;;

public class Ex07StreamDemo {

	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();

//		//1.Liệt kê những đĩa thức ăn có lượng calo > 250
//		
//		//B1: Chuyển đổi từ CTDL nào đó --> CTDL Stream
//		Stream<Dish> streamingDish = menu.stream();
//		//B2: Sử dụng những hàm có sẵn trong stream để xử lý
//		//  : KQ tra về Stream<?> là 1 tập các phần tử trong Stream
//		//  : builder and strategy pattern
//		
//		Stream<Dish> filtersDish = streamingDish.filter(d->d.getCalories()>400);
//		
//		
//		
//		//B3: Chuyển đỏi từ Stream<?> sang CTDL mong muốn
		// --> list,set,map,array,String,int,Integer
//		List<Dish> result = filtersDish.collect(Collectors.toList());
		List<Dish> dishesByCalories = menu.stream().filter(d -> d.getCalories() > 400).collect(Collectors.toList());
		print("Câu 1:Liệt kê những đĩa thức ăn có lượng calo > 400", dishesByCalories);

		Set<Kind> kinds = menu.stream() // Stream<Dish>
				.map(Dish::getKind) // Stream<Kind>
				.collect(Collectors.toSet()); // Set<Kind>
		print("Câu 2: Liệt kê tên của những loại thức ăn", kinds);

		// transformer(menu, Dish::getKind)
		print("Câu 2: Liệt kê xuất xứ của kho hàng", transformer(DataModel.getApples(), new Function<Apple, String>() {
			public String apply(Apple apple) {
				return apple.getCountry();
			};
		}));

		Set<String> veggieDishes = menu.stream() // Stream<Dish>
				.filter(d -> Kind.VEGGIE.equals(d.getKind())) // Stream<Dish>
				.map(Dish::getName) // Stream<String>
				.collect(Collectors.toSet()); // Set<String>
		print("Câu 3: Liệt kê tên của những đĩa thức ăn chay", veggieDishes);
	}

	// dish --> name --> List<String>
	// dish --> calories --> List<Double>
	// dish --> id --> List<String>

	// apple --> country --> List<String>
	// apple --> id      --> List<Integer>

	public static <T, R> Set<R> transformer(List<T> list, Function<T, R> func) {
		Set<R> result = new HashSet<>();

		for (T item : list) {
			result.add(func.apply(item));
		}

		return result;
	}
}
