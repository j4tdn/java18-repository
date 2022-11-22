package shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "DucHuy", "0123", "Da Nang");
		Customer c2 = new Customer("KH2", "Eva", "0456", "Thai Lan");

		Item i1 = new Item("01", "IOS", "Black", 2000);
		Item i2 = new Item("02", "Android", "Green", 500);
		Item i3 = new Item("03", "Android", "Black", 700);
		Item i4 = new Item("04", "IOS", "Black", 4000);
		Item i5 = new Item("05", "IOS", "Black", 9000);

		Order o1 = new Order(c1, new ItemDetails[] {
				new ItemDetails(i1, 3),
				new ItemDetails(i4, 5),
				new ItemDetails(i5, 1),
		}, LocalDateTime.of(2022, 11, 18, 10, 10, 10));
		
		Order o2 = new Order(c2, new ItemDetails[] {
				new ItemDetails(i2, 2),
				new ItemDetails(i3, 4)
		}, LocalDateTime.of(2021, 5, 8, 3, 4, 5));
		
		OrderUtils.export(o1);
		OrderUtils.export(o2);
	}
}
