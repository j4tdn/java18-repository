package view;

import java.time.LocalDate;

import service.ItemService;
import service.ItemServiceImpl;

public class Item_View {
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		
		System.out.println("1. Liệt kê các mặt hàng được bán trong ngày bất kỳ.\n");
		System.out.println(itemService.getItemByDate(LocalDate.of(2023, 9, 9)));
		
		System.out.println("================================================");
		
		System.out.println("3. Top 3 mặt hàng được bán nhiều nhất năm 2023\n");
		System.out.println(itemService.getTopItems(2023));
	}

}
