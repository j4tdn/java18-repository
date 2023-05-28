package view;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import bean.Store;

public class Ex02ADV {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Store> stores = new ArrayList<>();
		final List<Store> NoChangedStores = new ArrayList<>();
		stores.add(new Store("Store 1", "", 18, 40d, false));
		stores.add(new Store("Store 2", "", 19, 20d, false));
		stores.add(new Store("Store 3", "", 21, 17d, false));
		stores.add(new Store("Store 4", "", 14, 31d, false));
		stores.add(new Store("Store 5", "", 14, 10d, false));
		stores.add(new Store("Store 6", "", 15, 30d, false));
		stores.add(new Store("Store 7", "Store 2", 15, null, false));
		stores.add(new Store("Store 8", "", 12, 19d, false));
		stores.add(new Store("Store 9", "", 17, 26d, false));
		stores.add(new Store("Store 10", "Store 7", 18, null, false));

		NoChangedStores.add(new Store("Store 1", "", 18, 40d, false));
		NoChangedStores.add(new Store("Store 2", "", 19, 20d, false));
		NoChangedStores.add(new Store("Store 3", "", 21, 17d, false));
		NoChangedStores.add(new Store("Store 4", "", 14, 31d, false));
		NoChangedStores.add(new Store("Store 5", "", 14, 10d, false));
		NoChangedStores.add(new Store("Store 6", "", 15, 30d, false));
		NoChangedStores.add(new Store("Store 7", "Store 2", 15, null, false));
		NoChangedStores.add(new Store("Store 8", "", 12, 19d, false));
		NoChangedStores.add(new Store("Store 9", "", 17, 26d, false));
		NoChangedStores.add(new Store("Store 10", "Store 7", 18, null, false));

//		stores.add(new Store("Store 5", "", 14, 10d, false));
//		stores.add(new Store("Store 6", "", 15, 30d, false));
//		stores.add(new Store("Store 7", "Store 5", 15, null, false));
//		stores.add(new Store("Store 8", "", 12, 19d, false));
//		stores.add(new Store("Store 9", "Store 7", 17, null, false));
//		stores.add(new Store("Store 10", "", 18, null, false));
		boolean status = true;
		Integer warehouseAllocationAmount = 0;
		do {
			try {
				System.out.println("warehouseAllocationAmount :");
				warehouseAllocationAmount = Integer.parseInt(sc.nextLine());
				if (warehouseAllocationAmount != null) {
					status = false;
				}
			} catch (Exception e2) {
				System.out.println("Mời nhập lại !");
			}

		} while (status);
		System.out.println("Chọn các cửa hàng cần phân phối đến :");
		stores.forEach(e -> {
			System.out.println(e.getStoreId());
			e.setSelected(sc.nextLine().equals("") ? false : true);
			System.out.println();
		});

