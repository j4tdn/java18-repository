package data.object;

import bean.Item;

public class Ex02ItemDemo {
	public static void main(String[] args) {
		///item: id, name, salesPrice
		
		//int: KDL ==> int a = 5
		//Item: KDL
		//new Item(); đối tượng(giá trị)(ô nhớ ở HEAP)
		//+ tạo ra 1 ô nhớ ở heap
		//+ gán giá trị mặc định vào thuộc tính
		
		Item i1 = null;
		Item i2 = new Item();
		
		//lỗi --> NPE
		//System.out.println("i1 id: "+ i1.id);
		
		i2.id = 123;
		i2.name = "Item A123";
		
		System.out.println("i2 id: "+ i2.id);
		System.out.println("i2 name: "+ i2.name);
		System.out.println("i2 sp: "+ i2.salesPrice);
	
		Item i3 = new Item();
		i3.id = 234;
		i3.name = "Item B234";
		i3.salesPrice = 20d;
		
		System.out.println("i3 id: "+ i3.id);
		System.out.println("i3 name: "+ i3.name);
		System.out.println("i3 sp: "+ i3.salesPrice);
		
		Item i4 = new Item(345, "Item C345",30d);
		System.out.println("i4: "+ i4);
		
		Integer a1= new Integer(15);
		System.out.println("a1: "+ a1);
	}
}
