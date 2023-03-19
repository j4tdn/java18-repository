package sorting.object;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

import bean.Item;

public class Ex03QickSort_Item {
	public static void main(String[] args) {
		Item[] items = getItems();
		System.out.println("items --> " + Arrays.toString(items));
		
		// Sắp xếp mảng đối tượng -- Có 2 cách
		
		// Cách 1 --> Sử dụng Arrays.sort(Object[] objects) --> Comparable
		// Item phải là con(implement) của Comparable và override hàm compareTo của Comparable
		// Hạn chế ---> Việc sắp xếp phụ thuộc vào Item#compareTo
		// Item chỉ có duy nhất 1 hàm compareTo --> k thể hỗ trợ nhiều kiểu sort cùng lúc
		// cho mảng items
		
		// Muốn sorting theo id
		//                   name
		//                   expiredDate, id
		// Arrays.sort(items);
		// System.out.println("items sorted --> \n" + Arrays.toString(items));
		
		// Cách 2 --> Sử dung Arrays.sort(T[] ts, Comparator<T> comparator)
		// Idea: Việc sort ko phụ thuộc vào class Item, k cần override Comparable
		// Việc sort thế nào phụ thuộc vào Strategy Comparator interface
		// VD: sort mảng String --> T --> String
		
		// tăng dần theo salesPrice
		Arrays.sort(items, new Comparator<Item>() {
			@Override
			public int compare(Item o1, Item o2) {
				return Double.compare(o1.getSalesPrice(), o2.getSalesPrice());
			}
		});
		
		Arrays.sort(items, Ex03QickSort_Item::sortItem);
		
		System.out.println("items --> " + Arrays.toString(items));
	}
	
	private static Item[] getItems() {
		return new Item[] {
				new Item(1, "Item 1", 252, LocalDate.of(2022, 10, 01)),
				new Item(2, "Item 2", 118, LocalDate.of(2021, 07, 01)),
				new Item(3, "Item 3", 22, LocalDate.of(2022, 11, 01)),
				new Item(4, "Item 4", 145, LocalDate.of(2022, 02, 01)),
				new Item(5, "Item 5", 568, LocalDate.of(2020, 03, 10)),
				new Item(6, "Item 6", 231, LocalDate.of(2022, 11, 18)),
				new Item(7, "Item 7", 983, LocalDate.of(2021, 12, 01)),
				new Item(8, "Item 8", 131, LocalDate.of(2023, 10, 22)),
				new Item(9, "Item 9", 432, LocalDate.of(2023, 10, 20)),
		};
	}
	
	public static int sortItem(Item i1, Item i2) {
		int expiredDate = i1.getExpired().compareTo(i2.getExpired());
		if(expiredDate == 0) {
			return i2.getId() - i1.getId();
		}
		return expiredDate;
	}
}
