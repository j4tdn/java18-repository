package shopping;

import java.time.LocalDateTime;

import bean.Customer;
import bean.Item;
import bean.ItemDetail;
import bean.Order;

public class ShoppingApp {

	public static void main(String[] args) {
		/*
		 * Customer : 
		c1 : KH01, Tay, 123, Quang Nam
		c2 : KH02, Kiet, 456, Da Nang

		Item :
		i1 : SA20, Android, Black, 100 
		i2 : SA30, Android, Red, 200 
		i3 : IP8, IOS, Purple, 300 
		i4 : IP14, IOS, Black, 400 
		i5 : WP8, WindowPhone, Blue, 500
		
		Order : 
		o1 : c1, {id1(i1,3), id2(i4,1)}, 10:10:10 17.11.2022 
		o2 : c2, {id1(i2,2), id2(i3,4)}, 20:24:12 16.11.2022 
		o3 : c2, {id1(i5,1)}, 09:15:17 15.11.2022 
		 */
		Customer c1 = new Customer("KH01", "Tay", "123", "Quang Nam");
		Customer c2 = new Customer("KH02", "Kiet", "456", "Da Nang");

		Item i1 = new Item("SA20", "Android", "Black", 100);
		Item i2 = new Item("SA30", "Android", "Red", 600);
		Item i3 = new Item("IP8", "IOS", "Purple", 300);
		Item i4 = new Item("IP14", "IOS", "Black", 700);
		Item i5 = new Item("WP8", "WindowPhone", "Blue", 500);

		Order o1 = new Order(c1, new ItemDetail[] { new ItemDetail(i1, 3), new ItemDetail(i4, 1) },
				LocalDateTime.of(2022, 11, 17, 10, 10, 10));
		Order o2 = new Order(c2, new ItemDetail[] { new ItemDetail(i2, 2), new ItemDetail(i3, 4) },
				LocalDateTime.of(2022, 11, 16, 20, 24, 12));
		Order o3 = new Order(c2, new ItemDetail[] { new ItemDetail(i5, 1) }, LocalDateTime.of(2022, 11, 17, 9, 15, 17));

		// System.out.println("Order 1: " + o1.export());
		// System.out.println("Order 2: " + o2.export());
		// System.out.println("Order 3: " + o3.export());

		System.out.println("Order 1: " + OrderUtils.export(o1));
		System.out.println("Order 2: " + OrderUtils.export(o2));
		System.out.println("Order 3: " + OrderUtils.export(o3));

		// write method export in Order class: no-parameter
		// write method export in Another class: export(order)
	}

}
