package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import bean.Item;
import bean.ItemDetail;
import bean.Order;

/*Utility of Order Class
 * Normally: Utility is place where contains utility methods
 * */

public class OrderUtils {
	
	private OrderUtils() {
		
	}
	
	
	public static double export(Order order) {
		ItemDetail[] itemDetails = order.getItemDetails();
		double totalOfMoney = 0;
		for(ItemDetail itemDetail:itemDetails) {
			Item item = itemDetail.getItem();
			int quantity = itemDetail.getQuantity();
			Double cost = item.getCost() * quantity;
			
			if(cost > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())) {
				cost *= 0.9;
			}
			totalOfMoney += cost;
		}
		return totalOfMoney;
	}
	
	public static void printInvoice(Order order ) {
		ItemDetail[] ids = order.getItemDetails();
		LocalDateTime orderDate = order.getOrderDate();
		System.out.println("Name: " + order.getCustomer().getName());
		System.out.println("Phone: " + order.getCustomer().getPhone());
		System.out.println("Address: " + order.getCustomer().getAddress());
		System.out.println("Date: " + order.getOrderDate());
		System.out.println("====================================================================================");
		System.out.printf("%-20s%-20s%-20s%-20s%s\n", "Item", "Color", "Cost", "Quantity", "Total");
		for(ItemDetail id:ids) {
			Item item = id.getItem();
			System.out.printf("%-20s%-20s%-20s%-20s%s\n", item.getId(),  item.getCost(), item.getColor()
														, id.getQuantity(), (item.getCost() * id.getQuantity()));
			System.out.println("");
		}
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.printf("%-80s%s\n","", "Total of bill");
		System.out.printf("%-80s%s\n","", OrderUtils.export(order));
	}
}
