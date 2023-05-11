package model;

import java.util.Arrays;
import java.util.List;

import bean.Apple;
import bean.Dish;
import bean.Dish.Kind;

public class DataModel {
	
	private DataModel() {
	}
	
	public static List<Dish> getDishes() {
		return Arrays.asList(
				new Dish("1", "D1", 308, Kind.FISH),
				new Dish("2", "D2", 620, Kind.OTHER),
				new Dish("3", "D3", 329, Kind.OTHER),
				new Dish("4", "D4", 308, Kind.MEAT),
				new Dish("5", "D5", 480, Kind.MEAT),
				new Dish("6", "D6", 480, Kind.MEAT),
				new Dish("7", "D7", 818, Kind.MEAT),
				new Dish("8", "D8", 100, Kind.VEGGIE),
				new Dish("9", "D9", 102, Kind.VEGGIE));
	}
	
	public static List<Apple> getApples() {
		return Arrays.asList(
				new Apple(1, "blue", 200, "Vietnam"),	
				new Apple(16, "green", 300, "Vietnam"),	
				new Apple(22, "red", 300, "Lao"),	
				new Apple(4, "yellow", 400, "Thailand"),	
				new Apple(17, "red", 600, "Vietnam"),	
				new Apple(6, "green", 100, "Thailand")	
		);
	}
	
}
