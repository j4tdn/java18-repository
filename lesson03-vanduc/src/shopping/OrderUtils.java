package shopping;

import java.time.LocalDate;
import java.time.Month;

/**
 * 
 * Utility of Oder Class
 *
 */



public class OrderUtils {
	
	private OrderUtils() {
	}
	
	public static double export(Order order) {
		double totolOfMoney = 0;
		ItemDetail[] ids = order.getItemDetails();
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of(2021, Month.NOVEMBER, 8).isEqual(order.getOrderDateTime().toLocalDate())) {
				idCost *= 0.9;
			}
			totolOfMoney += idCost;
		}
		return totolOfMoney;
	}

}
