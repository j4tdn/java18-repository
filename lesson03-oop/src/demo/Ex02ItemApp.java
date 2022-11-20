package demo;

import bean.Item;

public class Ex02ItemApp {
	public static void main(String[] args) {
		/*
		 * Tạo class Ex02ItemApp
				Khởi tạo 2 đối tượng item1, item2 từ Item
		với giá trị tùy ý
				Tính tổng tiền 2 mặt hàng đó và in ra 
		 */
		
		// item1, item2 : biến
		// new Item : đối tượng (giá trị)
		Item item1 = new Item(123, "A",10,"VN");
		Item item2 = new Item(456,"B",25,"VN");
		double t1 = totalOfSalesPrice(item1, item2);
		System.out.println("Tong tien t1: " + t1);
		
		Item item3 = new Item(789, "C",30,"VN");
		Item item4 = new Item(10,"D",35,"VN");
		double t2 = totalOfSalesPrice(item3, item4);
		System.out.println("Tong tien t2: " + t2);
		
	}
	private static double totalOfSalesPrice (Item item1, Item item2) {
		return item1.getSalesPrice() + item2.getSalesPrice();
	}
}
