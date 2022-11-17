package structure.array;

import java.util.Arrays;

import bean.Item;

public class Ex04FilterObject {
	public static void main(String[] args) {
		Item[] items = {
			new Item(1, "Play Station", 210),
			new Item(2, "Xbox", 190),
			new Item(3, "ROG", 250),
		};
		
		System.out.println(Arrays.toString(findItems(items)));
	}
	
	private static Item[] findItems(Item[] items) {
		Item[] result = new Item[items.length];
		int count = 0;
		for(Item item : items) {
			if(item.getPrice() > 200) {
				result[count++] = item;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	
}
