package shopping;

import java.time.LocalDateTime;

import bean.Customer;
import bean.Item;
import bean.ItemDetail;
import bean.Order;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "Adam", "123", "NewYork");
		Customer c2 = new Customer("KH2", "Kate", "234", "Ohio");
		
		Item i1 = new Item("SS10+", "Samsung", "Black", 620);
		Item i2 = new Item("SS20U", "Samsung", "Green", 800);
		Item i3 = new Item("IP13+", "Apple", "Black", 1000);
		Item i4 = new Item("Ip8+", "Apple", "Purple", 500);
		Item i5 = new Item("WP8+", "Win", "Black", 200);
		
		Order o1 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i1, 3), // 1860
				new ItemDetail(i4, 5), //2500
				new ItemDetail(i2, 1), //800
		}, LocalDateTime.of(2021, 5, 8, 10, 10, 10));
		
		Order o2 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i1, 1),
				new ItemDetail(i5, 2),
				new ItemDetail(i3, 1),
		}, LocalDateTime.of(2021, 9, 1, 9, 12, 29));
		
		Order o3 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i4, 1),
		}, LocalDateTime.of(2021, 12, 5, 19, 14, 29));
		
		//Write method export in Order class: 
		OrderUtils.printInvoice(o1);
		System.out.println("\n\n**************************\n");
		OrderUtils.printInvoice(o2);
		System.out.println("\n\n**************************\n");
		OrderUtils.printInvoice(o3);

	}
}
