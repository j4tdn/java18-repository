package view;

import service.OrderService;
import service.OrderServiceImpl;
import utils.SqlUtils;

public class Order_view {
	private static OrderService orderService;
	
	static {
		orderService = new OrderServiceImpl();
	}
	
	public static void main(String[] args) {
		SqlUtils.generate("Order: ", orderService.getAll());
	}
}