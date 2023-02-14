package demo;

import bean.Item;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		// -- value --
		// final --> final at STACK
		// primitive --> STACK
		final int digit = 12;
		// digit = 20; => cannot update value because of "final"

		// Object --> HEAP
		final Item i1 = new Item(1, "Item 1", 123); // H1
		Item i2 = new Item(2, "Item 2", 234); // H2

		// i1 = i2; => cannot update value because of "final"
		i1.name = "Item xyz";
		System.out.println("i1 ==> " + i1);

	}

}
