package collection.list;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import static java.util.Comparator.*;

import bean.Store;

public class Ex03ArrayListFunctions {
	public static void main(String[] args) {
		// list, arraylist --> danh sách
		// add, remove, get, set
		//contains
		// sorting
		
		List<Store> stores = new ArrayList<>();
		stores.add(new Store(1, "S1", LocalDate.of(2017, 3, 17), 101));
		stores.add(new Store(2, "S2", LocalDate.of(2017, 8, 14), 102));
		stores.add(new Store(3, "S3", LocalDate.of(2017, 2, 20), 103));
		stores.add(new Store(4, "S4", LocalDate.of(2018, 6, 30), 104));
		stores.add(new Store(5, "S5", LocalDate.of(2017, 7, 10), 105));
		stores.add(new Store(6, "S6", LocalDate.of(2017, 6, 26), 106));
		
		stores.forEach(System.out::println);
		
		// REMOVE
		System.out.println("\n========== remove at index 4 ==========");
		stores.remove(4);
		stores.forEach(System.out::println);
		
		Iterator<Store> storeIterator = stores.iterator();
		while(storeIterator.hasNext()) {
			Store currentStore = storeIterator.next();
			if(currentStore.getStartedDate().isAfter(LocalDate.of(2017, 8, 14))) {
				storeIterator.remove();
			}
		}
		
		stores.forEach(System.out::println);
		
		// SORT
		stores.sort((o1, o2) -> o2.getWareHouseId() - o1.getWareHouseId());
		System.out.println("\n=======================================");
		stores.forEach(System.out::println);
		stores.sort(comparing(Store::getWareHouseId, reverseOrder())
				.thenComparing(Store::getStartedDate));
		System.out.println("\n=======================================");
		stores.forEach(System.out::println);
	}
}
