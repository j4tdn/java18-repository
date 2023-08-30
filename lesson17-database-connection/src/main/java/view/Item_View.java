package view;

import java.util.Set;

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
				"Câu 1F: Liệt kê toàn bộ các mặt hàng theo loại hàng",
				itemService.getItems(Set.of(1,2,5))
		);
	}
}
