package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import bean.Apple;
import functional.AppleCondition;
import functional.WeighHeavierAppleCondition;
import model.DataModel;

public class Ex02StrategyPattern {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		
		//cách gọi truyền tham số 
		//external/implementation class
		List<Apple> weighApples = filterApples(inventory,new WeighHeavierAppleCondition());
		System.out.println("--Weigh Apples --");
		weighApples.forEach(System.out::println);
		
		
		//anonymous class
		List<Apple> redApples = filterApples(inventory, new AppleCondition() {
			
			@Override
			public boolean test(Apple apple) {
				
				return "red".equals(apple.getColor());
			}
		});
		System.out.println("--RED Apples --");
		redApples.forEach(System.out::println);
		
		//anonymous function./lamda
		List<Apple> greenAndWeighApples = filterApples(inventory, (Apple apple)-> {
			return "green".equals(apple.getColor()) && apple.getWeight()>200;
		});
		System.out.println("--Weigh Apples --");
		greenAndWeighApples.forEach(System.out::println);
		
	}
	
	
	
	//strategy: signature --> strategy input(parameters)
	//					  --> strategy output(parameters)
	//boolean test(Apples)
	private static List<Apple> filterApples(List<Apple> inventory, AppleCondition condition) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (condition.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
	
}
