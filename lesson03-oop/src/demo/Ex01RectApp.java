package demo;

import bean.Rectangle;

public class Ex01RectApp {
	public static void main(String[] args) {
		//class --> 1 attribute
		String s1 = "hello";
		String s2 = new String("hế nhô");
		System.out.println(s2);
		
		//Rectangle --> class --> KDL đối tượng
		//r1 --> variable
		//new Rectangle() --> Object --> giá trị 
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(6);
		System.out.println("r1 --- > "+r1.toString());
		
		//tạo một đối tượng có width = 8 height = 4
		Rectangle r2 = new Rectangle();
		r2.setWidth(8);
		r2.setHeight(4);
		System.out.println("r2 --- > "+r2.toString());
		//tạo một đối tượng có width = 20 height = 10
		Rectangle r3 = new Rectangle(20,10);
		System.out.println("r3 --- > "+r3.toString());
		
	}
}
