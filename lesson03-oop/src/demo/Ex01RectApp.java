package demo;

import bean.Rectangle;

public class Ex01RectApp {
	public static void main(String[] args) {
		int a = 5;
		
		// KDL có sẵn của java --> chỉ có duy nhất 1 attribute
		String s1 = "hello";
		String s2 = new String("hello");
		
		
		// Rectangle --> Class --> KDL đối tượng
		// r1 --> variable
		// new Rectangle() --> object --> giá trị
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 6; 
		System.out.println("r1 --> " + r1);
		
		
		// TẠO MỘT ĐỐI TƯỢNG CÓ w-8, h-4
		Rectangle r2 = new Rectangle();
		r2.width = 8;
		r2.height = 4; 
		System.out.println("r2 --> " + r2);
		
		// TẠO MỘT ĐỐI TƯỢNG CÓ w-20, h-10
		Rectangle r3 = new Rectangle();
		r3.width = 20;
		r3.height = 10; 
		System.out.println("r3 --> " + r3);
	}
}
