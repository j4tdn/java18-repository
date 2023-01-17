package common.demo;

import inheritance.Retangle;
import inheritance.Shape;
import inheritance.Square;

public class AccessModifierDemo extends Retangle {
	public static void main(String[] args) {
		Shape s1 = new Square();
		s1.paint();	
		
		AccessModifierDemo s2 = new AccessModifierDemo();
		s2.clear();
		
//		Retangle s3 = new Retangle();
//		s3.clear();
	}
}
