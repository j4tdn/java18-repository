package view;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import functional.AppleCondition;
import functional.weightHeavierAppleCondition;
import model.DataModel;

public class Ex02StrategyPattern {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getAll();
		List<Apple> redApples = filterApples(inventory, apple -> apple.getColor().equals("red"));
		redApples.forEach(a -> System.out.println(a));
		System.out.println("===========Weight==========");
		List<Apple> weightApples = filterApples(inventory, a -> a.getWeight()>=150d);
		weightApples.forEach(s -> System.out.println(s));
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
