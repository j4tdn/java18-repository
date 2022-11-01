package data.object;

import bean.Item;

public class Ex02ItemDemo {
	public static void main(String[] args) {
		// 	Item:id, name, salesPrice
		
		// int    : KDL ==> int a = 5
		// Integer: KDL ==> Integer b = new Integer (5);
		// Item   : KDL
		// New Item(): dối tượng (giá trị) (ô nhớ ở HEAP)
		// + Tạo ra 1 ô nhớ ở HEAP
		// + Gán giá trị mặc định vào cho các thuộc tính
		
		Item i1 = null;
		Item i2 = new Item();
		
		i2.id = 123;
		i2.name = "Item A123";
		
		System.out.println("i2 id: " + i2.id);
		System.out.println("i2 name: " + i2.name);
		System.out.println("i2 salesPrice: " + i2.salesPrice);
		
		// Tạo 1 đối tượng đặt tên biến là i3 có
		// id = 234, name = "Item B234", salesPrice = 20d
		// rồi in ra
		
	Item i3 = new Item ();
	// gán giá trị cho thuộc tính
	i3.id = 234;
	i3.name = "Item B234";
	i3.salesPrice = 20d;
	
	// Khai báo, khởi tạo và gán giá trị vào
	// Integer a1 = new Integer(125);
	
	System.out.println("i3 id: " + i3.id);
	System.out.println("i3 name: " + i3.name);
	System.out.println("i3 salesPrice: " + i3.salesPrice);

	Item i4 =  new Item(345, "Item C345", 30d);
	System.out.println("i4 ==> " + i4);
	// System.out.println("i4 ==> " + i4.toString());
	
	// JAVA class mặc định kế thừa từ class 'Object'
	// class Object
	}
}
