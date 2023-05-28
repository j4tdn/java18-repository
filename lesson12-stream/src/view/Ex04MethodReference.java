package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Apple;
import functional.AppleCondition;
import functional.WeightHeavierAppleCondition;
import model.DataModel;

public class Ex04MethodReference {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
	
		inventory.sort(Ex04MethodReference::sortIdDescWeightAsc);
		inventory.forEach(System.out::println);
		
		// anonymous function, lambda
		List<Apple> greenAndWeightApples = fillterApples(inventory, Ex04MethodReference::greenAndWeightApple);
		
		// override for abstract method complex and lots of code
		// create a 'static method reference' represent for override abstract method
		// + arbitrary name
		// + arbitrary place(class)
		// --> require input and output
		System.out.println("--------- RED APPLE ---------");
		greenAndWeightApples.forEach(System.out::println);
		
	}
	
	private static int sortIdDescWeightAsc(Apple a1, Apple a2) {
		int a1Id = a1.getId();
		int a2Id = a2.getId();
		
		if(a1Id != a2Id) {
			return a2Id - a1Id;
		}
		
		return Double.compare(a1Id, a2Id);
	}
	
	// static method reference
	// greenAndWeightApple --> override Predicate's abstract method --> test 
	private static boolean greenAndWeightApple(Apple apple) {
		return "green".equals(apple.getColor()) && apple.getWeight() > 200;
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
