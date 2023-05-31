package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StoreService {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		final Integer whAllocationAmount = 300;
		final List<Store> selectedStores = getStores().stream()
				.filter(store -> Boolean.TRUE.equals(store.getSelected())).collect(Collectors.toList());
		//Map chứa dữ liệu gốc của store dùng để tham chiếu
		
		
		
		Map<Long, Integer> storeAllocatedAmouts = doAllocation(whAllocationAmount, selectedStores);
		//storeAllocatedAmouts.entrySet().stream().forEach(System.out::println);
		
		
		
	}

	private static List<Store> getStores() {
		// Store(storeId, referenceStoreId, stockPreviousDay, expectedSales, isSelected)
		return Arrays.asList(
				new Store(1L, null, bd(18), bd(40), Boolean.TRUE),
				new Store(2L, null, bd(19), bd(20), Boolean.TRUE), 
				new Store(3L, null, bd(21), bd(17), Boolean.TRUE),
				new Store(4L, null, bd(14), bd(31), Boolean.TRUE), 
				new Store(5L, null, bd(14), bd(10), Boolean.TRUE),
				new Store(6L, null, bd(15), bd(30), Boolean.TRUE), 
				new Store(7L, 2L,   bd(15), null, Boolean.TRUE),
				new Store(8L, null, bd(12), bd(19), Boolean.TRUE), 
				new Store(9L, null, bd(17), bd(26), Boolean.TRUE),
				new Store(10L, 7L, bd(18), null, Boolean.TRUE), 
				new Store(11L, null, bd(22), null, Boolean.FALSE));
	}

	private static BigDecimal bd(long value) {
		return BigDecimal.valueOf(value);
	}

	/**
	 * Do Allocation.
	 * 
	 * Key: storeId with Long type Value: storeAllocatedAmount after calculation
	 * with 4 steps
	 * 
	 * @return map of storeId, storeAllocatedAmount
	 */
	private static Map<Long, Integer> doAllocation(Integer whAllocationAmount, List<Store> stores) {
		
		
		// Step 1: Filling in missing expected sales
		Map<Long, BigDecimal> refMap = new HashMap<>();
		for(Store st:stores) {
			refMap.put(st.getStoreId(), st.getExpectedSales());
		}
		
		
		// Thực hiện các bước tính toán
		
		List<Store> StoresWithNoExpectedSale = stores.stream()
												.filter(store -> store.getExpectedSales() == null)
												.collect(Collectors.toList());
		//Step 1
		//Handle case 1
		
		//StoresWithNoExpectedSale.forEach(System.out::println);
		//Tìm những store thiếu expected sales value và có reference store id
		//Lấy ra expectedSales từ id đó và gán vào Store trên
		for(Store st :StoresWithNoExpectedSale) {
			if (st.getReferenceStoreId() != null) {
				for(Store selectedSt: stores) {
						if (st.getReferenceStoreId().equals(selectedSt.getStoreId())) {
							for (Map.Entry<Long, BigDecimal> entry : refMap.entrySet()) {
					            if ((st.getReferenceStoreId().equals(entry.getKey())) && (entry.getValue() != null)) {
					            	st.setExpectedSales(selectedSt.getExpectedSales());
					            }
					        }
						}
					}				
				}
			}
		//Handle case 2
		//Kiểm tra những store còn thiếu expectedSales
		StoresWithNoExpectedSale = stores.stream()
				.filter(store -> store.getExpectedSales() == null)
				.collect(Collectors.toList());
		//Bước 1: Kiểm tra xem store còn thiếu này có thoả mãn điều kiện case 2 không
		// --> no reference store
		// --> reference store has no expected sales
		// Duyệt store không có expected sale
		// Nếu store có refStor thì duyệt tìm ref store trong map, sau đó lấy ra expected sale
		for (Store st:StoresWithNoExpectedSale) {
			BigDecimal expectedSale = null;
			if (st.getReferenceStoreId() != null) {
				for (Map.Entry<Long, BigDecimal> entry : refMap.entrySet()) {
		            if (st.getReferenceStoreId().equals(entry.getKey())) {
		            	expectedSale = entry.getValue();
		            }
		        }
			}
			if (((st.getReferenceStoreId() == null) && st.getExpectedSales() == null)
				|| (expectedSale == null))
			{
				Double sum = 0d;
				Integer count = 0;
				for (Map.Entry<Long, BigDecimal> entry : refMap.entrySet()) {
					
					if (entry.getValue() != null) {
						count++;
						sum+=  entry.getValue().doubleValue();	
					}
				}
				sum /= (double) count;
				BigDecimal expectedSales =  BigDecimal.valueOf(sum).setScale(1, RoundingMode.HALF_UP);
				st.setExpectedSales(expectedSales);
			}
		}
		
		//Step 2
		Map<Long, BigDecimal> AllocationKeyMap = new HashMap<>();
		BigDecimal sumOfExpectedSale = new BigDecimal("0") ;
		BigDecimal sum = bd(0);
		for(Store st:stores) {
			sum = sum.add(st.getExpectedSales());
		}
		
		for(Store st:stores) {
			AllocationKeyMap.put(st.getStoreId(), st.getExpectedSales().divide(sum, 10, RoundingMode.HALF_DOWN));
		}
		//In kiểm tra

		
		//step 3
		
		Map<Long, BigDecimal> allocationAmount = new HashMap<>();
		
		//Calcualte sum of stock
		BigDecimal sumOfStock = BigDecimal.ZERO;
		for (Store st:stores) {
			sumOfStock = sumOfStock.add(st.getStockPreviousDay());
		
		}
		
		
		for (Store store:stores) {
			BigDecimal amount = bd(0);
			
			for (Map.Entry<Long, BigDecimal> entry : AllocationKeyMap.entrySet()) {
				if (store.getStoreId().equals(entry.getKey())) {
					BigDecimal allocate = bd(0);
					allocate = entry.getValue();
					amount = BigDecimal.valueOf(whAllocationAmount);
					amount = amount.add(sumOfStock);
					amount = amount.multiply(entry.getValue());
					amount = amount.subtract(store.getStockPreviousDay());
					amount = amount.setScale(0, RoundingMode.HALF_DOWN);
					
				}
				allocationAmount.put(store.getStoreId(), amount);
			}
		}
		
		//Step 4
		
		Map<Long, BigDecimal> demandMap = new HashMap<>();
		for (Store store:stores) {
			BigDecimal exepectedSale = store.getExpectedSales();
			BigDecimal stockPre = store.getStockPreviousDay();
			BigDecimal result = bd(0);
			result = result.add(exepectedSale);
			result = result.subtract(stockPre);
			if (result.compareTo(bd(0)) < 0) {
				result = bd(0);
			}
			demandMap.put(store.getStoreId(), result);
		}
		
		//In ra kết quả
		for (Map.Entry<Long, BigDecimal> entry : allocationAmount.entrySet()) {
			System.out.println("Store " + entry.getKey() + " " + " Allocated amount " + entry.getValue());
            
        }

		return null;
	}
}