package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import bean.Apple;
import functional.test;
import model.DataModel;

public class Ex01 {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getAll();
		List<Integer> integers = find(inventory, a -> a.getId());
		integers.forEach(a -> System.out.println(a));
		
		
	}
	private static List<Apple> findApplesBycolor(List<Apple> inventory , String color){
		//Objects.requireNonNull(null);
		if(inventory.isEmpty()) {
			return Collections.emptyList();
		}
		List<Apple> result = new ArrayList<>();
		
		for(Apple apple : inventory) {
			if(color.equals(apple.getColor())){
				result.add(apple);
			}
		}
		return result;
		
	}
	
	private static List<Integer> find(List<Apple> a , test<Apple, Integer> test){
		List<Integer> i = new ArrayList<>();
		for(Apple apple : a) {
			i.add(test.content(apple));
		}
		return i;
	}
}
