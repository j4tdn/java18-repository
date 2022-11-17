package homework;

import bean.Item;

public class Ex02ItemApp {
	public static void main(String[] args) {
		
	
		Item item1 = new Item( 123, "ip" , 10, "vn");
		
		
		Item item2 = new Item(245, "ss" , 50, "cn");
		
		
	// System.out.println("Sum: " + (item1.getsalesPrice() + item2.getsalesPrice()));
		
		double t1 = totalOfSalesPrice(item1, item 2);
		System.out.println("TT cua item1, item2 ==> " + t1);
		
Item item3 = new Item(  23, "item3" , 150, "vn");
				Item item4 = new Item(245, "item4" , 50, "cn");
		double t2 = totalOfSalesPrice(item3, item4);
		System.out.println("TT cua item3, item4 ==> " + t2);
		
		
	}

	private static double totalSalesPrice(Item item1, Item item2) {
		return item1.getSalesPrice() + item2.getSalesPrice();
	}
}
