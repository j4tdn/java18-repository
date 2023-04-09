package collection.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex02VehicleModelSortedMap {
	public static void main(String[] args) {
		Map<Integer, String> vnVehicleModel = new TreeMap<>();
		vnVehicleModel.put(92, "Quảng Nam");
		vnVehicleModel.put(43, "Đà Nẵng");
		vnVehicleModel.put(75, "Thừa Thiên Huế");
		vnVehicleModel.put(74, "Quãng Trị");
		
		System.out.println("==================");
		printf(vnVehicleModel);
	}
	
//	private static Map<Integer, String> sorted(Map<Integer, String> map){
//		List<Entry<Integer, String>> sortedList = new ArrayList<>(map.entrySet());
//		//sortedList.sort(Comparator<>.);
//	}
//	
	private static void printf(Map<Integer, String> map) {
		// array, list --> for index, for each, iterate(iterable - collection)
		// map --> loop by key, value, entry
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for(Entry<Integer, String> entry: entrySet) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}
}
