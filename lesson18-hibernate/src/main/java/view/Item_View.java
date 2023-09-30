package view;

import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemService;
import service.ItemServiceImpl;
import utils.SqlUtils;

public class Item_View {
	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
		SqlUtils.generate("Câu 2A: Liệt kê toàn bộ các mặt hàng", 
				itemService.getAll());
		
		var item = itemService.getItem(3);
		
		SqlUtils.generate("Câu 3A: Liệt kê mặt hàng theo mã mặt hàng", 
				item);
		
		var itemDetails = item.getItemDetails();
		
		SqlUtils.generate("Câu 4A: Liệt kê toàn bộ mặt hàng chứa thông tin kích cỡ", 
				itemDetails);
		
//		SqlUtils.generate("Câu 4A: Liệt kê toàn bộ mặt hàng chứa thông tin kích cỡ", 
//				itemDetails);
//		
//		ItemGroupService.save(new ItemGroup(20, "Item Group 20"));
//		
	}
	
	

}