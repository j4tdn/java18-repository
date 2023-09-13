package view;

import service.ItemService;
import service.ItemServiceImpl;
import utils.SqlUtils;

public class Item_View {
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		
		var items = itemService.getAll();
		
		SqlUtils.generate(
				"Câu 2A: Liệt kê toàn bộ mặt hàng", 
				items);
		
		// System.out.println("items[2] --> " + items.get(2).getItemGroup());
		
		System.out.println(
				"Câu 3: Liệt kê mặt hàng theo mã mặt hàng\n"
				+ itemService.getItem(5)
				);
	}

}
