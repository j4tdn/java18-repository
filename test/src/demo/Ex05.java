package demo;

import java.util.function.Supplier;

import bean.Apple;
import utils.Bufunsion;

public class Ex05 {
	public static void main(String[] args) {
		Supplier<Apple> supplier = new Supplier<Apple>() {
			
			@Override
			public Apple get() {
				return new Apple();
			}
		};
		Apple a1 = supplier.get();
		
		System.out.println(a1);
		
		Bufunsion<Apple, Integer, String, Integer, String> bufunsion = new Bufunsion<Apple, Integer, String, Integer, String>() {
			
			@Override
			public Apple apply(Integer id, String color, Integer salary, String country) {
				return new Apple(id, color, salary, country);
			}
		};
		Apple a2 = bufunsion.apply(12, "red", 112, "Vietnam");
		System.out.println(a2);
	}
}
