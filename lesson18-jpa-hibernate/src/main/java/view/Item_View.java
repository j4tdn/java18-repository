package view;

import java.util.Set;

import service.ItemService;
import service.ItemServiceImpl;
import Utils.SqlUtils;

public class Item_View {
	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
		SqlUtils.generate(
				"Câu 2A: Liệt kê các mặt hàng ",
				itemService.getAll()
		);
		var item = itemService.getItem(3);
		SqlUtils.generate(
				"Câu 3: Liệt kê  mặt hàng theo mã mã mặt hàng \n",
				item
		);
		var itemDetails = item.getItemDetails();
		SqlUtils.generate(
				"Câu 4: Liệt kê  toàn bộ các mặt hàng chưa thông tin kich cỡ \n",
				item.getItemDetails()
		);
	}

}

	