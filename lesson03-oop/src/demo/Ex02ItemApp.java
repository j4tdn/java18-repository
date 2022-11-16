package demo;

import bean.Item;

public class Ex02ItemApp {
	public static void main(String[] args) {
		Item item1 = new Item(101, "PS5", 200, "Japan");
		Item item2 = new Item(102, "Xbox", 190, "America");
		
		// System.out.println("Item1 infor --> " + item1.toString());
		// System.out.println("Item2 infor --> " + item2.toString());
		
		System.out.println("Sum price --> " + totalOfSalesPrice(item1, item2));
		
	}
	
	private static double totalOfSalesPrice(Item item1, Item item2) {
		return item1.getSalesPrice() + item2.getSalesPrice();
	}
}
