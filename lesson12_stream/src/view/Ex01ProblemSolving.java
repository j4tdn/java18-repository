package view;

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
		Objects.requireNonNull(color, color + "should not be null !!!");
		if (inventory.isEmpty()) {
			return Collections.emptyList();
			
		}
		
		List<Apple> resuft = new ArrayList<>();
		for (Apple apple : inventory) {
			if (color.equals(apple.getColor())) {
				resuft.add(apple);
			}
		}
		
		return resuft;
	}
	
	private static List<Apple> findApplesByWeight(List<Apple> inventory, Double weight){
		if (inventory.isEmpty()) {
			return Collections.emptyList();
			
		}
		
		List<Apple> resuft = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getWeight() > weight) {
				resuft.add(apple);
			}
		}
		
		return resuft;
	}
	
	
	private static List<Apple> findApplesByWeight(List<Apple> inventory,String color, Double weight){
		if (inventory.isEmpty()) {
			return Collections.emptyList();
			
		}
		
		List<Apple> resuft = new ArrayList<>();
		for (Apple apple : inventory) {
			if (color.equals(apple.getColor()) && apple.getWeight() > weight) {
				resuft.add(apple);
			}
		}
		
		return resuft;
	}

}
