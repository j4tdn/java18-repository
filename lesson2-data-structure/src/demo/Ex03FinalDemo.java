package demo;

import bean.Item;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		// -------giá trị-----
		// final --> final ở STACK
		// primitive --> STACK
		final int digit = 12;
		// digit = 20;

		// Object --> HEAP
		final Item i1 = new Item(1, "Item 1", 123); // H1
		Item i2 = new Item(2, "Item 2", 123); // H2

		// i1 = i2;
		i1.name = "Item Xyz";
		System.out.println("i1 ==> " + i1);

	}

}
