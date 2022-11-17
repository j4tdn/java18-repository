package shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		/*
			c1 : cus01, Adam, 123, New York
			c2 : cus02, Kate, 345, California
			i1 : SSW, Anroid, Black, 600
			i2 : SS9+, Anroid, Red, 300
			i3 : IP14, IOS, Purple, 1200
			i4 : AW8, WOS, Black, 400
			i5 : RZ, Anroid, Black, 750
			o1 : c1, {id1(i1,3), id2(i3,1)}, datetime
			o2 : c2, {id1(i4,2), id2(i5,3)}, datetime 
			o2 : c2, {id1(i1,1)}, datetime 
		 */
		Customer c1 = new Customer("CUS1", "Kevin", "123", "Manchester");
		Customer c2 = new Customer("CUS2", "Leo", "456", "Paris");
		Item i1 = new Item("SSW", "Anroid", "Black", 600);
		Item i2 = new Item("SS9+", "Anroid", "Red", 300);
		Item i3 = new Item("IP14", "IOS", "Purple", 1200);
		Item i4 = new Item("AW8", "WOS", "Black", 400);
		Item i5 = new Item("RZ", "Anroid", "Black", 750);
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
