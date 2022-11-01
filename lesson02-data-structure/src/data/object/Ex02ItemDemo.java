package data.object;

import bean.Item;

public class Ex02ItemDemo {
	public static void main(String[] args) {
		Item i1 = new Item(123,"Item A123",0);
		System.out.println("i1 id : " + i1.id);
		System.out.println("i1 name : " + i1.name);
		System.out.println("i1 price : " + i1.sellPrice);
		
		Item i2 = null;
		//System.out.println(i2.id);
		
		Item i3 = new Item(234, "B234", 20d);
//		i3.id = 234;
//		i3.name = "Item B234";
//		i3.sellPrice = 20d;
		System.out.println("i3 id : " + i3.id);
		System.out.println("i3 name : " + i3.name);
		System.out.println("i3 price : " + i3.sellPrice);
		
		Item i4 = new Item(345, "Item D345", 30d);
//		System.out.println("i4 id : " + i4.id);
//		System.out.println("i4 name : " + i4.name);
//		System.out.println("i4 price : " + i4.sellPrice);
		System.out.println(i4);
	}
}
