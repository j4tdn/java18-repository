package demoenum;

import java.lang.Math;

public class Ex01EnumDemo {
	public static void main(String[] args) {
		Point pA = new Point(3, 3);
		Point pO = new Point(0, 0);
		double r = 5d;
		
		Position position = getPosition(pA, pO, r);
		System.out.println("Position: " + position);
		
		if(Position.INSIDE.equals(position)) {
			System.out.println("Vẽ đường thẳng ------------");
		}
		
	}
	
	private static Position getPosition(Point pA, Point pO, double R) {
		double distance = Math.sqrt(Math.pow(pA.getX() - pO.getX(), 2) - Math.pow(pA.getY() - pO.getY(), 2));
		if (distance == R) {
			return Position.ONSIDE;
		}
		if (distance < R) {
			return Position.INSIDE;
		}
		return Position.OUTSIDE;
	}
}
