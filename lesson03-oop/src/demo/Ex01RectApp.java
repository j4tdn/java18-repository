package demo;

import bean.Rectangle;

public class Ex01RectApp {
	public static void main(String[] args) {
		int a = 5;
		String s1 = "hello";
		String s2 = new String("hello");

		// Rectangle --> class --> KDL đối tượng
		// r1--> variable
		// new Rectangle() --> object --> giá trị
		Rectangle r1 = new Rectangle();

		r1.setWidth(10);
		r1.setHeight(6);
		System.out.println("r1--> " + r1);

		Rectangle r2 = new Rectangle();

		r2.setWidth(8);
		r2.setHeight(4);
		System.out.println("r2--> " + r2);
	}

}
