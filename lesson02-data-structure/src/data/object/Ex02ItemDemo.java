package data.object;

import bean.Item;

public class Ex02ItemDemo {
public static void main(String[] args) {
	
	
	Item i1 = null;
	Item i2 = new Item();
	
	
	
	i2.id = 123;
	i2.name = "Item A123";
	
	
	
	System.out.println("i2 id: " + i2.id);
	System.out.println("i2 name: " + i2.name);
	System.out.println("i2 sp: " + i2.salesPrice);
	
	//tạo 1 đối tượng đặt tên biến là i3 có
	//id = 234, name = "Item B234, salePrice = 20d"
	// in
	
	Item i3 = new Item();
	i3.id = 234;
	i3.name = "Item B234";
	i3.salesPrice = 20d;
	
	System.out.println("i3 id: " + i3.id);
	System.out.println("i3 name: " + i3.name);
	System.out.println("i3 sp: " + i3.salesPrice);
	
	Item i4 = new Item (345, "Item C345", 30d);
	
	
	System.out.println("i4 id: " + i4.id);
	System.out.println("i4 name: " + i4.name);
	System.out.println("i4 sp: " + i4.salesPrice);
	
}
}
