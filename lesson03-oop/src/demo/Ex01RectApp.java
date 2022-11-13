package demo;

import bean.Rectangle;

public class Ex01RectApp {
	public static void main(String[] args) {
		// Rectangle --> class --> KDL đối tượng
		// r1 --> variable
		// new Rectangle() --> object
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(10);
		System.out.println("r1 --> " + r1);

		// Tạo đối tượng có w = 8, h = 4
		Rectangle r2 = new Rectangle(8, 4);
		System.out.println("r2 --> " + r2);

		// Tạo đối tượng có w = 20, h = 10
		Rectangle r3 = new Rectangle(20, 10);
		System.out.println("r3 --> " + r3);

		// Tạo đối tượng có thuộc tính bằng r2
		Rectangle r4 = new Rectangle(r2);
		System.out.println("r4 --> " + r4);
	}
}
