package view;

import java.util.Comparator;
import java.util.List;

import bean.Apple;
import model.DataModel;

public class Ex05MethodReferemceNonStatic {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		/*
		 * non-static method referemce
		 * lambda: (T t) -> t.method()	--> T::method
		 * lambda: (T t) -> ...arg.method(t) -> ...arg::method
		 */
		
		inventory.sort(Comparator.comparing(Apple::getWeight));
		
		inventory.forEach(System.out::println);
	}
}
