package view;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import bean.Apple;

public class Ex06ConstructorReferencs {
	public static void main(String[] args) {
		Supplier<Apple> supplier = Apple::new;

		Apple apple = supplier.get();
		System.out.println("apple -> " + apple);
		
		// vi du : mapping luu tru ban so xe viet nam,xep sep tang 
		
		Map<Integer, String > modelMap = new HashMap<>();
		modelMap.put(92, "quang nam");
		modelMap.put(76, "Quang Ngai");
		modelMap.put(43, "Da Nang");
		modelMap.put(75, "Hue");
		
		modelMap.forEach((k,v) -> System.out.println(v + " <--> " + k));
		
		
	}
}
