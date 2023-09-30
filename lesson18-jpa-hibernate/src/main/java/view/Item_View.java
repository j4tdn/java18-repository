package view;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.AbstractMap;
import java.util.Set;
import java.util.stream.Collectors;

import persistence.ItemDetail;
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
				"Câu 1F: Liệt kê các mặt hàng",
				itemService.getAll()
		);
		
		var item = itemService.getItem(3);
		
		System.out.println("Câu 3: Liệt kê mặt hàng theo mã mặt hàng\n"
				+ itemService.getItem(3));
		
		var itemDtails = item.getItemDetails();
		
		SqlUtils.generate(
				"Câu 4: Liệt kê các mặt hàng chứa thông tin kích cỡ",
				itemDtails
		);
	}

}