package view;

import java.time.LocalDate;
import java.util.AbstractMap;
import java.util.Set;
import java.util.stream.Collectors;

import service.ItemService;
import service.ItemServiceImpl;
import utils.SqlUtils;

public class Item_View {
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		SqlUtils.generate(
				"Câu 1F: Liệt kê các mặt hàng theo mã loại", 
				itemService.getItems(Set.of(1, 2, 5)));
		
		var items = itemService.getItemsByOrderDate(LocalDate.of(2023, 9, 9))
				.stream()
				// .map(item -> item.getId() + ", " + item.getName()) --> nếu dùng cái này, trả về toString
				.map(item -> new AbstractMap.SimpleEntry<>(item.getId(), item.getName()))
				.collect(Collectors.toList());
		
		SqlUtils.generate(
				"Câu 1H: Liệt kê các mặt hàng được bán trong ngày bất kỳ", 
				items);
	}
}
