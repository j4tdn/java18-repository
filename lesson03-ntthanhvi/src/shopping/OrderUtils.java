package shopping;

import java.time.LocalDate;

/*
 * Utility of Order Class
 * Normally: Utility is place where contains utility method
 * Utility Method có nghĩa là truyền vào cái gì thì sẽ dựa vào
 * 	cái truyền vào để tính toán, chứ không quan tâm đến đối tượng
 * 	đang gọi
 */
public class OrderUtils {
	
	private OrderUtils () {
		
	}

	public static double export(Order order) {
		double totalOfMoney = 0;

		ItemDetail[] ids = order.getItemDetails();

		// for index
		// for (int i=0; i<ids.length; i++) {
		// ItemDetail id = ids[i];
		// }

		// for each
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();

			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of(2021, 05, 8).isEqual(order.getOrderDate().toLocalDate())) {
				idCost *= 0.9;
			}
			totalOfMoney += idCost;
		}
		return totalOfMoney;
	}
}
