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
				new Dish("7", "D7", 818, Kind.MEAT));
	}
	
	
	public static List<Apple> getAll(){
		return Arrays.asList(
				new Apple(1,"green",200d,"Vietnam"),
				new Apple(16,"green",300d,"Vietnam"),
				new Apple(22,"red",300d,"Lao"),
				new Apple(4,"yellow",400d,"Thailand"),
				new Apple(17,"red",600d,"Vietnam"),
				new Apple(6,"green",100d,"Thailand")
				);
	}
}
