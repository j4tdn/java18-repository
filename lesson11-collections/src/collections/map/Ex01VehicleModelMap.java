package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Tạo map lưu trữ danh sách biển số xe theo tỉnh, thành phố tại VN
 * - Map <Integer, String> model = new HashMap, LinkedHashMap, TreeMap
 *   + HashMap
 *     . Không duy trì thứ tự phần tử đưa vào 
 *     . Không hỗ trợ hàm sort sẵn 
 *     . Key có thể chứa null 
 *   + LinkedHashMap
 *     . Duy trì thứ tự phần tử đưa vào 
 *     . Không hỗ trợ hàm sort sẵn 
 *     . Key có thể chứa null   
 *   + TreeMap
 *     . Hỗ trợ hàm sort sẵn theo key (con của Comparable)
 *     . Key không có thể null (vì sort mà có null -> NPE)
 * - Thao tác cơ bản với put, putIfAbsent, get, getOrDefault
 * - Duyệt key, value, entry
 * - Phân biệt HashMap, LinkedHashMap, TreeMap
 */

public class Ex01VehicleModelMap {
	public static void main(String[] args) {
		Map<Integer, String> vnVehicleModel = new HashMap<>();
		vnVehicleModel.put(92, "Quảng Nam"); // put (k,v) --> put(new Entry(k,v));
		vnVehicleModel.put(43, "Đà Nẵng");
		vnVehicleModel.put(75, "Thừa Thiên Huế");
		vnVehicleModel.put(74, "Quảng Trị");
		
		System.out.println("vnVehicleModel size --> " + vnVehicleModel.size());
		System.out.println("\n=========================\n");
		printf(vnVehicleModel);
		
		vnVehicleModel.putIfAbsent(43, "DN"); // đã có rồi thì thôi, ko ghi đè lên như put()
		/* Idea
		 * Để kiểm tra phần tử NEW đã tồn tại trong map chưa
		 * ↓
		 * Duyệt từng phần tử trong map. 
		 *  + Nếu phần tử nào có hashcode trùng với hashcode của phần tử NEW
		 *  + Và equals với NEW
		 * ==> đã tồn tại
		 * 
		 * 	for (K k : ks) {
		 * 		if(k.hashcode() == NEW.hashcode && k.equals(NEW)) {
		 * 			return true;
		 *		 }
		 * 	}
		 * 	return false;
		 */
		
		System.out.println("\n=========================\n");
		System.out.println("get --> " + vnVehicleModel.get(74)); // có thì get giá trị, ko thì trả về null --> dễ bị NPE
		System.out.println("getOrDefault --> " + vnVehicleModel.getOrDefault(74, "Unknown")); // có thì get giá trị, ko thì trả về default message (hạn chế NPE)
		
		
	}
	
	private static void printf(Map<Integer, String> map) {
		// array, list --> for index, for each, iterate(iterable - collenction)
		// map --> loop by key, value, entry
		Set<Integer> keySets = map.keySet();
		for (Integer key : keySets) {
			System.out.println(key + " --> " + map.get(key));
		}
	}

}
