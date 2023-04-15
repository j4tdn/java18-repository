package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01VehicleModalMap {
	/*
	 * Tạo map lưu trữ danh sách biển số xe theo tỉnh, thành phố VN
	 * Map<Integer, String> model = new HashMap, LinkedHashMap, Tree Map
	 * Thao tác cơ bản với put, putIfAbsent, get, getOrDefault
	 * 
	 * + Phân biệt HashMap, LinkedHashMap, TreeMap
	  
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
		Map<Integer, String> vnVehicleModel = new HashMap<>();
		vnVehicleModel.put(92, "Quảng Nam");
		vnVehicleModel.put(43, "Đà Nẵng");
		vnVehicleModel.put(37, "Nghệ An");
		vnVehicleModel.put(75, "Huế");
		vnVehicleModel.put(74, "Quảng Trị");
		
		System.out.println("Map size -->"+ vnVehicleModel.size());
		printf(vnVehicleModel);
		
		vnVehicleModel.putIfAbsent(43, "DN");
		// Để kiểm tra phần tử NEW đã tồn tại trong map chưa
		// Duyệt từng phần tử trong map xem thử, nếu tồn tại phần tử nào đó
		// có hashcode trùng với hashcode của phần tử NEW và equals với NEW thì đã tồn tại
		// --> for (K k: ks) {
		//        if(k.hashcode() == NEW.hashcode() && k.equals(NEW)) {
		//            return true;
	    //        }
		//     }
		//     return false;
		
		System.out.println("Map size -->"+ vnVehicleModel.size());
		printf(vnVehicleModel);
		
		System.out.println(vnVehicleModel.get(74));
		System.out.println(vnVehicleModel.getOrDefault(74,"Unknown"));
	}   
	private static void printf(Map<Integer, String> map) {
		// array, list --> for index, for each, iterate(iterable - collection)
		// map --> loop by key, value, entry
		Set<Integer> keySet = map.keySet();
		for(Integer key:keySet) {
			System.out.println(key + "--> " + map.get(key));
		}
	}
}
