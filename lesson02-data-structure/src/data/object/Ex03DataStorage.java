package data.object;

import bean.Item;

public class Ex03DataStorage {
	public static void main(String[] args) {
		Item i1 = new Item(1, "Item 1", 11);
		Item i2 = new Item(2, "Item 2", 12);
		
		System.out.println("i1 -> " + i1);
		System.out.println("i2 -> " + i2);
		
		
		i1 = i2;
		i2 = i1;
		System.out.println("i1 id: " + i1.id);
		
		modify(i1);
		System.out.println("modify i1 --> " + i1);
	}
	private static void update(Item item) {
		Item ic = item;
		item = new Item();
		item.id = 33;
		item.name = "Item 33";
		item = ic;
		item.id = 22;
	}
	private static void modify(Item item) {
		item.id = 99;
		item = new Item(77, "Item 77", 77d);
		item.id = 88;
	}
}
