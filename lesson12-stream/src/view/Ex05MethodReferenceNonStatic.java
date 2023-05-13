package view;

import java.security.cert.CollectionCertStoreParameters;
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
		
		//anonymous class --> lambda expression
		//static method reference
		//non static method reference
		/*
		 * non static method reference
		 * lambda: (T t )-> t.method()--->T::method
		 * lambda: (T t) -> ...argument.method(t)--->...argument::method
		 */
		
		//Sắp xếp kho hàng tăng dần theo cân nặng
		Collections.sort(inventory, Comparator.comparing(Apple::getWeight));
		
		inventory.forEach(System.out::println);	 
			
	}
}
