package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StoreService {

	public static void main(String[] args) {
		final Integer whAllocationAmount = 300;
		final List<Store> selectedStores = getStores().stream()
				.filter(store -> Boolean.TRUE.equals(store.getSelected())).collect(Collectors.toList());

		// Thực hiện các bước tính toán

		Map<Long, Integer> storeAllocatedAmouts = doAllocation(whAllocationAmount, selectedStores);
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
	private static Map<Long, Integer> doAllocation(Integer whAllocationAmount, List<Store> stores) {

		// Step 1: Filling in missing expected sales
		List<Store> storeMissingExpectedSales = stores.stream().filter(store -> store.getExpectedSales() == null)
				.collect(Collectors.toList());
		List<BigDecimal> otherExpectSales = stores.stream().filter(e -> e.getExpectedSales() != null)
				.map(e -> e.getExpectedSales()).collect(Collectors.toList());
		storeMissingExpectedSales.forEach(store -> {
			if (store.getReferenceStoreId() != null) {
				if (!storeMissingExpectedSales.stream().anyMatch(e -> e.getStoreId() == store.getReferenceStoreId())) {
					BigDecimal missingExpectedSales = stores.get(Math.toIntExact(store.getReferenceStoreId()) - 1)
							.getExpectedSales();
					store.setExpectedSales(missingExpectedSales);
				} else {
					BigDecimal totalExpectedSales = BigDecimal.ZERO;
					for (BigDecimal sale : otherExpectSales) {
						totalExpectedSales = totalExpectedSales.add(sale);
					}
					BigDecimal expectSales = totalExpectedSales.divide(BigDecimal.valueOf(otherExpectSales.size()));
					store.setExpectedSales(expectSales.setScale(1, RoundingMode.HALF_UP));
				}
			} else {
				System.out.println("storeId: " + store.getStoreId()
						+ " --> Expected sales cannot be calculated. Please add areference store or include stores with expected sales for interpolation");
			}
		});

		// Step 2: Calculate Allocation Key
		BigDecimal totalexpectedSales = stores.stream().map(Store::getExpectedSales).reduce(BigDecimal.ZERO,
				BigDecimal::add);
		Map<Store, BigDecimal> AllocationKeys = stores.stream().collect(Collectors.toMap(store -> store,
				store -> store.getExpectedSales().divide(totalexpectedSales, 10, RoundingMode.HALF_UP)));

		// Step 3: Calculate Allocated Amount
		BigDecimal totalStockPrevious = stores.stream().filter(store -> store.getStockPreviousDay() != null)
				.map(Store::getStockPreviousDay).reduce(BigDecimal.ZERO, BigDecimal::add);
		Map<Long, Integer> allocatedAmount = AllocationKeys.entrySet().stream()
				.collect(Collectors.toMap(entry -> entry.getKey().getStoreId(), entry -> entry.getValue()
						.multiply(BigDecimal.valueOf(whAllocationAmount).add(totalStockPrevious))
						.subtract(entry.getKey().getStockPreviousDay()).setScale(0, RoundingMode.HALF_UP).intValue()));

		// Step 4: Fix rounding issue

		Integer totalAllocatedAmount = allocatedAmount.entrySet().stream().map(entry -> entry.getValue()).reduce(0,
				Integer::sum);
		if (totalAllocatedAmount != whAllocationAmount) {
			Map<Store, Integer> demandAmount = stores.stream()
					.collect(Collectors.toMap(store -> store,
							store -> store.getExpectedSales().subtract(store.getStockPreviousDay()).intValue() > 0
									? store.getExpectedSales().subtract(store.getStockPreviousDay()).intValue()
									: 0));
			Integer maxDemand = 0;
			for (Map.Entry<Store, Integer> entry : demandAmount.entrySet()) {
				if (entry.getValue() > maxDemand) {
					maxDemand = entry.getValue();
				}
			}
			Integer max = maxDemand;
			List<Long> id = demandAmount.entrySet().stream().filter(entry -> entry.getValue() == max)
					.map(entry -> entry.getKey().getStoreId()).collect(Collectors.toList());
			for (Map.Entry<Long, Integer> entry : allocatedAmount.entrySet()) {
				if (entry.getKey() == id.get(0)) {
					allocatedAmount.put(id.get(0), entry.getValue() - 1);
				}
			}
		}
		return allocatedAmount;
	}
}