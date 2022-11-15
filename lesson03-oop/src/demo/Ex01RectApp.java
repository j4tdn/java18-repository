package demo;

import bean.Rectangle;

public class Ex01RectApp {
	public static void main(String[] args) {
		int a = 5;
		String s1 = "hello";
		String s2 = new String("hello");
		
		// Rectangle là 1 class --> KDL đối tượng 
		// r1 --> variable
		// new Rectangle() --> object --> giá trị
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(6);
		System.out.println(" r1 --> " + r1); 
		// Tao 1 doi tuong co w-8, h-4
		Rectangle r2 = new Rectangle();
		r2.setWidth(8);
		r2.setHeight(4);
		System.out.println(" r2 --> " + r2); 
		
		
		// Tao 1 doi tuong co w-20, h-10
		Rectangle r3 = new Rectangle(20, 10);
		System.out.println(" r3 --> " + r3); 
		
		
		
	}
}
