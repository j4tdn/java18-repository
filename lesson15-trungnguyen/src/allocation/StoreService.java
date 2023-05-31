package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StoreService {

	public static void main(String[] args) {
		final Integer whAllocationAmount = 300;
		final List<Store> selectedStores = getStores().stream()
				.filter(store -> Boolean.TRUE.equals(store.getSelected())).collect(Collectors.toList());

		// Thực hiện các bước tính toán
		
	
		Map<Store, BigDecimal> storeAllocatedAmouts = doAllocation(whAllocationAmount, selectedStores);
		storeAllocatedAmouts.entrySet().stream().forEach(System.out::println);

	}

	private static List<Store> getStores() {
		// Store(storeId, referenceStoreId, stockPreviousDay, expectedSales, isSelected)
		return Arrays.asList(new Store(1L, null, bd(18), bd(40), Boolean.TRUE),
				new Store(2L, null, bd(19), bd(20), Boolean.TRUE), new Store(3L, null, bd(21), bd(17), Boolean.TRUE),
				new Store(4L, null, bd(14), bd(31), Boolean.TRUE), new Store(5L, null, bd(14), bd(10), Boolean.TRUE),
				new Store(6L, null, bd(15), bd(30), Boolean.TRUE), new Store(7L, 2L, bd(15), null, Boolean.TRUE),
				new Store(8L, null, bd(12), bd(19), Boolean.TRUE), new Store(9L, null, bd(17), bd(26), Boolean.TRUE),
				new Store(10L, 7L, bd(18), null, Boolean.TRUE), new Store(11L, null, bd(22), null, Boolean.FALSE));
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
	private static Map<Store, BigDecimal> doAllocation(Integer whAllocationAmount, List<Store> stores) {

		// Step 1: Filling in missing expected sales
		List<Store> StoresHasNullExpectedSales = stores.stream()
				.filter(store -> store.getExpectedSales() == null).collect(Collectors.toList());
		Map<Long, BigDecimal> mapsp1 = new HashMap<>();
		for (Store st : stores) {
			mapsp1.put(st.getStoreId(), st.getExpectedSales());
		}
		for (Store st : StoresHasNullExpectedSales) {
			if (st.getReferenceStoreId() != null) {
				for (Store s : stores) {
					if (s.getStoreId().equals(st.getReferenceStoreId())) {
						for (Map.Entry<Long, BigDecimal> entry : mapsp1.entrySet()) {
							if ((st.getReferenceStoreId().equals(entry.getKey())) && (entry.getValue() != null)) {
								st.setExpectedSales(s.getExpectedSales());

							} else if ((st.getReferenceStoreId().equals(entry.getKey())) && (entry.getValue() == null)) {
								int count = 0;
								BigDecimal a = bd(0);
								for (Store ss : stores) {
									if (ss.getStoreId() != st.getStoreId()
											&& ss.getStoreId() != st.getReferenceStoreId()
											&& ss.getExpectedSales() != null) {
										count++;
										a = a.add(ss.getExpectedSales());

									}
									BigDecimal b = new BigDecimal(count);
									st.setExpectedSales(a.divide(b, RoundingMode.HALF_DOWN));
								}
							}
						}

					}
				}
			}
		}
				
			
       for ( Store sl : stores) {
    	   for(Store st : StoresHasNullExpectedSales) {
    		   if(sl.getStoreId().equals(st.getStoreId())) {
    			   sl=st;
    		   }
    	   }
       }

		// Step 2: Calculate Allocation Key
       BigDecimal sum = bd(0);
       for(Store s2 : stores) {
    	   sum = sum.add(s2.getExpectedSales());
       }
       Map<Store, BigDecimal> mapsp2 = new HashMap<>();
       for (Store st : stores) {
			mapsp2.put(st, st.getExpectedSales().divide(sum, 10, RoundingMode.HALF_DOWN));
		}
       
		// Step 3: Calculate Allocated Amount
       BigDecimal xxx = bd(300);
       BigDecimal sum2 = bd(0);
       for(Store s3 : stores) {
    	   sum2 = sum2.add(s3.getStockPreviousDay());
       }
       Map<Store, BigDecimal> mapsp3 = new HashMap<>();
       for (Store st : stores) {
			mapsp3.put(st, null);
		}
       for (Map.Entry<Store, BigDecimal> entry : mapsp3.entrySet()) {
    	   for(Map.Entry<Store, BigDecimal> entrys : mapsp2.entrySet()) {
    		   if(entrys.getKey().equals(entry.getKey())) {
    			   entry.setValue((entrys.getValue().multiply(xxx.add(sum2))).subtract(entrys.getKey().getStockPreviousDay()).setScale(0, RoundingMode.HALF_DOWN));
    		   }
    	   }
       }
		
		// Step 4: Fix rounding issue
       Map<Store, BigDecimal> demandMap = new HashMap<>();
		
		for (Store store: stores) {
			BigDecimal exepected = store.getExpectedSales();
			BigDecimal stock = store.getStockPreviousDay();
			BigDecimal result = bd(0);
			result = result.add(exepected);
			result = result.subtract(stock);
			if (result.compareTo(bd(0)) < 0) {
				result = bd(0);
			}
			demandMap.put(store, result);
				
		}
	   
		return mapsp3;
	}
}