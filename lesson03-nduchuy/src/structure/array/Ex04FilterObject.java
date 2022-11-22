package structure.array;

import java.util.Arrays;

import bean.Item;

public class Ex04FilterObject {
	public static void main(String[] args) {
		Item itemA = new Item(123,"Item 123",800);
		Item itemB = new Item(456,"Item 456",190);
		Item itemC = new Item(789,"Item 789",350);
		Item[] items = {itemA , itemB, itemC};
		Item[] result = filter(items);
		System.out.println(Arrays.toString(result));
	}
	private static Item[] filter(Item[] items) {
		Item[] result = new Item[items.length];
		int count=0;
		for(Item item: items) {
			if(item.getSalesPrice() > 200) {
				result[count]=item;
				count++;
			}
		}
		Item[] finalReslt = Arrays.copyOfRange(result, 0, count);
		return finalReslt;
	}
}
