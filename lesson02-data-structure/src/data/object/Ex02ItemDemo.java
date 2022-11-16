package data.object;
import bean.Item;

public class Ex02ItemDemo {
	public static void main(String[] args) {
		// Item: id, name, salesPrice
		
		// int: KDL ==> int a = 5
		// Integer: KDL ==> Integer b = new Interger(5)
		// Item: KDL
		// new Item(): đối tượng(giá trị)(ô nhớ ở HEAP)
		// + tạo ra 1 ô nhớ ở heap 
		// + gán giá trị mặc định vào cho các thuộc tính 
		// 
		
		Item i1 = null;
		Item i2 = new Item(); //H14
		
		// Lỗi --> NPE ( Null Pointer Exception )
		// System.out.println("i1 id: "+ i1.id);
		
		i2.id = 123;
		i2.name = "Item A123"; 
		
		System.out.println("i2 id: "+ i2.id);
		System.out.println("i2 name: "+ i2.name);
		System.out.println("i2 sp: "+ i2.salesPrice);
		
		
		// Tạo 1 đối tượng đặt tên biến là i3 
		Item i3 = new Item();
		// id = 234, name = "Item B234", salesPrice = 20d
		i3.id = 234;
		i3.name = "Item B234"; 
		i3.salesPrice = 20d;
		
		// Khai báo, khởi tạo và gán giá trị vào
		Integer a1 = new Integer(125);
		System.out.println("a1 ==> " + a1);
		
		// in ra các giá trị
		System.out.println("i3 id: " + i3.id);
		System.out.println("i3 name: " + i3.name);
		System.out.println("i3 salesPrice: " + i3.salesPrice);

		Item i4 = new Item(345, "Item C345", 30d);
		System.out.println("i4 id: " + i4.id);
		System.out.println("i4 name: " + i4.name);
		System.out.println("i4 salesPrice: " + i4.salesPrice);
		System.out.println("i4: " + i4);
		
		// Java class mặc định kế thừa từ class 'Object '
	}
}
