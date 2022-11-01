package data.object;

import bean.Item;

public class Ex02ItemDemo {
	public static void main(String[] args) {
		// Item: id, name, salesPrice
		
		// int: KDL ==> int a = 5;
		// Item: KDL
		// new Item(): đối tượng (giá trị)(ô nhớ  ở HEAP)
		// + tạo ra 1 ô nhớ ở heap
		// + gán giá trị mặc định vào cho các thuộc tính
		
		Item i1 = null;
		Item i2 = new Item(123, "Item A123",0d);
		
		// Lỗi --> NPE
		// System.out.println("i1 id:" + i1.id);
		System.out.println(i2);

		
		Item i3 = new Item(234, "Item B234", 20d);
		System.out.println("i3 id: " + i3.id);
		System.out.println("i3 name: " + i3.name);
		System.out.println("i3 sp: " + i3.salesPrice);
		Item i4 = new Item(456, "Item C456", 30d);
		System.out.println("i4 id: " + i4.id);
		System.out.println("i4 name: " + i4.name);
		System.out.println("i4 sp: " + i4.salesPrice);
		
	}
}
