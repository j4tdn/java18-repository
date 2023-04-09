package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * HashMap
 * 	. ko duy trì thứ tự phần tử đưa vào
 * 	. ko hỗ trợ sort sẵn
 * 	. key có thể null
 * 
 * LinkedHashMap
 * 	. duy trì thứ tự phần tử đưa vào
 * 	. ko hỗ trợ sort sẵn
 * 	. key có thể null
 * 
 * TreeMap
 * 	. hỗ trợ sort sẵn theo key
 * 	. key có thể null
 */

public class Ex01VehicleModeMap {
	public static void main(String[] args) {
		Map<Integer, String> vnVehicleModel = new HashMap<>();
		vnVehicleModel.put(92, "Quảng Nam");
		vnVehicleModel.put(43, "Đà Nẵng");
		vnVehicleModel.put(75, "Thừa Thiên Huế");
		vnVehicleModel.put(74, "Quãng Trị");
		
		System.out.println("vnVehicleModel size --> " + vnVehicleModel.size());
		
		System.out.println("\n==================\n");
		
		printf(vnVehicleModel);
		
		vnVehicleModel.putIfAbsent(43, "DN");
		// Để kiểm tra phần tử đã tồn tại trong map chưa
		// Duyệt từng phần tử trong map. Nếu tồn tại phần tử nào đó có hashcode
		// trùng với phần tử NEW và equals với NEW thì đã tồn tại
		// --> for( K k : ks){
		//		if(k.hashcode() == NEW.hashcode && k.equals(NEW)){
		//			return true;
		//		}
		//		return false;
		//	}
		
		System.out.println("\n==================\n");
		
		printf(vnVehicleModel);
		
		System.out.println("\n==================\n");
		System.out.println("get --> " + vnVehicleModel.get(74));
		System.out.println("getOrDefault --> " + vnVehicleModel.getOrDefault(77, "Unknow"));
		
		
	}
	
	private static void printf(Map<Integer, String> map) {
		// array, list --> for index, for each, iterate(iterable - collection)
		// map --> loop by key, value, entry
		Set<Integer> keySet = map.keySet();
		for(Integer key: keySet) {
			System.out.println(key + " --> " + map.get(key));
		}
	}
}
