package sorting.object;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import static java.util.Comparator.*;

import bean.Item;

public class Ex04QuickSort_AvailableMethod {
	public static void main(String[] args) {
		Item[] items = getItems();
		System.out.println("items --> \n" + Arrays.toString(items));
		
		// tăng dần theo salesPrice --> // (Item it) -> it.getSalesPrice() --> Item::getSalesPrice
		Arrays.sort(items, nullsFirst(comparing((Item item) -> item.getSalesPrice())));
		System.out.println("items sorted sales price asc--> \n" + Arrays.toString(items));
		
		// giảm dần theo expiredDate và tăng dần theo id
		Arrays.sort(items, nullsLast(comparing(Item::getExpiredDate, reverseOrder())
						  .thenComparing(Item::getId)));
		System.out.println("items sorted expiredDate ASC, id DESC --> \n" + Arrays.toString(items));
		
		Arrays.sort(items, Ex04QuickSort_AvailableMethod.compareManual(item -> item.getSalesPrice()));
	}
	
	public static <R extends Comparable<R>> Comparator<Item> compareManual(Function<Item, R> keyExtractor) {
		return (i1, i2) -> keyExtractor.apply(i1).compareTo(keyExtractor.apply(i2));
	}
	
	private static Item[] getItems() {
		return new Item[] {
			null,	
			new Item(1,  "Item A1", 252, LocalDate.of(2023, 10, 10)),
			new Item(2,  "Item A2", 118, LocalDate.of(2021, 10, 1)),
			new Item(3,  "Item B3", 222, LocalDate.of(2022, 11, 2)),
			null,
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
