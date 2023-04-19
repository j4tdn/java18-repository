package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import bean.Apple;
import functional.AppleCondition;
import functional.WeightHeavierAppleCondition;
import model.DataModel;

public class Ex04MethodReference {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		// sorting by id desc, weight asc
		inventory.sort(Ex04MethodReference::sortIdDescWeightAsc);
		System.out.println("=--- SORTED BY ID DESC, WEIGHT ASC ---=");
		inventory.forEach(System.out::println);
		
		
		// lambda, anonymous function
		List<Apple> greenAndWeightApples =  
				filterApples(inventory, Ex04MethodReference::greenAndWightApple);
		
		// override for abstract method complex and lots of code
		// create a 'static method reference' represent for override abstract method
		// + arbitrary name
		// + arbitrary place(class)
		// --> require input and output
		
		System.out.println("=--- GREEN AND WEIGHT APPLES ---=");
		greenAndWeightApples.forEach(System.out::println);
	}
	
	private static int sortIdDescWeightAsc(Apple a1, Apple a2) {
		int a1Id = a1.getId();
		int a2Id = a2.getId();
		
		if (a1Id != a2Id) {
			return a2Id - a1Id;
		}
		
		return Double.compare(a1.getWeight(), a2.getWeight());
	}
	
	// static method reference
	// greenAndWightApple --> override Predicate's abstract method --> test
	private static boolean greenAndWightApple(Apple apple) {
		return "green".equals(apple.getColor()) & apple.getWeight() > 200;
	}
	
	
	private static List<Apple> filterApples(List<Apple> inventory, AppleCondition condition) {
		List<Apple> result = new ArrayList<>();
		
		for (Apple apple: inventory) {
			if (condition.test(apple)) {
				result.add(apple);
			}
		}
		
		return result;
	}
}
