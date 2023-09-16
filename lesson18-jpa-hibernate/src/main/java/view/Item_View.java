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
		SqlUtils.generate("Câu 2A: Liệt kê toàn bộ các mặt hàng", itemService.getAll());

		SqlUtils.generate("Câu 3A: Liệt kê mặt hàng theo mã mặt hàng", itemService.getItem(2));
	}

}
