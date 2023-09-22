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
		
		var item = itemService.getItem(3);
		
		System.out.println(
				"Câu 3: Liệt kê mặt hàng theo mã mặt hàng\n"
				+ item);
		
		var itemDetails = item.getItemDetails();
		
		SqlUtils.generate(
				"\nCâu 4: Liệt kê toàn bộ các mặt hàng chứa thông tin kích cỡ",
				itemDetails
				);
	}

}
