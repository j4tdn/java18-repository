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
		SqlUtils.generate("Câu 2",itemService.get());
		SqlUtils.generate("Câu 3",itemService.getNameItems());
		SqlUtils.generate("Câu 4",itemService.getAllItem());
		
	}
}
