package demo;

import bean.Item;

public class Ex02ItemApp {
	public static void main(String[] args) {
		Item item1 = new Item(1,"Porche Car",4000,"Germany");
		Item item2 = new Item(2,"BMW Car",2000,"Germany");
		
		double total = totalCart(item1, item2);
		System.out.println(total);
	}
	public static double totalCart(Item a, Item b) {
		return a.getSalesPrice()+b.getSalesPrice();
	}
}
