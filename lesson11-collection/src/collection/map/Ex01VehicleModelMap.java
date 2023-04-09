package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01VehicleModelMap {
	/*
	 * 
	 * 
	 * 
	 * HashMap: 
	 * 		. Không duy trì thứ tự phần tử đưa vào
	 * 		. Không hỗ trợ sort sẵn
	 * 		. Key có thể null
	 * LinkedHashMap
	 * 		. Duy trì thứ tự phần tử đưa vào
	 * 		. Không hỗ trợ sort sẵn
	 * 		. key có thể chứa null
	 * TreeMap
	 * 		. Hỗ trợ sort theo key (con của Comparable<K>)
	 * 		. key không thể chứa null --> NPE 
	 */
	public static void main(String[] args) {
		Map<Integer, String> vnVehicleModel = new HashMap<>();
		vnVehicleModel.put(92, "Quảng Nam"); //put(K,V) --> put(new Entry(K,V));
		vnVehicleModel.put(43, "Đà Nẵng");
		vnVehicleModel.put(75, "TT-Huế");
		vnVehicleModel.put(74, "Quảng Trị");
		
		vnVehicleModel.putIfAbsent(43, "ĐN");
		
		//Để kiểm tra phần tử đã tồn tại trong map chưa
		//Duyệt từng phần tử trong map, nếu tồn tại phần tử có hashcode trùng với
		//hascode phần tử cần NEW và equals với NEW thì đã tồn tại
		// for(K k:ks) {
		// 		if (h.hascode() == NEW.hascode() && k.equals(NEW) {
		//				return true;
		//		}
		//	}
		System.out.println("=======================");
		System.out.println("Size --> " + vnVehicleModel.size());
		printf(vnVehicleModel);
		
		System.out.println("=======================");
		System.out.println("get --> " + vnVehicleModel.get(74));
		System.out.println("getOrDefault --> " + vnVehicleModel.getOrDefault(73, "unknow"));
		
		
		
	}
	private static void printf(Map<Integer, String> map) {
		//array, list --> for index, for each, iterate(iterable - collection)
		//map --> loop by key, value, entry
		
		Set<Integer> keySet = map.keySet();
		for (Integer key:keySet) {
			System.out.println(key + " " + map.get(key));
		}
		
	}
}
