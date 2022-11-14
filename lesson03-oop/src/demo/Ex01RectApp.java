package demo;

import bean.Rectangle;

public class Ex01RectApp {
	public static void main(String[] args) {
		int a = 5;
		String s1 = "Hello";
		
		//Rectangle --> class --> KDL đối tượng
		//r1 --> variable
		//new Rectangle() --> Object --> giá trị mặc đinh
		
	// Thuộc tính class ở trạng thái public
//		Rectangle r1 = new Rectangle();
//		r1.width = 10;
//		r1.height = 6;
//		System.out.println("r1 --> " + r1);
//		
//		Rectangle r3 = new Rectangle(20, 10);
//		System.out.println("r3 --> " + r3);
		
	//Thuộc tính class ở trạng thái private
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(6);
		System.out.println("r1 --> " + r1);
	}
}