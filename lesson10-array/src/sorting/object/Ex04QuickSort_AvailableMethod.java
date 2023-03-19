package sorting.object;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Comparator.*;
import java.util.function.Function;

import bean.Item;

public class Ex04QuickSort_AvailableMethod {
	public static void main(String[] args) {
		Item[] items = getItems();
		System.out.println("items --> " + Arrays.toString(items));
		
		// Arrays.sort(items, Item::getExpired);
		
		// Tăng dần theo salesPrice
		Arrays.sort(items, Comparator.comparing(Item::getExpired));
		Arrays.sort(items, compare(Item::getExpired));
		
		System.out.println("items --> " + Arrays.toString(items));
	}
	
	public static <R extends Comparable<R>> Comparator<Item> compare(Function<Item, R> function){
		return new Comparator<Item>() {
			@Override
			public int compare(Item o1, Item o2) {
				return function.apply(o1).compareTo(function.apply(o2));
			}
		};
		// return (i1, i2) -> fuction.apply(i1).compareTo(function.apply(i2))
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
