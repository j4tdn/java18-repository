package collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Ex01VehicleModalMap {
	/*
	 HashMap
	 	. Không duy trì thứ tự các phần tử đưa vào
	 	. Không hỗ trợ sort sẵn
	 	. Key có thể chứa null
	 	
	 LinkedHashMap
	    . Duy trì thứ tự các phần tử đưa vào
	 	. Không hỗ trợ sort sẵn
	 	. Key có thể chứa null
	 	
	 TreeMap
	 	. Hỗ trợ tự động sort theo key(con của Comparable<K>)
	 	. Key không thể chứa null --> NPE
	 */
	public static void main(String[] args) {
		Map<Integer, String> vnVeHicleModal = new LinkedHashMap<>();
		vnVeHicleModal.put(92, "Quảng Nam"); // put(k,v) --> put(new Entry(k,v));
		vnVeHicleModal.put(43, "Đà Nẵng");
		vnVeHicleModal.put(75, "Thừa Thiên Huế");
		vnVeHicleModal.put(null, "OK");
		vnVeHicleModal.put(74, "Quảng Trị");
		
		System.out.println("vnVeHicleModal Size --> " + vnVeHicleModal.size());
		System.out.println("================");
		printf(vnVeHicleModal);
		
		System.out.println("================");
		// vnVeHicleModal.put(43, "ĐN");
		vnVeHicleModal.putIfAbsent(43, "ĐN");
		// Để kiểm tra phần tử NEW đã tồn tại trong map chưa
		// Duyệt từng phần tử trong map xem thử, nếu tồn tại phần tử nào đó
		// có hashcode trùng với hashcode của phần tử NEW và equals với NEW thì đã tồn tại
		// --> for(K k: ks) {
		//       if(k.hashcode() == NEW.hashcode() && k.equals(NEW) {
		//			return true
		//		 }
	 	//		}
		// 		return false;
		
		printf(vnVeHicleModal);
		
		
		System.out.println("================");
		System.out.println("get --> " + vnVeHicleModal.get(73));
		System.out.println("getOrDefault --> " + vnVeHicleModal.getOrDefault(73, "Uknown"));
	}
	
	private static void printf(Map<Integer, String> map) {
		// array, list --> for index, for each, iterate(iterable - collection)
		// map --> loop by key, value, entry
		Set<Integer> keySet = map.keySet();
		for (Integer key: keySet) {
			System.out.println(key + "--> " + map.get(key));
		}
	}
}
