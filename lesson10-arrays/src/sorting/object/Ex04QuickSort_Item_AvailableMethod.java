 package sorting.object;

import java.time.LocalDate;
import java.util.Arrays;
import static java.util.Comparator.*;

import bean.Item;

public class Ex04QuickSort_Item_AvailableMethod {
	public static void main(String[] args) {
		Item[] items = getItems();
		System.out.println("items --> \n" + Arrays.toString(items));

		// Tăng dần theo salesPrice
		// (Item it) -> it.getSalesPrice() --> Item::getSalesPrice
		Arrays.sort(items, nullsFirst(comparing(Item::getSalesPrice)));
		System.out.println("items sorted sales price asc --> \n" + Arrays.toString(items));

		// Giảm dần theo expiredDate và tăng dần theo id
		Arrays.sort(items, nullsLast(comparing(Item::getExpiredDate, reverseOrder()).thenComparing(Item::getId)));
		System.out.println("items sorted expiredDate DESC & id ASC (when having the same expiredDate)  --> \n"
				+ Arrays.toString(items));
	}

	// A#x --> static method --> A::x
	// Tạo phương thức static method bất kỳ
	public static int sortItemDateAscIdDesc(Item i1, Item i2) {
		int expiredDateInt = i1.getExpiredDate().compareTo(i2.getExpiredDate());
		if (expiredDateInt == 0) {
			return i2.getId() - i1.getId();
		}
		return expiredDateInt;
	}

	private static Item[] getItems() {
		return new Item[] { 
				null,
				new Item(1, "Item A1", 252, LocalDate.of(2022, 10, 1)),
				new Item(2, "Item A2", 118, LocalDate.of(2023, 10, 10)),
				new Item(3, "Item B3", 222, LocalDate.of(2022, 11, 2)),
				new Item(4, "Item B4", 122, LocalDate.of(2022, 12, 4)),
				null,
				new Item(5, "Item H5", 958, LocalDate.of(2022, 7, 1)),
				new Item(6, "Item H6", 654, LocalDate.of(2023, 10, 10)),
				new Item(7, "Item C7", 475, LocalDate.of(2020, 8, 2)),
				new Item(8, "Item C8", 123, LocalDate.of(2020, 10, 8)),
				new Item(9, "Item W1", 768, LocalDate.of(2023, 10, 10)),
				new Item(10, "Item W2", 555, LocalDate.of(2019, 3, 12)) };
	}
}