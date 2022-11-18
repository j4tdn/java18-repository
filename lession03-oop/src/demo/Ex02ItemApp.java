package demo;

import bean.Item;

public class Ex02ItemApp {
	public static void main(String[] args) {
		Item item1 = new Item(1, "Item 1", 12.5, "My");
		Item item2 = new Item(2, "Item 2", 15.7, "Phap");
		System.out.println("TT của item1, item 2: " + totalOfSalePrice(item1, item2));
		
		Item item3 = new Item(3, "Item 3", 120, "My");
		Item item4 = new Item(4, "Item 4", 157, "Phap");
		System.out.println("TT của item3, item4: " + totalOfSalePrice(item3, item4));
		
		double t3 = item3.plusSalesPrice(item4);
		System.out.println("TT của item3, item4: " + t3);
	}
	
	private static double totalOfSalePrice(Item item1, Item item2) {
		return item1.getSalesPrice() + item2.getSalesPrice();
	}
}
