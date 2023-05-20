package views;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import functional.AppleCondition;
import functional.WeightHeavierAppleCondition;
import model.DataModel;

public class Ex02StrategyPattern {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		// Cách gọi và truyền tham số
		
		// anonymous function = Lambda (override abstract method of functional interface with no name & arrow)
		List<Apple> greenAndWeightApples = filterApples(inventory, apple -> "green".equals(apple.getColor()) && apple.getWeight() > 200);
		System.out.println("----- WEIGHT APPLES AND RED APPLES -----");
		greenAndWeightApples.forEach(System.out::println);
		
		// external/implementation class
		List<Apple> weightApples = filterApples(inventory, new WeightHeavierAppleCondition());
		System.out.println("\n----- WEIGHT APPLES -----");
		weightApples.forEach(System.out::println);
		
		// anonymous class 
		List<Apple> redApples = filterApples(inventory, new AppleCondition() {
			
			@Override
			public boolean test(Apple apple) {
				return "red".equals(apple.getColor());
			}
		});
		System.out.println("\n----- RED APPLES -----");
		redApples.forEach(System.out::println);	
	}
	
	// strategy: need to know signature --> strategy input (parameters)
	//									--> strategy output (return type)
	// boolean test(Apple apple)
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