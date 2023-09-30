package view;

import java.time.LocalDate;

import service.ItemService;
import service.ItemServiceImpl;
import utils.SqlUtils;

public class Item_View {
	
	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}
	
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(23, 07, 2023);
		var item = itemService.getItem(date);
		SqlUtils.generate("Câu 1: Liệt kê các mặt hàng được bán trong ngày bất kỳ" + item);
		
		
		SqlUtils.generate(
				"Câu 4: Liệt kê danh sách các mặt hàng của mỗi loại hàng",
				itemService.getAll()
		);
	}
	
	

}
