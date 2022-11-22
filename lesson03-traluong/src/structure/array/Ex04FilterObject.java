package structure.array;

import java.util.Arrays;

import bean.Item;

public class Ex04FilterObject {

	public static void main(String[] args) {
		Item itemA = new Item(123, "Item 123", 790);
		Item itemB = new Item(234, "Item 234", 260);
		Item itemC = new Item(456, "Item 456", 100);
		
		Item[] items = {itemA, itemB, itemC};
		Item[] result = filter(items);
		System.out.println(Arrays.toString(result));
	}
	private static Item[] filter(Item[] items) {
		Item[] result = new Item[items.length];
		int count = 0;
		
		for (int i = 0; i < items.length; i++) {
			if(items[i].price > 200) {
				result[count] = items[i];
				count++;
			}
		}
		return Arrays.copyOfRange(result,0,count);
		
	}
}
