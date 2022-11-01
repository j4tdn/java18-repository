package demo;

import bean.Item;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		// -- giá trị --
		// final -> final at Stack
		// không thể dùng toán tử = vì = ở Stack
		// primitive --> stack
		final int digit = 12;
		// digit = 20;

		// object --> Heap
		final Item i1 = new Item(1, "I1", 123);
		Item i2 = new Item(2, "I2", 456);

		// i1=12
		i1.name = "OK";
		System.out.println("i1 => " + i1);
	}
}
