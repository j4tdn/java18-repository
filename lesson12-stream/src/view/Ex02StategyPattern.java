	package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import functional.AppleCondition;
import model.DataModel;

public class Ex02StategyPattern {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		List<Apple> weightApples = findApples(inventory, (Apple apple) -> {
			return "green".equals(apple.getColor()) && apple.getWeight() > 200;
		});
		weightApples.forEach(System.out::println);

		// anonymous class
		List<Apple> redApples = filterApples(inventory, new AppleCondition() {

			@Override
			public boolean test(Apple apple) {
				return "red".equals(apple.getColor());
			}
		});
		System.out.println("=--- RED APPLES ---=");
		redApples.forEach(System.out::println);

		// anonymous function, lambda
		// override abstract method of functional interface with no name & arrow
		List<Apple> greenAndWeightApples = filterApples(inventory, (Apple apple) -> {
			return "green".equals(apple.getColor()) & apple.getWeight() > 200;
		});
		System.out.println("=--- GREEN AND WEIGHT APPLES ---=");
		greenAndWeightApples.forEach(System.out::println);
	}

	// stategy: signature --> stategy input(parameters)
	// --> stategy output(return type);
	private static List<Apple> filterApples(List<Apple> inventory, AppleCondition condition) {
		List<Apple> result = new ArrayList<>();

		for (Apple apple : inventory) {
			if (condition.test(apple)) {
				result.add(apple);
			}
		}

		return result;
	}

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