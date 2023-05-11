package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import model.DataModel;

public class Ex04MethodReferenceStatic {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
//		List<Apple> weightApples = findApples(inventory, (Apple apple)->{
//			return "green".equals(apple.getColor()) && apple.getWeight() > 200;
//		});
		// -> Sử dụng khi code lamda dài
		List<Apple> weightApples = findApples(inventory, Ex04MethodReferenceStatic::greenAndWeightApple);

		// create a static method reference present for override abstract method
		// + aritraty name
		// + aritraty place
		// -> required input and output
		weightApples.forEach(System.out::println);

		// sorting by id desc, weight asc
		inventory.sort(Ex04MethodReferenceStatic::sortIdDescWeightAsc);
		System.out.println("=--- SORTED BY ID DESC, WEIGHT ASC ---=");
		inventory.forEach(System.out::println);

	}

	private static int sortIdDescWeightAsc(Apple a1, Apple a2) {
		int a1Id = a1.getId();
		int a2Id = a2.getId();

		if (a1Id != a2Id) {
			return a2Id - a1Id;
		}
		return Double.compare(a1.getWeight(), a2.getWeight());
	}

	private static boolean greenAndWeightApple(Apple apple) {
		return "green".equals(apple.getColor()) && apple.getWeight() > 200;
	}

	// static method reference
	// greenAndWightApple --> override Predicate's abstract method --> test
	private static List<Apple> findApples(List<Apple> inventory, Predicate<Apple> predicate) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}