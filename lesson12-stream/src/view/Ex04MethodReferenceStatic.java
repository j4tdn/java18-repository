package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import bean.Apple;
import functional.AppleCondition;
import functional.WeighHeavierAppleCondition;
import model.DataModel;

public class Ex04MethodReferenceStatic {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		inventory.sort(Ex04MethodReferenceStatic::sortIdDesWeighAsc);
		inventory.forEach(System.out::println);
		
		//anonymous function, lamda
		List<Apple> greenAndWeighApples = 
				filterApples(inventory, Ex04MethodReferenceStatic::greenAndWeighApples);
		
		//Override for abstract method complex and of code 
		//create a 'static method reference' represent for override abstract method
		// + arbitrary name
		// + arbitrary place (class)
		//--> require input an output
		
		System.out.println("--Green and Weigh Apples --");
		greenAndWeighApples.forEach(System.out::println);
		
	}
	
	//static method reference
	private static boolean greenAndWeighApples(Apple apple) {
		return "green".equals(apple.getColor()) && apple.getWeight()>200;	
	}
	
	private static List<Apple> filterApples(List<Apple> inventory, AppleCondition condition) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (condition.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
	
	
	private static int sortIdDesWeighAsc(Apple a1, Apple a2) {
		int a1ID = a1.getId();
		int a2ID = a2.getId();
		
		if(a1ID != a2ID) {
			return a2ID - a1ID;
		}
		return Double.compare(a1.getWeight(), a2.getWeight());

	}
}
