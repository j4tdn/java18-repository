package sorting.object;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

import bean.Item;

public class Ex03QuickSort_Item {
	public static void main(String[] args) {
		Item[] items = getItems();
		System.out.println("items --> \n" + Arrays.toString(items));

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
			public int compare(Item i1, Item i2) {
				return Double.compare(i1.getSalesPrice(), i2.getSalesPrice());
			}
		});
		System.out.println("items sorted sales price asc--> \n" + Arrays.toString(items));

		// tăng dần theo expiredDate và giảm dần theo id
		Arrays.sort(items, (i1, i2) -> {
			int expiredDateInt = i1.getExpiredDate().compareTo(i2.getExpiredDate());
			if (expiredDateInt == 0) {
				return i2.getId() - i1.getId();
			}
			return expiredDateInt;
		});
		
		System.out.println("items sorted expiredDate ASC, id DESC --> \n" + Arrays.toString(items));
		
		Arrays.sort(items, Ex03QuickSort_Item::sortItemDateAscDesc);
		System.out.println("items sorted expiredDate ASC, id DESC --> \n" + Arrays.toString(items));
		
	}

	
	public static int sortItemDateAscDesc(Item i1, Item i2) {
		int expiredDateInt = i1.getExpiredDate().compareTo(i2.getExpiredDate());
		if (expiredDateInt == 0) {
			return i2.getId() - i1.getId();
		}
		
		return expiredDateInt;
	}

	private static Item[] getItems() {
		return new Item[] {
			new Item(1,  "Item A1", 252, LocalDate.of(2023, 10, 10)),
			new Item(2,  "Item A2", 118, LocalDate.of(2021, 10, 1)),
			new Item(3,  "Item B3", 222, LocalDate.of(2022, 11, 2)),
			new Item(4,  "Item B4", 122, LocalDate.of(2022, 12, 4)),
			new Item(5,  "Item H5", 958, LocalDate.of(2022,  7, 1)),
			new Item(6,  "Item H6", 654, LocalDate.of(2023, 10, 10)),
			new Item(7,  "Item C7", 475, LocalDate.of(2020,  8, 2)),
			new Item(8,  "Item C8", 123, LocalDate.of(2020, 10, 8)),
			new Item(9,  "Item W1", 768, LocalDate.of(2023, 10, 10)),
			new Item(10, "Item W2", 555, LocalDate.of(2019,  3, 12)),

		};
	}
}