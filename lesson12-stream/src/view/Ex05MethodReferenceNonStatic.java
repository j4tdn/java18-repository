package view;

import java.util.Comparator;
import java.util.List;

import bean.Apple;
import model.DataModel;

public class Ex05MethodReferenceNonStatic {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		/*
		 * non static reference
		 * lamda: (T t) -> t.method() --> T:method
		 * lamda: (T t) -> ...arg.method() --> ...arg::method
		 */
		
		//sắp xếp kho hàng theo cân nặng
//		inventory.sort(Comparator.comparing((Apple apple) -> apple.getWeight()));
		inventory.sort(Comparator.comparing(Apple::getWeight));
		
//		inventory.forEach((Apple a)->System.out.println(a));
		inventory.forEach(System.out::println);
		
	}
}
