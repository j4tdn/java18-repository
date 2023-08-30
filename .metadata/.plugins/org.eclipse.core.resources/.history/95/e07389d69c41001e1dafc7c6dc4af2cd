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
				"Câu 1F: Liệt kê các mặt hàng theo mã loại",
				itemService.getItems(Set.of(1,2,5))
		);
	}

}