		List<Store> FillingES = step1(stores, NoChangedStores);
		List<Double> AllocationKeys = getAllocationKeys(stores);
		List<Long> AmountAllocateds = getAmountAllocateds(stores, AllocationKeys, warehouseAllocationAmount);
		while (AmountAllocateds.stream().filter(e->e!=null).reduce(0l, Long::sum) != Long.parseLong(String.valueOf(warehouseAllocationAmount))) {
			
			AmountAllocateds= step4(stores, AmountAllocateds,warehouseAllocationAmount);
			
			
		}
		print(stores, AllocationKeys, AmountAllocateds);

	}

	private static List<Store> step1(List<Store> stores, List<Store> NoChangedStores) {
		System.out.println("Step 1 :");
		List<Boolean> setStatus = new ArrayList<>(stores.size());
		List<Store> nullES = stores.stream()
				.filter(e -> e.getExpectedSales() == null ? setStatus.add(true) : setStatus.add(false))
				.collect(Collectors.toList());
		for (Store item : nullES) {
			int index = stores.indexOf(item);
			if (stores.stream().map(Store::getStoreId).collect(Collectors.toList())
					.contains(item.getReferenceStoreId())) {
				System.out.println("index" + index);
				if (setStatus.get(index) == true) {
					int indexTemp = stores.stream().map(Store::getStoreId).collect(Collectors.toList())
							.indexOf(item.getReferenceStoreId());
					System.out.println("indexTemp" + indexTemp);
					if (setStatus.get(indexTemp) == true) {
						System.out.println("1");
						int size = (int) NoChangedStores.stream().map(Store::getExpectedSales).filter(e -> e != null)
								.count();
						double sum = NoChangedStores.stream().map(Store::getExpectedSales).filter(e -> e != null)
								.reduce(0d, ((s, i) -> s + i));
						System.out.println("size" + size);
						System.out.println("sum" + sum);
						DecimalFormat decimalFormat = new DecimalFormat("#0.0");
						stores.get(index).setExpectedSales(Double.parseDouble(decimalFormat.format(sum / size)));
					}
					if (setStatus.get(indexTemp) == false) {
						stores.get(index).setExpectedSales(stores.get(indexTemp).getExpectedSales());
					}
				}
			}
			if (item.getReferenceStoreId().equals("") && item.getExpectedSales() == null) {
				System.out.println("index" + index);
				System.out.println("2");
				int size = (int) NoChangedStores.stream().map(Store::getExpectedSales).filter(e -> e != null).count();
				double sum = NoChangedStores.stream().map(Store::getExpectedSales).filter(e -> e != null).reduce(0d,
						((s, i) -> s + i));
				System.out.println("size" + size);
				System.out.println("sum" + sum);
				DecimalFormat decimalFormat = new DecimalFormat("#0.00");
				stores.get(index).setExpectedSales(Double.parseDouble(decimalFormat.format(sum / size)));
			}
		}
		Store.toString(stores);
		setStatus.forEach(System.out::println);
		return stores;

	}

	private static List<Double> getAllocationKeys(List<Store> stores) {
		List<Double> AllocationKeys = new ArrayList<>();
		for (Store item : stores) {
			if (item.isSelected() == true) {
				Double AllocationKey = item.getExpectedSales()
						/ stores.stream().filter(e->e.isSelected()==true).map(Store::getExpectedSales).reduce(0d, Double::sum);
				AllocationKeys.add(AllocationKey);
			} else {
				AllocationKeys.add(null);
			}

		}
		return AllocationKeys;
	}

	private static List<Long> getAmountAllocateds(List<Store> stores, List<Double> AllocationKeys,
			Integer warehouseAllocationAmount) {
		
		List<Long> AmountAllocateds = new ArrayList<>();
		double sumStockPreDay = stores.stream().filter(e->e.isSelected()==true).map(Store::getStockPreviousDay).reduce(0d, Double::sum);
		System.out.println("sumStockPreDay : " + sumStockPreDay);
		for (Store item : stores) {
			if (item.isSelected() == true) {
				int index = stores.indexOf(item);
				double AmountAllocated = (warehouseAllocationAmount + sumStockPreDay) * AllocationKeys.get(index)
						- stores.get(index).getStockPreviousDay();
				System.out.println(Math.round(AmountAllocated));
				AmountAllocateds.add(Math.round(AmountAllocated));
			}
			else {
				AmountAllocateds.add(null);
			}
		}
		return AmountAllocateds;
	}

	private static List<Long> step4(List<Store> stores, List<Long> AmountAllocateds,Integer warehouseAllocationAmount) {
		System.out.println("Step 1 :");
		List<Double> DemandStores = stores.stream().map(e->(e.isSelected()==true)?(e.getExpectedSales()-e.getStockPreviousDay()):0).collect(Collectors.toList());
		DemandStores = DemandStores.stream().map(e->e<0?0:e).toList();
		DemandStores.forEach(System.out::println);
		if (AmountAllocateds.stream().filter(e->e!=null||e!=0).reduce(0l, Long::sum) > warehouseAllocationAmount) {
			System.out.println("Amounts Allocated Store < Allocation Amount");
			if(DemandStores.contains(DemandStores.stream().reduce(Double::max).get())){
				int index = DemandStores.indexOf(DemandStores.stream().reduce(Double::max).get());
				long newAmountAllocated = AmountAllocateds.get(index);
				AmountAllocateds.remove(index);
				AmountAllocateds.add(index, newAmountAllocated-1);
			}
		}
		if (AmountAllocateds.stream().filter(e->e!=null).reduce(0l, Long::sum) < warehouseAllocationAmount) {
			System.out.println("Amounts Allocated Store < Allocation Amount");
			if(DemandStores.contains(DemandStores.stream().reduce(Double::min).get())){
				int index = DemandStores.indexOf(DemandStores.stream().reduce(Double::max).get());
				long newAmountAllocated = AmountAllocateds.get(index);
				AmountAllocateds.remove(index);
				AmountAllocateds.add(index, newAmountAllocated+1);
			}
		} 
		
		return AmountAllocateds;
	}

	private static void print(List<Store> stores, List<Double> AllocationKeys, List<Long> AmountAllocateds) {
		System.out.printf("%10s |  %20s  | %20s | %20s\n", "", "Allocation Key", "Stock Previous Day",
				"Amount Allocated");
		for (Store item : stores) {
			int index = stores.indexOf(item);
			System.out.printf("%10s |  %20s  | %20s |  %20s\n", item.getStoreId(),
					String.valueOf(AllocationKeys.get(index)), String.valueOf(item.getStockPreviousDay()),
					String.valueOf(AmountAllocateds.get(index)));
		}
	}

}
