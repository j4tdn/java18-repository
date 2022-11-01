package data.object;

import bean.Item;

public class Ex03DataStorage {

	public static void main(String[] args) {
		Item i1 = new Item(1, "Item1", 11);
		Item i2 = new Item(2, "Item2", 12);
		i1 = i2;
		i2 = i1;
		
		System.out.println("i1 -> " + i1);
		System.out.println("i2 -> " + i2);
		
		modify(i2);
		System.out.println("i2 -> " + i2);
		
		update(i2);
		System.out.println("i2 -> " + i2);
		

	}
	
	private static void  modify(Item item) {
		item.id = 99;
		item = new Item(77, "Item 77", 77);
		item.id = 88;
	}
	
	private static void update(Item item) {
		Item ic = item;
		item = new Item();
		item.id = 66;
		item.name = "Item88";
		item = ic;
		item.id = 22;
		
	}

}
