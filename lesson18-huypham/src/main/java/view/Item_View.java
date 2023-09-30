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
//		SqlUtils.generate(
//				"Câu 4: ",
//				itemService.getItem()
//		);
		
		SqlUtils.generate(
				"Câu 3: ",
				itemService.getItemDetails()
		);
		
		
	}
}