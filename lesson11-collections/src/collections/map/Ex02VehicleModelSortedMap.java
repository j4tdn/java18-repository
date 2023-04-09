package collections.map;

import static java.util.Comparator.comparing;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * TreeMap
 *   . Hỗ trợ hàm sort sẵn theo key (con của Comparable)
 *   . Key không có thể null (vì sort mà có null -> NPE)
 */

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex02VehicleModelSortedMap {
	public static void main(String[] args) {
		Map<Integer, String> vnVehicleModel = new TreeMap<>();
		vnVehicleModel.put(92, "Quảng Nam"); // put (k,v) --> put(new Entry(k,v));
		vnVehicleModel.put(43, "Đà Nẵng");
		vnVehicleModel.put(75, "Thừa Thiên Huế");
		vnVehicleModel.put(74, "Quảng Trị");
		
		System.out.println("============================");
		printf(vnVehicleModel);
		
		Map<Integer, String> sortedMap = sorted(vnVehicleModel);
		System.out.println("============================");
		printf(sortedMap);		
	}
	
	private static Map<Integer, String> sorted(Map<Integer, String> map) {
		// B1: map --> map.entrySet --> Set<Entry<K,V>
		// B2: entrySet --> convert to list --> List<Entry<K,V>>
		// B3: list sorts entry by K || V
		// B4: Copy entries from sortedList into new sortedMap
		// B5: Return new sortedMap
		
		/*
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		List<Entry<Integer, String>> list = new ArrayList<>();
		*/
		List<Entry<Integer, String>> sortedList = new ArrayList<>(map.entrySet());
		sortedList.sort(comparing(Entry::getValue));
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		sortedList.forEach(entry -> sortedMap.put(entry.getKey(), entry.getValue()));
		return sortedMap;
	}
	
	private static void printf(Map<Integer, String> map) {
		// array, list --> for index, for each, iterate(iterable - collenction)
		// map --> loop by key, value, entry
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}
}