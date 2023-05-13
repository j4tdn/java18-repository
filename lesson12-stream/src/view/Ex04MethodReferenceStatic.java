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

public class Ex04MethodReferenceStatic {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		//anonymous function,lamda overide abstract method of functional interface with no name & arrow
		List <Apple> greenAndWeightApples =filterApples(inventory, Ex04MethodReferenceStatic::greenAndWeightApple
		);
		
		//methodReference dùng khi đoạn code lamda quá dài
		
		//overide for abstract method complex and lots of code
		//create a 'static method reference' represent for overide abstract method
		//+arbitrary name
		//+arbitrary place(class)
		//--> require input and output
		
		System.out.println("==GREEN AND WEIGHT APPLES==");
		greenAndWeightApples.forEach(System.out::println);
	}
	// static method reference
	// greenAndWeightApple --> overide Predicate's abstract method --> test
	private static boolean greenAndWeightApple(Apple apple) {
		return "green".equals(apple.getColor())&& apple.getWeight()>200;
	}
	
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
