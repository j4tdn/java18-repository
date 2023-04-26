package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.Apple;
import model.DataModel;

public class Ex05MethodReferenceNonStatic {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		// anonymous class --> lambda expression --> static method reference 
		
		/* non-static method reference
		 * lambda: (T t) -> t.method() => T::method
		 * lambda: (T t) -> arg.method() => arg::method
		 * arg -> System.out
		 */
		
		// sắp xếp khi hàng tăng dần theo cân nặng 
		inventory.sort(Comparator.comparing(Apple::getWeight));
		
		inventory.forEach(System.out::println); // out -> object
	}

}
