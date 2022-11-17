package shopping;

import java.time.LocalDate;

import bean.Item;
import bean.ItemDetail;
import bean.Order;

/**
 * 
 * utility of Order Class
 * Normally: Utility is place where contains utility methods
 * No cares created class's objects
 *
 */
public class OrderUtils {

	private OrderUtils() {
		// thường chỉ truyền vào tham số và trả về kết quả
		// không cho tạo đối tượng
	}

	public static double export(Order order) {
		double totalOfMoney = 0;
		ItemDetail[] ids = order.getItemDetail();
		for (ItemDetail itemDetail : ids) {
			Item item = itemDetail.getItem();
			int quantity = itemDetail.getQuantity();
			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of(2022, 11, 17).isEqual(order.getOrderDate().toLocalDate())) {
				idCost *= 0.9;
			}
			totalOfMoney += idCost;
		}
		return totalOfMoney;
	}

}
