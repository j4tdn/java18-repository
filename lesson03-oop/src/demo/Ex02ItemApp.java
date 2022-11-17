package demo;

import bean.Item;

public class Ex02ItemApp {
	public static void main(String[] args) {
		Item item1 = new Item();
		item1.setName("fish");
		item1.setId(123);
		item1.setOrigin("vietnam");
		item1.setSalesPrice(35000);
		Item item2 = new Item(122,"apple",12000,"USA");
		System.out.println("Item1 --> " + item1);
		System.out.println("Item2 --> " + item2);
		System.out.println("tổng giá tiền item1 + item2 --->" + (item1.getSalesPrice(3)+item2.getSalesPrice(3)) );
	}
}
