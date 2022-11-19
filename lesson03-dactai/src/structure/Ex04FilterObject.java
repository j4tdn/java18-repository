package structure;

import java.util.Arrays;

import javax.swing.text.AbstractDocument.LeafElement;

import bean.Item;

public class Ex04FilterObject {

	public static void main(String[] args) {
		Item itemA = new Item("123", "Item 123", "Green", 400);
		Item itemB = new Item("234", "Item 234", "Blue", 100);
		Item itemC = new Item("345", "Item 345", "Red", 90);
		Item[] items = {itemA,itemB,itemC};
		Item[] result = findItemLessThan200(items);
//		System.out.println(Arrays.toString(result));
		
		for(Item item:result) {
			System.out.println(item);
		}
	}
	
	// Tìm những mặt hàng có giá trị lướn hơn 200
	private static Item[] findItemLessThan200(Item[] items) {
		Item[] results = new Item[items.length];
		int count = 0;
		for(Item item:items) {
			if(item.getCost() < 200) {
				results[count] = item;
				count++;
			}
		}
		return Arrays.copyOfRange(results, 0, count);
	}

}
