package data.object;

import bean.Item;

public class Ex03DataStorage {
	public static void main(String[] args) {
		Item item1 = new Item(345,"Item 345",30d);
	}
	public static void modify(Item item) {
		item.id =99;
		item = new Item(77,"Item 77", 77d);
		item.id = 88;
	}
}
