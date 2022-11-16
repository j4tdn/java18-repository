package demo;

import bean.Item;

public class Ex02ItemApp {
	public static void main(String[] args) {

		Item i1 = new Item(10, "abc", 1000, "xyz");
		Item i2 = new Item(12, "abcd", 1111, "wyz");
		Item i3 = new Item(15, "abc", 2222, "xyz");
		Item i4 = new Item(16, "abc", 3333, "xyz");

		System.out.println("total sales price of i1 and i2: " + Total(i1, i2));
		System.out.println("total sales price of i3 and i4: " + Total(i3, i4));

	}

	private static double Total(Item i1, Item i2) {
		return i1.getSalesPrice() + i2.getSalesPrice();
	}

}
