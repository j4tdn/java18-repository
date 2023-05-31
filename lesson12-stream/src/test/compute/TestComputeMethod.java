package test.compute;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestComputeMethod {
	public static void main(String[] args) {
		// Thống kê danh sách store trong mỗi wh
		// 100 --> 101, 102, 103
		// 200 --> 201, 202
		// 400 --> 401
		
		final List<StoreDto> stores = mockData();
		
		// Cách 1
		final Map<Integer, Set<Integer>> whStoreListMap = new HashMap<>();
		for (StoreDto storeDto: stores) {
			final Integer whId = storeDto.getWhId();
			final Integer storeId = storeDto.getStoreId();
			if (whStoreListMap.get(whId) != null) {
				whStoreListMap.get(whId).add(storeId);
			} else {
				Set<Integer> v = new HashSet<>();
				v.add(storeId);
				whStoreListMap.put(whId, v);
			}
			
			/*
			Set<Integer> v = whStoreListMap.get(whId);
			if (v == null) {
				v = new HashSet<>();
				whStoreListMap.put(whId, v);
			}
			v.add(storeId);
			*/
		}
		System.out.println("whStoreListMap --> " + whStoreListMap);
		
		// Cách 2: Sử dụng hàm computeIfAbsent --> computIfValueAbsent
		final Map<Integer, Set<Integer>> whStoreListMap2 = new HashMap<>();
		
		for (StoreDto storeDto: stores) {
			final Integer whId = storeDto.getWhId();
			final Integer storeId = storeDto.getStoreId();
			whStoreListMap2.computeIfAbsent(whId, key -> new HashSet<>())
				.add(storeId);
		}
		System.out.println("\n\n\nwhStoreListMap2 --> " + whStoreListMap);
	}
	
	private static List<StoreDto> mockData() {
		return List.of(
				new StoreDto(101, "Store 101", 100),
				new StoreDto(102, "Store 102", 100),
				new StoreDto(103, "Store 103", 100),
				new StoreDto(201, "Store 201", 200),
				new StoreDto(202, "Store 202", 200),
				new StoreDto(401, "Store 401", 400)
		);
	}
}
