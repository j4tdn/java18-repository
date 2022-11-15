package demo;

import bean.Item;

public class Ex02ItemApp {
	public static void main(String[] args) {
		Item item1 = new Item(1, "item1", 2, "me");
		Item item2 = new Item(2, "item1", 4, "me");
		
		double t1 = totalSalesPrice(item1, item2);
		System.out.println("Total: " + t1);
		
		Item item3 = new Item(1, "item1", 2, "me");
		Item item4 = new Item(2, "item1", 4, "me");
		
		double t2 = totalSalesPrice(item1, item2);
		System.out.println("Total: " + t2);
	}
	
	private static double totalSalesPrice(Item item1, Item item2) {
		return item1.getSalePrice() + item2.getSalePrice();
	}
	

}
