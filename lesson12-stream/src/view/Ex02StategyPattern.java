package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import model.Datamodel;

public class Ex02StategyPattern {
	public static void main(String[] args) {
		List<Apple> inventory = Datamodel.getApples();
		List<Apple> weightApples = findApples(inventory, (Apple apple)->{
			return "green".equals(apple.getColor()) && apple.getWeight() > 200;
		});
		weightApples.forEach(System.out::println);
	}
	//stategy: signature --> stategy input(parameters)
	//					 --> stategy output(return type);
	private static List<Apple> findApples(List<Apple> inventory, Predicate<Apple> predicate) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple: inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}