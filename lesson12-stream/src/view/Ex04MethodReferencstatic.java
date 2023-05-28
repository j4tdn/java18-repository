package view;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import functional.AppleCondition;
import functional.weightHeavierAppleCondition;
import model.DataModel;

public class Ex04MethodReferencstatic {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getAll();
		System.out.println("===========red===========");
		List<Apple> redApples = filterApples(inventory, apple -> apple.getColor().equals("red"));
		redApples.forEach(a -> System.out.println(a));
		System.out.println("===========Weight==========");
		List<Apple> weightApples = filterApples(inventory, a -> a.getWeight()>=150d);
		weightApples.forEach(s -> System.out.println(s));
		System.out.println("===========green===========");
		List<Apple> greenApples = filterApples(inventory, Ex04MethodReferencstatic::greenAndWightApple);
		greenApples.forEach(s -> System.out.println(s));
		System.out.println("===========Sort============");
		inventory.sort(Ex04MethodReferencstatic::sortId);
		inventory.forEach(s -> System.out.println(s));
	}
	private static int sortId(Apple a1,Apple a2) {
		int a1Id = a1.getId();
		int a2Id = a2.getId();
		if(a1Id!=a2Id) {
			return a2Id-a1Id;
		}
		return Double.compare(a1.getWeight(), a2.getWeight());
		
	}
	
	// --> overide Predicate's abstract method --> test
	private static boolean greenAndWightApple(Apple apple) {
		return "green".equals(apple.getColor());
	}
	

	private static List<Apple> filterApples(List<Apple> inventory ,AppleCondition<Apple> condition) {
		List<Apple> result = new ArrayList<>();

		for (Apple apple : inventory) {
			if (condition.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

}
