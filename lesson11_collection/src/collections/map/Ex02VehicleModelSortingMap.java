package collections.map;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex02VehicleModelSortingMap {
	public static void main(String[] args) {
		Map<Integer, String> vnVehicleModel = new TreeMap<>();
		vnVehicleModel.put(92, "Quảng Nam");
		vnVehicleModel.put(43, "Đà Nẵng");
		vnVehicleModel.put(37, "Nghệ An");
		vnVehicleModel.put(75, "Huế");
		vnVehicleModel.put(74, "Quảng Trị");
		printf(vnVehicleModel);
		System.out.println("======================");
		printf(sorted(vnVehicleModel));
		
		
		
	}
	private static Map<Integer, String> sorted(Map<Integer, String> map){
		// B1: map --> map.entrySet --> Set<Entry<K, V> --> convert to list --> List<Entry<K, V>>
		// B2: sort list of entries by K || V
		// B3: copy entries from sorted list into new map
		// B4: return new sorted map
//		List<Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
//		list.sort(Comparator.comparing(entry->entry.getValue()));
//		
//		Map<Integer, String> sortedMap = new LinkedHashMap<>();
//		list.forEach(entry -> {
//			sortedMap.put(entry.getKey(), entry.getValue());
//		});
//		
//		return sortedMap;
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
		for(Entry<Integer, String> entry:entrySet) {
			System.out.println(entry.getKey() + "--> " + entry.getValue());
		}
	}
}
