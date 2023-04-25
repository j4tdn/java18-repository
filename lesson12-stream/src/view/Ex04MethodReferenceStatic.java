package view;

import java.util.ArrayList;
import static java.util.Comparator.*;
import java.util.List;

import bean.Apple;
import funtional.AppleCondition;
import funtional.WeightHeavierAppleCondition;
import model.DataModel;

public class Ex04MethodReferenceStatic {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		// sorting by id desc, weight asc
		inventory.sort(Ex04MethodReferenceStatic::sortIdDescWeightAsc);
//		inventory.sort(comparing(Apple::getId, reverseOrder()).thenComparing(Apple::getWeight));
		System.out.println("======== SORT BY ID DESC, WEIGHT ASC ========");
		inventory.forEach(System.out::println);
		
		// anonymous function, lambda, override abstract method of function with no name & arrow (mũi tên)
		List<Apple> greenAndWeightApples = fillterApples(inventory, Ex04MethodReferenceStatic::greenAndWeightApple);
		
		
		// override for abstract method complex and lost of code
		// create a 'static method reference' represent for override abstract method
		// + arbitrary name
		// + arbitrary place(class)
		// --> require input and output
		
		System.out.println("======== GREEN AND WEIGHT APPLES ========");
		greenAndWeightApples.forEach(System.out::println);
	}
	
	// static method reference
	// greenAndWeightApple --> override Predicate's abstract method --> test
	private static boolean greenAndWeightApple(Apple apple) {
		return "green".equals(apple.getColor()) && apple.getWeight() > 200;
	}
	
	
	private static int sortIdDescWeightAsc(Apple a1, Apple a2) {
		int a1Id = a1.getId();
		int a2Id = a2.getId();

		if (a1Id != a2Id) {
			return a2Id - a1Id;
		}

		return Double.compare(a1.getWeight(), a2.getWeight());

	}
	
	private static List<Apple> fillterApples(List<Apple> inventory, AppleCondition condition) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (condition.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}
