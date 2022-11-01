package data.object;

import bean.Item;

public class Ex02ItemDemo {
	public static void main(String[] args) {
		// Item: id, name, salesPrice
		
		// int    : KDL ==> int a = 5;
		// Integer: KDL ==> Integer b = new Integer(5);
		// Item   : KDL 
		// new Item(): đối tượng (giá trị) (ô nhớ ở HEAP)
		// + Tạo ra 1 ô nhớ ở HEAP
		// + Gán giá trị mặc định vào cho các thuộc tính của Class
		
		Item i1 = null; // => chưa khởi tạo ô nhớ nào trên HEAP ==> ko thể in giá trị vì NullPointerException
		Item i2 = new Item(); // => đã khởi tạo ô nhớ trên HEAP và có giá trị mặc định của các thuộc tính
		
		// Gán giá trị cho các thuộc tính trên HEAP
		i2.id = 123;
		i2.name = "Item A123";
		
		System.out.println("i2 id: " + i2.id);
		System.out.println("i2 name: " + i2.name);
		System.out.println("i2 sp: " + i2.salesPrice);
		System.out.println("===================");
		
		// i3 
		Item i3 = new Item();
		i3.id = 234;
		i3.name = "Item B234";
		i3.salesPrice = 20d;
		
		System.out.println("i3 id: " + i3.id);
		System.out.println("i3 name: " + i3.name);
		System.out.println("i3 sp: " + i3.salesPrice);
		System.out.println("===================");
		
		// i4 > Khai báo và khởi tạo giá trị
		Item i4 = new Item(345, "Item C345", 30d);
		System.out.println("i4: " + i4);
		
		// Java class: mặc định kế thừa từ Class "Object"
		// Class Object ==> toString()
		// toString ==> getClass().getName() + "@" + hashcode()
		
		// Khi in ra biến
		// + KDL NT: in giá trị ở STACK
		// + KDL ĐT: in ô nhớ ở HEAP

	}

}
