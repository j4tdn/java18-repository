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
		SqlUtils.generate("C�u 2",itemService.get());
		SqlUtils.generate("C�u 3",itemService.getNameItems());
		SqlUtils.generate("C�u 4",itemService.getAllItem());
		
	}
}
