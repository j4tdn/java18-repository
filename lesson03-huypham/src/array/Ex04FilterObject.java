package array;

import java.util.Arrays;

import been.Item;

public class Ex04FilterObject {
	public static void main(String[] args) {
		Item[] items = { new Item(1, "Item 1", 11), new Item(2, "Item 2", 22), new Item(3, "Item 3", 33)};
		
		Item[] ok = getItems(items);
		for (Item item : ok) {
			System.out.println(item);
		}
		System.out.println(Arrays.toString(getItems(items)));
	}
	
	private static Item[] getItems(Item[] items) {
		Item[] results = new Item[items.length];
		int count = 0;
		for (Item item : items) {
			if (item.salesPrice > 20) {
				results[count] = item;
				count++;
			}
		}
		return Arrays.copyOfRange(results, 0, count);
	}
}
