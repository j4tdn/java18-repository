package view;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bean.Dish;
import bean.Dish.Kind;
import model.DataModel;
import static utils.PrintUtils.*;

public class Ex07StreamDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		menu.forEach(System.out::println);

		// 1. Liệt kê những đĩa thức ăn có lượng calo > 250
		// B1: CHUYỂN ĐỔI TỪ CTDL NÀO ĐÓ --> CTDL stream<T>

//		Stream<Dish> streamDish = menu.stream();

		// B2: SỬ DỤNG NHỮNG HÀM CÓ SẴN TRONG STREAM ĐỂ XỬ LÝ
		// : KQ trả về stream<T> là 1 tập các phần tử trong Stream
		// : builder và strategy pattern

//		Stream<Dish> filterDish = streamDish.filter(d->d.getCalories()>250);

		// B3: CHUYỂN ĐỔI TỪ Stream<?> SANG CTDL MONG MUỐN

//		List<Dish> result = filterDish.collect(Collectors.toList());

		List<Dish> result = menu.stream().filter(d -> d.getCalories() > 250).collect(Collectors.toList());
		printf("Câu 1: Liệt kê những đĩa thức ăn có lượng calo > 250", result);

		// LÀM BÌNH THƯỜNG
//		printf("Câu2: ", transfomer(menu,new Function<Dish, Kind>(){
//			public Kind apply(Dish d) {
//				return d.getKind();
//			};
//		}));

		// DẠNG LAMDA
//		printf("Câu2: ", transfomer(menu, (Dish d)->{
//			return d.getKind();
//		}));

		// DẠNG METHOD REFERENCE
//		printf("Câu2: ", transfomer(menu, Dish::getKind));

		// DÙNG STREAM
		Set<Kind> kinds = menu.stream().map(Dish::getKind).collect(Collectors.toSet());
		printf("Câu2: ", kinds);
		
		//Câu 3: Liệt kê những thức ăn chay
		Set<String> veggieDish = menu.stream()
				.filter(d->Kind.VEGGIE.equals(d.getKind()))
				.map(d->d.getName())
				.collect(Collectors.toSet());
		printf("Câu 3: Tên những món chay", veggieDish);
	}

	public static <T, R> Set<R> transfomer(List<T> menu, Function<T, R> func) {
		Set<R> result = new HashSet<>();
		for (T dish : menu) {
			result.add(func.apply(dish));
		}
		return result;
	}
}
