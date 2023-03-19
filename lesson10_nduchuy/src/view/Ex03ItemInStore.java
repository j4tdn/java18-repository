package view;

import java.util.ArrayList;
import java.util.List;

import bean.Item;

public class Ex03ItemInStore {
	public static void main(String[] args) {
		List<Item> itemList = new ArrayList<>();
		itemList.add(new Item(1, "s1", 25, 101));
		itemList.add(new Item(2, "s2", 90, 102));
		itemList.add(new Item(3, "s3", 88, 102));
		itemList.add(new Item(4, "s4", 40, 101));
		itemList.add(new Item(5, "s5", 60, 102));
		itemList.add(new Item(6, "s6", 18, 101));
		
		Item maxCostItem = itemList.get(1);
		for (Item item : itemList) {
			if(maxCostItem.getSalesPrice() < item.getSalesPrice()) {
				maxCostItem = item;
			}
		}
		System.out.println(maxCostItem);
	}
}
