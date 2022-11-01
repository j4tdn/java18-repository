package data.object;

import bean.Item;

public class Ex02ItemDemo {
	public static void main(String[] args) {
		// Item: id, name, salesPrice
		
		// new Item(): đối tượng( giá trị ) ( ô nhớ ở HEAP )
		// + tạo ra một ô nhớ ở heap
		// + gán 1 giá trị mặc định vào cho các thuộc tính
		
		
		// rê chuột vào chử cuối cùng + ctrl space
		Item i1 = null;
		Item i2 = new Item();
		
		// Lỗi: NullPointerExeption
//		System.out.println("i1 id: " + i1.id);
		i2.id=123;
		i2.name="Item 123";
		
		System.out.println("i2 id: " + i2.id);
		System.out.println("i2 name: " + i2.name);
		System.out.println("i2 sp: " + i2.salesPrice);
		
		//Khai báo, khởi tạo và gán giá trị vào
		Integer a1 = new Integer(25);
		System.out.println("a1: " + a1);
		System.out.println("a1: " + a1.toString());
		
		
		// java class mặc định kế thừa từ class "object"
		// Class Object => toString();
		
		// khi in ra biến
		// KDL nguyên thủy: in ra giá trị ở STACK
		// KDL đối tượng: tự động gọi hàm toString() 
		
		Item i3 = new Item(234,"Item B234",20d);
		
		System.out.println("i3 id: " + i3.id);
		System.out.println("i3 name: " + i3.name);
		System.out.println("i3 sp: " + i3.salesPrice);
		
		System.out.println(i3);
		System.out.println(i3.toString());
		
		
	}
}
