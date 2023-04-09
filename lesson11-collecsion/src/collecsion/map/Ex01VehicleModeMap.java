package collecsion.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01VehicleModeMap {
	public static void main(String[] args) {
		Map<Integer, String> vnVehicleModel = new HashMap<>();
		/*
		 * Hashmap 
		 * 
		 * không duy trì thứ tự phần tử đưa vào 
		 * Không hỗ trợ sort sẵn
		 * Key có thể chứa NUll
		 *
		 * */
		vnVehicleModel.put(92, "Quảng Nam");
		vnVehicleModel.put(43, "Đà Nẵng");
		vnVehicleModel.put(75, "Thừa Thiên Huế");
		vnVehicleModel.put(74, "Quảng Trị");
		
		System.out.println("vnVehicleModel size --> " + vnVehicleModel.size());
		
		printf(vnVehicleModel);
		
		System.out.println("===========");
		vnVehicleModel.putIfAbsent(43, "ĐN");
		
		printf(vnVehicleModel);
	}
	
	private static void printf(Map<Integer, String> map) {
		Set<Integer> keySet = map.keySet();
		for(Integer key : keySet) {
			System.out.println(key +" "+map.get(key));
		}
	}
}
