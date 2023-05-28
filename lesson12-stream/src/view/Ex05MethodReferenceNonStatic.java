package view;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;

public class Ex05MethodReferenceNonStatic {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		//Sắp xếp kho hàng tăng dần theo giá bán
//		inventory.sort(Comparator.comparing(new Function<Apple, Double>() {
//			@Override
//			public Double apply(Apple a) {
//				return a.getWeight();
//			}
//		}));
		
		// annymous class --> lada expressiom
		// static method reference
		/*
		 *  non-static method reference
		 *  lambda: (T t) -> t.method() ---> T::method
		 *  lambda: (T t) -> ...arg.method(t) ---> ...ar::method
		 */
		inventory.sort(Comparator.comparing(Apple::getWeight));
		
		inventory.sort(Comparator.comparing((Apple a)->{
			return a.getWeight();
		}));
		
		// inventory.sort(Comparator.comparing((Apple a)-> a.getWeight()));
		
		inventory.forEach(System.out::println);
		
	}
}
