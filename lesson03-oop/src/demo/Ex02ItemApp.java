package demo;

import bean.Item;

public class Ex02ItemApp {
	public static void main(String[] args) {
		// Object initialization and parameter passing
		Item item1 = new Item(001, "Item A", 21000d, "Vietnam");
		System.out.println("The first item  --> " + item1);

		Item item2 = new Item(002, "Item B", 5000d, "Finland");
		System.out.println("The second item --> " + item2);

		System.out.println("================================");

		// Calculate the total amount of 2 items and print it out
		double total = totalOfSalesPrice(item1, item2);
		System.out.println("The total of sales price of 2 items --> " + total);

	}

	// Write a function to calculate total of sales price of 2 items 
	private static double totalOfSalesPrice(Item item1, Item item2) {
		return item1.getSalesPrice() + item2.getSalesPrice();
	}

}
