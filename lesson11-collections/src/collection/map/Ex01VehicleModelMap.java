package collection.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Ex01VehicleModelMap {
	/*
	Tạo map lưu trữ danh sách biển số xe theo tỉnh, thành phố tại VN
	+ Map<Integer, String> model = new HashMap, LinkedHashMap, TreeMap
	+ Thao tác cơ bản với put, putIfAbsent, get, getOrDefault
	+ Duyệt key, value, entry
	+ Phân biệt HashMap, LinkedHashMap, TreeMap
	  
	  HashMap
	     . Không duy trì thứ tự phần tử đưa vào
	     . Không hỗ trợ sort sẵn
	     . Key có thể chứa null
	  
	  LinkedHashMap
	     . Duy trì thứ tự phần tử đưa vào
	     . Không hỗ trợ sort sẵn
	     . Key có thể chứa null
	     
	  TreeMap
	     . Hỗ trợ tự động sort theo key(con của Comparable<K>)
	     . Key không thể chứa null --> NPE
	
	*/
	public static void main(String[] args) {
		System.identityHashCode(null);
		Map<Integer, String> vnVehicleModel = new LinkedHashMap<>();
		vnVehicleModel.put(92, "Quảng Nam"); // put(k, v) --> put(new Entry(k, v));
		vnVehicleModel.put(43, "Đà Nẵng");
		vnVehicleModel.put(75, "Thừa Thiên Huế");
		vnVehicleModel.put(null, "UDF");
		vnVehicleModel.put(74, "Quảng Trị");
		
		System.out.println("vnVehicleModel size --> " + vnVehicleModel.size());
		
		System.out.println("\n===================\n");
		printf(vnVehicleModel);
		
		vnVehicleModel.putIfAbsent(43, "ĐN");
		// Để kiểm tra phần tử NEW đã tồn tại trong map chưa
		// Duyệt từng phần tử trong map xem thử, nếu tồn tại phần tử nào đó
		// có hashcode trùng với hashcode của phần tử NEW và equals với NEW thì đã tồn tại
		// --> for (K k: ks) {
		//        if(k.hashcode() == NEW.hashcode() && k.equals(NEW)) {
		//            return true;
	    //        }
		//     }
		//     return false;
		
		System.out.println("\n===================\n");
		printf(vnVehicleModel);
		
		System.out.println("\n===================\n");
		System.out.println("get --> " + vnVehicleModel.get(73));
		System.out.println("getOrDefault --> " + vnVehicleModel.getOrDefault(73, "Unknown"));
		
	}
	
	private static void printf(Map<Integer, String> map) {
		// array, list --> for index, for each, iterate(iterable - collection)
		// map --> loop by key, value, entry
		Set<Integer> keySet = map.keySet();
		for (Integer key: keySet) {
			System.out.println(key + " --> " + map.get(key));
		}
	}
}