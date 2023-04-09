package collection.map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import static java.util.Comparator.*;

public class Ex02VehicleModelSortedMap {
	/*
	 * TreeMap 
	 *  . Hỗ trợ tự động sort theo key(con của Comparable<K>) . 
	 *  . Key không thể chứa null --> NPE
	 */
	public static void main(String[] args) {
		Map<Integer, String> vnVeHicleModal = new TreeMap<>();
		vnVeHicleModal.put(92, "A Quảng Nam"); // put(k,v) --> put(new Entry(k,v));
		vnVeHicleModal.put(43, "B Đà Nẵng");
		vnVeHicleModal.put(75, "C Thừa Thiên Huế");
		vnVeHicleModal.put(74, "D Quảng Trị");
		// vnVeHicleModal.put(null, "OK");

		System.out.println("=========");
		printf(vnVeHicleModal);

		Map<Integer, String> sortedMap = sorted(vnVeHicleModal);
		System.out.println("=========");
		printf(sortedMap);
	}

	private static Map<Integer, String> sorted(Map<Integer, String> map) {
		// B1: map --> map.entrySet --> Set<Entry<K, v>> --> convert to list -->
		// List<Entry<K,V>>
		// B2: sort list of entries by K || V
		// B3: copy entries form sorted list in to new map
		// B4: return new sorted map
		List<Entry<Integer, String>> sortedList = new ArrayList<>(map.entrySet());
		sortedList.sort((comparing(Entry::getValue)));

		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		sortedList.forEach(entry -> {
			sortedMap.put(entry.getKey(), entry.getValue());
		});
		return sortedMap;
	}

	private static void printf(Map<Integer, String> map) {
		// array, list --> for index, for each, iterate(iterable - collection)
		// map --> loop by key, value, entry
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + "--> " + entry.getValue());
		}
	}
}
