package shopping;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {
	public static void export(Order order) {
		double total = 0;
		ItemDetails[] ids = order.getItemDetails();
		for(ItemDetails id: ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			total+= (item.getCost()*quantity);
		}
		if(LocalDate.of(2022, Month.NOVEMBER,18).isEqual(order.getOrderDate().toLocalDate())) {
			total=total*0.5;
		}
		System.out.println("Total price "+order.getCustomer().getName()+" must pay is: "+total);
	}
}
