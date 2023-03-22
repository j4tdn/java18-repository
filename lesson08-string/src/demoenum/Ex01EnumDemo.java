package demoenum;
import static demoenum.Position.*;

public class Ex01EnumDemo {
	public static void main(String[] args) {
		Point pA = new Point(3, 3);
		Point pO = new Point(0, 0);
		double R = 5d;
		
		Position position = getPosition(pA, pO, R);
		System.out.println("position: " + position);
		
		if (Position.INSIDE.equals(position)) {
			System.out.println("Vex đường thẳng -----------------------");
		}
	}
	
	private static Position getPosition(Point pA, Point pO, double R) {
		double distance = Math.sqrt(Math.pow(pA.getX() - pO.getY(), 2) + Math.pow(pA.getY() - pO.getY(), 2));
		
		if (distance == R) {
			return ONSIDE;
		}
		if (distance < R) {
			return INSIDE;
		}
		return OUTSIDE;
	}
	

}
