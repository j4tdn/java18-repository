package views;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import bean.Apple;
import model.DataModel;

public class Ex01ProblemSolving {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
	}
	 
	private static List<Apple> findApplesByColor(List<Apple> inventory, String color){
		Objects.requireNonNull(color, color + " should not be null!");
		if(inventory.isEmpty()) {
			return Collections.emptyList();
			
		}
		
		List<Apple> result = new ArrayList<Apple>();
		
		for(Apple apple:inventory) {
			if(color.equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}
	
	private static List<Apple> findApplesByCWeight(List<Apple> inventory, Double weight){
		if(inventory.isEmpty()) {
			return Collections.emptyList();
			
		}
		
		List<Apple> result = new ArrayList<Apple>();
		
		for(Apple apple:inventory) {
			if(apple.getWeight() > weight) {
				result.add(apple);
			}
		}
		return result;
	}
	
	private static List<Apple> findApplesByCWeight(List<Apple> inventory, String color, Double weight){
		Objects.requireNonNull(color, color + " should not be null!");
		if(inventory.isEmpty()) {
			return Collections.emptyList();
			
		}
		List<Apple> result = new ArrayList<Apple>();
		
		for(Apple apple:inventory) {
			if(apple.getWeight() > weight && color.equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}
}
