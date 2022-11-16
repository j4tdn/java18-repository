package demo;

import bean.Rectangle;

public class Ex01RectApp {
	public static void main(String[] args) {
		int a = 5;
//		class -> 1 attribute
		String s1 = "hello";
		String s2 = new String ("hello");
		
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeigth(6);
		System.out.println("r1 = " + r1);
		
		Rectangle r2 = new Rectangle();
		r2.setWidth(8);
		r2.setHeigth(4);
		System.out.println("r2 = " + r2);
		
		Rectangle r3 = new Rectangle(20,20);
		System.out.println("r3 = "+r3);
	}

}
