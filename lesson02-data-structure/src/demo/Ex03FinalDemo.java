package demo;

import bean.Item;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		final int digit = 20;
		// digit = 12;

		final Item i1 = new Item(1, "Item 1", 123);
		Item i2 = new Item(2, "Item 2", digit);

		// i1 = i2;
		i1.name = "Item xyz";
		System.out.println("i1 ===> " + i1);
	}
}
