package data.object;

import bean.Item;

public class Ex02ItemDemo {
	public static void main(String[] args) {
		// Item: id, name, salesPrice
		
		// int : KDL ==> int a = 5
		// Item: KDL
		// new Item(): đối tượng (giá trị)(ô nhớ ở HEAP)
		// + tạo ra 1 ô nhớ ở HEAP
		// + gán giá trị mặc định vào cho các thuộc tính
		
		Item i1 = null;
		Item i2 = new Item();// H14
		
		// Lỗi --> NPE
		// System.out.println("i1 id: " + i1.id);
		
		i2.id = 123;
		i2.name = "Item A123";
		
		
		System.out.println("i2 id: " + i2.id);
		System.out.println("i2 name: " + i2.name);
		System.out.println("i2 sp: " + i2.salesPrice);
		
		// Tạo 1 đối tượng đặt tên biến là i3 có
		// id = 234, name = "Item B234", salesPrice = 20d
		// rồi in ra
		
		// khai báo và khởi tạo ô nhớ
		Item i3 = new Item();
		
		// gán giá trị cho thuộc tính
		i3.id = 234;
		i3.name = "Item B234";
		i3.salesPrice = 20d;
		
		// Khai báo, khởi tạo và gán giá trị vào
		// Integer a1 = new Integer(125);
	
		
		System.out.println("i3 id: " + i3.id);
		System.out.println("i3 name: " + i3.name);
		System.out.println("i3 sp: " + i3.salesPrice);
		
		Item i4 = new Item(345, "Item C345", 30d);
		System.out.println("i4 ==> " + i4);
		// System.out.println("i4 ==> " + i4.toString());
		
		
		// Java class mặc định kế thừa từ class 'Object'
		// class Object ==> toString()
		// toString ==> getClass().getName() + "@" + hashcode
		
		// Khi in ra biến
		// KDL NT: giá trị ở STACK
		// KDL ĐT: tự động gọi hàm toString của class Object
	}
}
