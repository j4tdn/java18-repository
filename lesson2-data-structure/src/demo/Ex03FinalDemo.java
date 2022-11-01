package demo;

import bean.Item;

public class Ex03FinalDemo {

	public static void main(String[] args) {
		final int digit = 12;
		
		final Item i1 = new Item(1, "Item 1", 12);
		Item i2 = new Item(2,"Item 2", 123);
		
		i1.name = "Item xyz";
		System.out.println("i1 => " + i1);

	}

}
