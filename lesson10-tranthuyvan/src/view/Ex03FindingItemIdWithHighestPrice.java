package view;

import bean.Item;

/**
 * Cho mảng lưu trữ danh sách các mặt hàng trong hệ thống. 
 * Biết ra mỗi mặt hàng bao gồm mã mặt hàng, tên mặt hàng, giá bán, mã cửa hàng
 * Viết chương trình tìm mặt hàng có giá bán cao nhất của mỗi cửa hàng
 */

public class Ex03FindingItemIdWithHighestPrice {
	public static void main(String[] args) {
		Item[] items = getItems();
		System.out.println("The most expensive item is --> " + getmostExpensiveItem(items, getHighestPrice(items)));
	}

	private static Item[] getItems() {
		Item i1 = new Item(101, 1, "Item A", 25);
		Item i2 = new Item(102, 2, "Item B", 90);
		Item i3 = new Item(102, 3, "Item C", 88);
		Item i4 = new Item(101, 4, "Item D", 40);
		Item i5 = new Item(102, 5, "Item E", 60);
		Item i6 = new Item(101, 6, "Item F", 18);
		return new Item[] { i1, i2, i3, i4, i5, i6 };
	}

	private static double getHighestPrice(Item[] items) {
		double highestPrice = Double.MIN_VALUE;
		for (Item item : items) {
			if (item.getSalesPrice() > highestPrice) {
				highestPrice = item.getSalesPrice();
			}
		}
		return highestPrice;
	}

	private static Item getmostExpensiveItem(Item[] items, double highestPrice) {
		if (items == null || items.length == 0) {
			System.out.println("items and the length of items cannot be null!!!");
		}

		Item mostExpensiveItem = items[0];
		for (int i = 0; i < items.length; i++) {
			if (items[i].getSalesPrice() == highestPrice) {
				mostExpensiveItem = items[i];
			}
		}
		return mostExpensiveItem;
	}
}