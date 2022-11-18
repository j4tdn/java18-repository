package demo;

import been.Rectangle;

public class Ex01RectApp {
	public static void main(String[] args) {
		int a = 5;
		// a = biến; 5= giá trị; int= KDL
		String s1 = "hello";
		String s2 = new String("hello");

		// Rectangle --> class --> KDL đối tượng
		// r1 --> biến (variable)
		// new Rectangle() --> object --> giá trị
		Rectangle r1 = new Rectangle();
		// Khởi tạo 1 ô nhớ ở HEAP
		//r1.width = 10; Thay đổi giá trị biến width trong r1
		r1.setWidth(10);
		r1.setHeight(6);
		System.out.println("r1 --> " + r1);
		// mặc định gọi hàm toString

		// Tạo một đối tượng có w-8, h-4
		Rectangle r2 = new Rectangle();
		r2.setWidth(8);
		r2.setHeight(4);
		System.out.println("r2 --> " + r2);

		// Tạo một đối tượng có w-20, h-10
		Rectangle r3 = new Rectangle(20,10);
		System.out.println("r3 --> " +r3);
	}
}
