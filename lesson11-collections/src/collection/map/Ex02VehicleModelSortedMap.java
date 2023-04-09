package collection.map;

import java.util.*;

public class Ex02VehicleModelSortedMap {
    public static void main(String[] args) {
        Map<Integer, String> vnVehicleModel = new LinkedHashMap<>();
        vnVehicleModel.put(43, "Da Nang"); // put (k,v) --> put(new Entry(k, v));
        vnVehicleModel.put(75, "Thua Thien Hue");
        vnVehicleModel.put(92, "Quang Nam");
        vnVehicleModel.put(74, "Quang Tri");

        System.out.println("=======================");
        printf(vnVehicleModel);
    }

    private static Map<Integer, String> sorted(Map<Integer, String> map){
        // B1 : Map --> map.entrySet --> Set<Entry<K, V>>
        // B2 : entrySet --> convert to List --> List<Entry<K, V>>
        // B3 : list sorts entry by K || V
        // B4 : copy entries from sorted list into new map
        // B5 : return new sorted map
        List<Map.Entry<Integer, String>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort(Comparator.comparing(Map.Entry::getValue));
        Map<Integer, String> sortedMap = new LinkedHashMap<>();
        sortedList.forEach(entry -> {
            sortedMap.put(entry.getKey(), entry.getValue());
        });
        return sortedMap;
    }

    private static void printf(Map<Integer, String> map){
        // array. list --> for index, for each, iterate(iterable - collections)
        // map --> loop by key, value, entry
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for(Map.Entry<Integer, String> entry : entrySet){
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }
}
