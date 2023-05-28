package view;

import static utils.PrintUtils.print;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.transform.Transformer;

import bean.Dish;
import bean.Dish.Kind;
import model.DataModel;

public class Ex07StreamDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		// 1. Liệt kê những đĩa thức ăn có lượng calo > 250
		// B1: Chuyển đổi từ CTDL nào đó -> CTDL stream
		Stream<Dish> streamDish = menu.stream();
		// B2: Sử dụng những hàm có sẵn trong strem dể xử lý
		//   : KQ trả về Stream<?> là 1 tập các phần tử trong stream
		//   : buider và strategy patten 
		Stream<Dish> filterDish = streamDish.filter(d -> d.getCalories()>400);
		
		// B3: Chuyển từ Stream<?> samng CTDL mong muốn
		// --> List, set, map, array, String, int Integer
		List<Dish> dishedByCalo = filterDish.collect(Collectors.toList());
		//result.forEach(System.out::println);
		print("Cau 1: ", dishedByCalo);
		
//		print("Câu 2:",
//				Transformer());
//		
		Set<Kind> kinds = menu.stream() //Stream<Dish>
							.map(Dish::getKind)
							.collect(Collectors.toSet());
		
		
		print("Cau 2: ", kinds);
		
		Set<String> VeggieDish = menu.stream()
				.filter(d -> Kind.VEGGIE.equals(d.getKind()))
				.map(Dish::getName)
				.collect(Collectors.toSet());
		print("Câu 3: Liệt kê tên thức ăn chay" , VeggieDish);
	}
//	
//	public static <T, R> Set<R> tranformer(List<T> list, Function<T, R> func){
//		
//	}
}
