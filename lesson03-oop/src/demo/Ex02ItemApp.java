package demo;

import bean.Item;

public class Ex02ItemApp {
	public static void main(String[] args) {
		/*
		 ==> Khởi tạo 2 đối tượng item1, item2 từ Item
		     với giá trị tùy ý
		 ==> Tính tổng tiền 2 mặt hàng đó và in ra
		 */
		Item item1 = new Item(1, "Item 1", 100, "Viet Nam");
		Item item2 = new Item(2, "Item 2", 200, "Lao");
		double t1 = totalOfSalesPrice(item1, item2);
		System.out.println("TT của item1, item 2 ==> " + t1);
		
		Item item3 = new Item(3, "Item 3", 150, "Viet Nam"); // H1
		Item item4 = new Item(4, "Item 4", 250, "Lao"); // H2
		double t2 = totalOfSalesPrice(item3, item4);
		System.out.println("TT của item3, item 4 ==> " + t2);
		
		double t3 = item3.plusSalesPrice(item4);
		System.out.println("TT của item3, item 4 ==> " + t3);
	}
	
	// 14 ==> Item item1 = item1; Item item2 = item2;
	// 18 ==> Item item1(H1) = item3; Item item2(H2) = item4;
	private static double totalOfSalesPrice(Item item1, Item item2) {
		return item1.getSalesPrice() + item2.getSalesPrice();
	}
}
