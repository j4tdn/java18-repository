package demo;

import bean.Rectangle;

public class Ex01RectApp {
	public static void main(String[] args) {
		int a = 5;

		// class --> 1 attribute
		String s1 = "hello";
		String s2 = new String("hello");
		// Rectangle --> class --> KDL đối tượng
		// r1 là biến
		// new Rectangle() ->> đối tượng
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(6);
		System.out.println("r1 -> " + r1);
		
		// tạo 1 đối tượng có w=8 ; h=4;
		Rectangle r2 = new Rectangle();
		r2.setHeight(8);
		r2.setWidth(10);
		System.out.println("r2 -> " + r2);
		// tạo 1 đối tượng có w=20; h=10;
		Rectangle r3 = new Rectangle(10,20);
		System.out.println("r3 -> " + r3);
		
	}
}
