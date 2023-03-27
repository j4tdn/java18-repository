package collection.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import static java.util.Comparator.*;

public class Ex02VehicleModelSortedMap {
	
	/*
	 
	 TreeMap
	     . Hỗ trợ tự động sort theo key(con của Comparable<K>)
	     . Key không thể chứa null --> NPE
	 
	 */
	
	public static void main(String[] args) {
		Map<Integer, String> vnVehicleModel = new TreeMap<>();
		vnVehicleModel.put(92, "A Quảng Nam"); // put(k, v) --> put(new Entry(k, v));
		vnVehicleModel.put(43, "D Đà Nẵng");
		vnVehicleModel.put(75, "C Thừa Thiên Huế");
		// vnVehicleModel.put(null, "UDF");
		vnVehicleModel.put(74, "B Quảng Trị");
		
		System.out.println("===================");
		printf(vnVehicleModel);
		
		Map<Integer, String> sortedMap = sorted(vnVehicleModel);

		System.out.println("===================");
		printf(sortedMap);
	}
	
	private static Map<Integer, String> sorted(Map<Integer, String> map) {
		// B1: map --> map.entrySet --> Set<Entry<K, V> --> convert to list --> List<Entry<K, V>>
		// B2: sort list of entries by K || V
		// B3: copy entries from sorted list into new map
		// B4: return new sorted map
		List<Entry<Integer, String>> sortedList = new ArrayList<>(map.entrySet());
		sortedList.sort(comparing(Entry::getValue));
		
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
		for (Entry<Integer, String> entry: entrySet) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}
}
