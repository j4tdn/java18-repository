package demo;

import bean.Item;

public class Ex02ItemApp {
	public static void main(String[] args) {
		/*
		 ==> Khởi tạo 2 đối tượng item1, item2 từ Item với giá trị tùy ý
		==> Tính tổng tiền 2 mặt hàng và in ra
		 */
		Item item1 = new Item(1, "Item 1", 100, "Vietnam");
		Item item2 = new Item(2, "Item 2", 200, "Lao");
		
		System.out.println("total of item 1 vs item 2 ==> " + totalOfSalesPrice(item1, item2));
		
		Item item3 = new Item(3, "Item 3", 150, "Vietnam");
		Item item4 = new Item(4, "Item 4", 250, "Lao");
		
		System.out.println("total of item 1 vs item 2 ==> " + totalOfSalesPrice(item3, item4));
		
		double t3 = item3.plusSalesPrice(item4);
		System.out.println("total of item 3 vs item 4 == >" + t3);
	}
	
	private static double totalOfSalesPrice(Item item1, Item item2) {
		return item1.getSalesPrice() + item2.getSalesPrice();
	}
}
