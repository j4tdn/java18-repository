package demo;

import bean.Rectangle;

public class Ex01RectApp {
	public static void main(String[] args) {
		int a = 5;
		
		// class --> 1 acttibute
		String s1 = "hello";
		String s2 = new String("hello");
		
		// Rectangle --> class --> KDL đối tượng
		// r1 --> variable
		// new Rectangle () --> Object --> giá trị
		
		Rectangle r1 = new Rectangle();
		r1.setwidth(10);
		r1.setheight(6);
		System.out.println("r1 --> " + r1);
		
		// Tạo một đối tượng có w-8, h-4
		Rectangle r2 = new Rectangle();
		r2.setwidth(8);
		r2.setheight(4);
		System.out.println("r2 --> " + r2);
		
		
		
		Rectangle r3 = new Rectangle();
		r3.setwidth(10);
		r3.setheight(6);
		System.out.println("r3 --> " + r3);
		
	}
}
