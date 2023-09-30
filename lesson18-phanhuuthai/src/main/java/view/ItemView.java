package view;

import service.ItemService;
import service.ItemServiceImpl;
import utils.SqlUtils;

public class ItemView {
	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}
	
	
	public static void main(String[] args) {
		SqlUtils.generate(
				"Câu 4: Liệt kê danh sách mặt hàng mỗi loại hàng",
				itemService.getItem()
		);
		
		SqlUtils.generate(
				"Câu 3: Liệt kê số lượng các mặt hàng",
				itemService.getItemDetails()
		);
		
		
	}
}
