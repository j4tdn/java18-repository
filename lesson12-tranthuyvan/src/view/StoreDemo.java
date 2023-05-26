package view;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import bean.Store;

public class StoreDemo {
	public static void main(String[] args) {
		
	}
	
	private static void fillMissingExpectedSales(List<Store> stores) {
		List<Store> storesWithRefStore = stores
				                        .stream()
				                        .filter(s -> Objects.nonNull(s.getReferenceStoreId()))
				                        .collect(Collectors.toList());
		
		List<Store> storesWithoutRefStore = stores
						                .stream()
						                .filter(s -> Objects.isNull(s.getReferenceStoreId()))
						                .collect(Collectors.toList());
		
	}

}
