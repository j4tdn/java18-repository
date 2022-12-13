package common.demo;

import inheritance.Shape;
import inheritance.Square;

public class AccessModifierDemo {
	public static void main(String[] args) {
		Shape s1 = new Square();
		s1.paint();
		
		// Rectangle r1 = new Rectangle();
		// r1.clear();
	}
}
