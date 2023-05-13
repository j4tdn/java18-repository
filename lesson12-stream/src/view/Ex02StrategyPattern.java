package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import bean.Apple;
import functional.AppleCondition;
import functional.WeightHeavierAppleCondition;
import model.DataModel;

public class Ex02StrategyPattern {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		//cách gọi và truyền tham số
		//external//implementation class: dùng khi đoạn code overide dài
		List <Apple> weightApples  = filterApples(inventory,new WeightHeavierAppleCondition());
		System.out.println("==WEIGHT APPLES==");
		weightApples.forEach(System.out::println);
		//anonymous class
		List <Apple> redApples  = filterApples(inventory, new AppleCondition() {
			
			@Override
			public boolean test(Apple apple) {
				//do something
				return "red".equals(apple.getColor());
			}
		});
		System.out.println("==RED APPLES==");
		redApples.forEach(System.out::println);
		//anonymous function,lamda overide abstract method of functional interface with no name & arrow
		List <Apple> greenAndWeightApples =filterApples(inventory, (Apple apple)->{
			return "green".equals(apple.getColor())&& apple.getWeight()>200;
		});
		System.out.println("==GREEN AND WEIGHT APPLES==");
		greenAndWeightApples.forEach(System.out::println);
	}
	//signature(js) = functionInterface (java)
	//strategy: signature --> strategy input(parameters)
	//					  --> strategy output(return type)
	//boolean test(Apple)
	private static List<Apple> filterApples(List<Apple> inventory ,AppleCondition condition){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(condition.test(apple)){
				result.add(apple);
			}
		}
		return result;
	}
}
