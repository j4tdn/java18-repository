package demo;

import bean.Item;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		final int digit = 12;
		// digit = 20; --> error
		// Object:
		final Item item1 = new Item(1, "Tra69", 345);
		final Item item2 = new Item(2, "Tra69to", 678);
		// item1 = item 2 --> error
		// Dù là const nhưng item1 và item 2 có thể thay đổi giá trị được, ví dụ
		// int item2Id = item2.id;
		// item1.id = item2Id;
		System.out.println("kjhkjhgkj");
		System.out.println(item1);

	}

}
