package shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "Adam", "123", "Manchester");
		Customer c2 = new Customer("KH2", "Kate", "456", "Paris");
		Item i1 = new Item("SS10", "Anroid", "Black", 600);
		Item i2 = new Item("SS9+", "Anroid", "Red", 300);
		Item i3 = new Item("IP4", "IOS", "Purple", 1200);
		Item i4 = new Item("AW8", "WOS", "Black", 400);
		Item i5 = new Item("RZZ", "Anroid", "Black", 750);
		Order o1 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i1,3),
				new ItemDetail(i3,1)
		}, LocalDateTime.of(2022, 11, 17, 2, 57, 9));
		Order o2 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i4,2),
				new ItemDetail(i5,3)
		}, LocalDateTime.of(2022, 11, 16, 12, 57, 59));
		Order o3 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i1,1),
		}, LocalDateTime.of(2022, 11, 17, 2, 0, 9));
		
		System.out.println(o1.export());
	}
}
