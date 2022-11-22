package demo.shopping;

import java.time.LocalDate;
import java.time.Month;

/**
 * Utility of Order Class
 * Normally: utility is a place where contains helper methods
 * No cares created class's object
 */
public class OrderUtils {
	
	private OrderUtils() {
		//Banned from creating object
	}
	
	public static double export(Order order) {
		double totalOfMoney = 0;
		ItemDetail[] ids = order.getItemDetails();
		
		for (ItemDetail id:ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			
			double idCost = item.getPrice()*quantity;
			if(item.getPrice() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())) {
				idCost *= 0.9;
			}
			
			totalOfMoney += idCost;
		}
		return totalOfMoney;
	}
}
