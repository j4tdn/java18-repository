package model;

import java.util.Arrays;
import java.util.List;

import bean.Apple;
import bean.Dish;
import bean.Dish.Kind;
import bean.Trader;
import bean.Transaction;

public class DataModel {
	
	private DataModel() {
		
	}
	
	public static List<Transaction> getTransactions() {
		Trader raoul = new Trader(1, "Raoul", "Cambridge");
		Trader mario = new Trader(2, "Mario", "Milan");
		Trader alan = new Trader(3, "Alan", "Cambridge");
		Trader brian = new Trader(4, "Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(
			new Transaction(55, brian, 2011, 300L),
			new Transaction(66, raoul, 2012, 1000L), 
			new Transaction(77, raoul, 2011, 400L),
			new Transaction(88, mario, 2012, 710L), 
			new Transaction(99, mario, 2012, 700L), 
			new Transaction(44, alan, 2012, 950L)
		);
		return transactions;
	}
	
	public static List<Apple> getApples() {
		return Arrays.asList(
				new Apple(1, "green", 200, "Vietnam"),	
				new Apple(16, "green", 300, "Vietnam"),	
				new Apple(22, "red", 300, "Lao"),	
				new Apple(4, "yellow", 400, "Thailand"),	
				new Apple(17, "red", 600, "Vietnam"),	
				new Apple(6, "green", 100, "Thailand")	
		);
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
				new Dish("8", "D8", 102, Kind.VEGGIE),
				new Dish("9", "D9", 123, Kind.VEGGIE));
	}
}
