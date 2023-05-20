package views;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;

public class Ex05MethodReferenceNonStatic {
	public static void main(String[] args) {
		List<Apple> inventory = new ArrayList<Apple>();
		inventory = DataModel.getApples();
		
		
		//anonymous class
		inventory.sort(Comparator.comparing((Apple a) -> a.getWeight()));
		
		inventory.forEach((Apple a) -> {
			System.out.println(a);
		});
		
		System.out.println("--------------------------------");
		//lambda: (T t) -> t::method() ---> T::method
		inventory.sort(Comparator.comparing(Apple::getWeight));
		
		//lambda: (T t) -> ...arg.method(t) ---> ...arg::method
		inventory.forEach(System.out::println);
		

	}

}
