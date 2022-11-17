package view;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("CUS1", "Kevin", "123", "Manchester");
		Customer c2 = new Customer("CUS2", "Leo", "456", "Paris");
		Item i1 = new Item("SSW", "Anroid", "Black", 600);
		Item i2 = new Item("SS9+", "Anroid", "Red", 300);
		Item i3 = new Item("IP14", "IOS", "Purple", 1200);
		Item i4 = new Item("AW8", "WOS", "Black", 400);
		Item i5 = new Item("RZ", "Anroid", "Black", 750);
		Order o1 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i1,3),
				new ItemDetail(i4,5),
				new ItemDetail(i2,1)
		}, LocalDateTime.of(2022, 11, 17, 10, 4, 3));
		Order o2 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i3,2),
				new ItemDetail(i5,1)
		}, LocalDateTime.of(2022, 11, 17, 10, 5, 9));
		Order o3 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i4,1),
		}, LocalDateTime.of(2022, 11, 17, 10, 6, 4));
		
		double om1 = o1.export();
		double om2 = o2.export();
		double om3 = o3.export();
		System.out.println("order 1: "+ om1);
		System.out.println("order 2: "+ om2);
		System.out.println("order 3: "+ om3);

	
	}
}

