package view;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import functional.AppleCondition;
import model.DataModel;

/**
 * Method reference là method đại diện cho Lambda (anonymous function)
 */

public class Ex04MethodReference {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		// Cách gọi và truyền tham số
		
		// anonymous function = Lambda (override abstract method of functional interface with no name & arrow)
		// greenAndWeightApple --> return boolean 
		// Ex04MethodReference::greenAndWeightApple --> return AppleCondition
		//  
		List<Apple> greenAndWeightApples = filterApples(inventory, Ex04MethodReference::greenAndWeightApple);
		System.out.println("----- WEIGHT APPLES AND RED APPLES -----");
		greenAndWeightApples.forEach(System.out::println);
		
		// override for abstract method is complex and lots of code
		// create a 'static method reference' represents for override abstract method
		// + arbitrary name (tên tùy ý)
		// + arbitrary place (arbitrary class)
		// --> require input and output	
	}
	
	// static method reference
	// greenAndWeightApple --> override AppleCondition's abstract method --> test
	private static boolean greenAndWeightApple(Apple apple) {
		return "green".equals(apple.getColor()) && apple.getWeight() > 200;
	}
	
	private static List<Apple> filterApples(List<Apple> inventory, AppleCondition condition) {
		List<Apple> result = new ArrayList<>();

		for (Apple apple : inventory) {
			if (condition.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}