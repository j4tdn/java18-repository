package view;

import dto.ItemHights;
import service.ItemHightsService;
import service.ItemHightsServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;
import service.OrderService;
import service.OrderServiceImpl;

public class OrderView {
	private static OrderService orderService;
	private static ItemService itemService;
	private static ItemHightsService itemHightsService;
	
	static {
		orderService = new OrderServiceImpl();
		itemService = new ItemServiceImpl();
		itemHightsService = new ItemHightsServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("cau 1" + orderService.getAll("2023-07-25"));
		System.out.println("cau 2" + orderService.getAllItemGroupDtos());
		System.out.println("cau 3" + itemHightsService.getItemHights());
		System.out.println("cau 4" + itemService.getAll());
		
	}
}
