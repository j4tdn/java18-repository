package demo;

import bean.Rectangle;

public class Ex01RectApp {
	public static void main(String[] args) {
		
		// Rectangle --> class --> KDL đối tượng
		// r1 --> variable (biến)
		// new Rectangle() --> object --> giá trị
		
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(6);
		System.out.println("r1 --> " + r1);
		
		// Tạo 1 đối tượng có w-8, h-4
		Rectangle r2 = new Rectangle();
		r2.setWidth(8);
		r2.setHeight(4);;
		System.out.println("r2 --> " + r2);
		
		// Tạo 1 đối tượng có w-20, h-10
		Rectangle r3 = new Rectangle(20, 10);
	}
}
