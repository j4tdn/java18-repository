package demo;

import bean.Item;

public class Ex02ItemApp {

	public static void main(String[] args) {
		Item item1 = new Item(1, "Item1", 19, "USA");
		Item item2 = new Item(2, "Item2", 13.2, "China");
		
		System.out.println(item1);
		System.out.println(item2);
		System.out.println("--------------------------------------------------");
		System.out.println("==> Total: " + getTotal(item1, item2));

	}
	
	public static double getTotal(Item a, Item b) {
		return a.getSalePrice() + b.getSalePrice();
	}

}
