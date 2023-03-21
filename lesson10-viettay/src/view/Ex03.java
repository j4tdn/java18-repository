package view;

import java.util.HashMap;
import java.util.Map;

import bean.Item;

/**
 Bài 3: Cho mảng lưu trữ danh sách các mặt hàng trong hệ thống. Biết ra mỗi mặt hàng
		bao gồm mã mặt hàng, tên mặt hàng, giá bán, mã cửa hàng
		Viết chương trình tìm mặt hàng có giá bán cao nhất của mỗi cửa hàng
		itemId name salesPrice storeId
		
		1 A 25 101
		2 B 90 102
		3 C 88 102
		4 D 40 101
		5 E 60 102
		6 F 18 101
 */
public class Ex03 {
	public static void main(String[] args) {
		Item[] items = getItems();
		find(items);
	}
	
	private static Item[] getItems() {
		return new Item[] {
				new Item(1, "A", 25, 101), 
				new Item(2, "B", 90, 102), 
				new Item(3, "C", 88, 102), 
				new Item(4, "D", 40, 101), 
				new Item(5, "E", 60, 102), 
				new Item(6, "F", 18, 101), 
		};
	}
	
	private static void find(Item[] items) {
		Map<Integer, Item> highestPricedItems = new HashMap<>();
		for (Item item : items) {
			if (!highestPricedItems.containsKey(item.getStoreId())) {
				highestPricedItems.put(item.getStoreId(), item);
			}
			else if (item.getSalesPrice() > highestPricedItems.get(item.getStoreId()).getSalesPrice()) {
				highestPricedItems.put(item.getStoreId(), item);
			}
		}
		for (Item item : highestPricedItems.values()) {
			System.out.println("Mặc hàng có giá bán cao nhất của cửa hàng " + item.getStoreId() + " là: "
					+ item.getName() + " với giá " + item.getSalesPrice() + "$");
        }
	}
	
}
