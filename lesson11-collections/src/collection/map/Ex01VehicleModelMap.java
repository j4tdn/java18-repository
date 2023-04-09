package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01VehicleModelMap {
    public static void main(String[] args) {
        Map<Integer, String> vnVehicleModel = new HashMap<>();
        vnVehicleModel.put(43, "Da Nang"); // put (k,v) --> put(new Entry(k, v));
        vnVehicleModel.put(75, "Thua Thien Hue");
        vnVehicleModel.put(92, "Quang Nam");
        vnVehicleModel.put(74, "Quang Tri");

        System.out.println("size --> " + vnVehicleModel.size());
        printf(vnVehicleModel);
        System.out.println("\n===========================\n");
        vnVehicleModel.put(43, "DN");
        vnVehicleModel.putIfAbsent(43, "Ha Noi");
        // Để kiểm tra phần tử NEW đã tồn tại trong map chưa
        // Duyêt từng phần tử trong map xem thử, nếu tồn tại phần tử nào đó
        // có hashcode trùng với hashcode của phần tử NEW và equals với NEW
        // đã tồn tại
        // --> for(K k : ks){
        //      if(k.hashcode() == NEW.hashcode() && k.equals(NEW)){
        //          return true;
        //      }
        //      return false;
        // }
        printf(vnVehicleModel);
    }

    private static void printf(Map<Integer, String> map){
        // array. list --> for index, for each, iterate(iterable - collections)
        // map --> loop by key, value, entry
        Set<Integer> keySet = map.keySet();
        for(Integer key : keySet){
            System.out.println(key + " --> " + map.get(key));
        }
    }

}
