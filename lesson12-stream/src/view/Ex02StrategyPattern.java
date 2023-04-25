package view;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import funtional.AppleCondition;
import funtional.WeightHeavierAppleCondition;
import model.DataModel;

public class Ex02StrategyPattern {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();

		// cách gọi và truyền tham số
		List<Apple> weightApples = fillterApples(inventory, new WeightHeavierAppleCondition());
		System.out.println("======== WEIGHT APPLES ========");
		weightApples.forEach(System.out::println);

		// anonymous class
		List<Apple> redApple = fillterApples(inventory, new AppleCondition() {

			@Override
			public boolean test(Apple apple) {
				return "red".equals(apple.getColor());
			}
		});
		System.out.println("======== RED APPLES ========");
		redApple.forEach(System.out::println);
		
		// anonymous function, lambda, override abstract method of function with no name & arrow (mũi tên)
		List<Apple> greenAndWeightApples = fillterApples(inventory, (Apple apple) -> {
			return "green".equals(apple.getColor()) && apple.getWeight() > 200;
		});
		System.out.println("======== GREEN AND WEIGHT APPLES ========");
		greenAndWeightApples.forEach(System.out::println);
	}

	// strategy: signature --> strategy input(parameters)
	//                     --> strategy output(return type)

	// boolean test(Apple)
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
