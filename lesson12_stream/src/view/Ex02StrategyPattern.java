package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Apple;
import functional.AppleCondition;
import functional.WeightHeavierAppleCondition;
import model.DataModel;

public class Ex02StrategyPattern {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		List<Apple> weightApples = filterApples(inventory, new WeightHeavierAppleCondition() {
			@Override
			public boolean test(Apple apple) {
				return apple.getWeight() > 200;
			}
		});
		
		System.out.println(" ----- WEIGHT APPLE -----");
		weightApples.forEach(System.out::println);
		
		List<Apple> redApples = filterApples(inventory, new AppleCondition(){
			
			@Override
			public boolean test(Apple apple) {
				return "red".equals(apple.getColor());
			}
		});
		
		System.out.println(" ----- RED APPLE -----");
		redApples.forEach(System.out::println);
		
		List<Apple> greenAndWeightApples = filterApples(inventory, (Apple apple) -> {
			return "green".equals(apple.getColor()) & apple.getWeight() > 200;
		});
		
		System.out.println(" ----- GREEN AND WEIGHT APPLE -----");
		greenAndWeightApples.forEach(System.out::println);
	}
	
	
	
	// strategy: signature 	--> strategy input(parameter)
	//						--> strategy output(return type)
	// boolean(test)
	private static List<Apple> filterApples(List<Apple> inventory, AppleCondition condition){
		if (inventory.isEmpty()) {
			return Collections.emptyList();
			
		}
		
		List<Apple> resuft = new ArrayList<>();
		for (Apple apple : inventory) {
			if (condition.test(apple)) {
				resuft.add(apple);
			}
		}
		
		return resuft;
	}

}
