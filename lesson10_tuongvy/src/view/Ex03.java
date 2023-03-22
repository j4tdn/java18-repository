package view;

import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item item1 = new Item("1", "A", 25, "101");
		Item item2 = new Item("--2", "B", 90, "102");
		Item item3 = new Item("3", "C", 88, "102");
		Item item4 = new Item("--4", "D", 40, "101");
		Item item5 = new Item("5", "E", 60, "102");
		Item item6 = new Item("6", "F", 18, "101");
		
		Item[] items = {item1, item2, item3, item4, item5, item6};
		salesPrice(items);
	}
	
	
	
	public static void salesPrice(Item[] items) {
		for (int i = 0; i < items.length; i++) {
			for (int j = i + 1; j < items.length; j++) {
				if (items[i].getStoreId() == items[j].getStoreId()) {
					Item[] items1;
				}
				}

			}
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - i - 1; j++) {
				Item i1 = items[i];
				Item i2 = items[i+1];
				if (i1.getSalesPrice() - i2.getSalesPrice() < 0) {
					Item temp = items[i];
					items[i] = items[i+1];
					items[i+1] = temp;
				}
			}
		}
		System.out.println(items[0]);
	}

}
