package exercise;

import java.util.Arrays;

import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = new Item[] {
			new Item(1, "A", 25, 101),	
			new Item(2, "B", 89, 101),	
			new Item(3, "C", 45, 102),	
			new Item(4, "D", 40, 101),	
			new Item(5, "E", 55, 102)	
		};
	
		Item[] newItem1 = new Item[items.length];
		Item[] newItem2 = new Item[items.length];
		
		int count1 = 0;
		int count2 = 0;
	
		for(int i = 0; i < items.length; i++) {
			if(items[i].getStoreId() == 101) {
				newItem1[count1] = items[i];
				count1++;
			} else {
				newItem2[count2] = items[i];
				count2++;
			}
		}
		
		Item[] result1 = Arrays.copyOfRange(newItem1, 0, count1);
		Item[] result2 = Arrays.copyOfRange(newItem2, 0, count2);
		System.out.println("mặt hàng có giá cao nhất cửa hàng 1: " + findItem(result1).toString());
		System.out.println("mặt hàng có giá cao nhất cửa hàng 2: " + findItem(result2).toString());
	}
	
	public static Item findItem(Item[] items) {
		for(int i = 1; i< items.length; i++) {
			if(items[i].getSalesPricel() > items[i-1].getSalesPricel()) {
				Item temp = items[i-1];
				items[i-1] = items[i];
				items[i] = temp;
			}
		}
		return items[0];
	}
}
