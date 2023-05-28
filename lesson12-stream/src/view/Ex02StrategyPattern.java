package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import bean.Apple;
import functional.AppleCondition;
import functional.WeightHeavierAppleCondition;
import model.DataModel;

public class Ex02StrategyPattern {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		// cách gọi và truyền tham số
		// external/implementation class
		List<Apple> weightApples = fillterApples(inventory, new WeightHeavierAppleCondition());
		System.out.println("--------- RED APPLE ---------");
		weightApples.forEach(System.out::println);
		
		// anonymous class
		List<Apple> redApples = fillterApples(inventory, new AppleCondition() {
			
			@Override
			public boolean test(Apple apple) {
				// TODO Auto-generated method stub
				return "red".equals(apple.getColor());
			}
		});
		System.out.println("--------- RED APPLE ---------");
		redApples.forEach(System.out::println);
		
		// anonymous function, lambda, override abstract method of functional interface with no name & arrow
		List<Apple> greenAndWeightApples = fillterApples(inventory, (Apple apple) -> {
			return "green".equals(apple.getColor()) && apple.getWeight() > 200;
		});
		System.out.println("--------- RED APPLE ---------");
		greenAndWeightApples.forEach(System.out::println);
		
	}
	
	
	// strategy: signature --> strategy input(parameters)
	//					   --> strategy output(return type)
	// boolean test(Apple)
	private static List<Apple> fillterApples(List<Apple> inventory, AppleCondition condition) {
		List<Apple> result = new ArrayList<>();
		
		for(Apple apple: inventory) {
			if(condition.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}
