package demo;

import bean.Item;

public class Ex02ItemApp {
	public static void main(String[] args) {

		Item Item1 = new Item(1, "Item 1", 100, "VietNam");
		Item Item2 = new Item(2, "Item 2", 200, "Lao");
		double t1 = totalOfSalesPrice(Item1, Item2);
		System.out.println("TT của item1, item2 ==> " + t1);

		Item Item3 = new Item(3, "Item 3", 150, "VietNam");
		Item Item4 = new Item(4, "Item 4", 250, "Lao");
		double t2 = totalOfSalesPrice(Item3, Item4);
		System.out.println("TT của item3, item4 ==> " + t2);
	}

	private static double totalOfSalesPrice(Item item1, Item item2) {
		return item1.getsalesPrice() + item2.getsalesPrice();

	}
}
