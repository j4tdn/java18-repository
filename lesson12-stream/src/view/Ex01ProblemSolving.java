package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import bean.Apple;
import model.Datamodel;

public class Ex01ProblemSolving {
	public static void main(String[] args) {
		List<Apple> inventory = Datamodel.getApples();
	}
	
	// 1st 2nd : find all green/red/color apples in his inventory
	public static List<Apple> findAppleByColor(List<Apple> inventory,String color){
		Objects.requireNonNull(color,color + "should not null");
		if(inventory.isEmpty()) {
			return Collections.emptyList();
		}
		List<Apple> result = new ArrayList<>();
		for(Apple apple:inventory) {
			if(color.equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}
	
	// 3rd: find all apples heavier than 150 g
	public static List<Apple> findAppleByWeight(List<Apple> inventory,double weight){
		Objects.requireNonNull(weight,weight + "should not null");
		if(inventory.isEmpty()) {
			return Collections.emptyList();
		}
		List<Apple> result = new ArrayList<>();
		for(Apple apple:inventory) {
			if(apple.getWeight()>weight) {
				result.add(apple);
			}
		}
		return result;
	}
	
	// 5th: find all apples that are green and heavier than 400 g
	public static List<Apple> findAppleByWeight(List<Apple> inventory,String color,double weight){
		Objects.requireNonNull(weight,weight + "should not null");
		if(inventory.isEmpty()) {
			return Collections.emptyList();
		}
		List<Apple> result = new ArrayList<>();
		for(Apple apple:inventory) {
			if(color.equals(apple.getColor()) && apple.getWeight()>weight) {
				result.add(apple);
			}
		}
		return result;
	}
	
}
