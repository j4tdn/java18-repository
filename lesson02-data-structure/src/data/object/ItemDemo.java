package data.object;

import bean.Item;

public class ItemDemo {

	public static void main(String[] args) {
		Item i1 = null;
		Item i2 = new Item();
		
		i2.id = 123;
		i2.name = "Item 123";
		
		System.out.println("i2 id: " + i2.id);
		System.out.println("i2 name: " + i2.name);
		System.out.println("i2 salesPrice: " + i2.salesPrice);
		
		Item i3 = new Item();
		i3.id = 234;
		i3.name = "Item 234";
		i3.salesPrice = 20d;
		
		System.out.println("i3 id: " + i3.id);
		System.out.println("i3 name: " + i3.name);
		System.out.println("i3 salesPrice: " + i3.salesPrice);
		
		Item i4 = new Item(345, "Item 345", 30d);
		System.out.println("i4 " + i4);
		
				

	}

}
