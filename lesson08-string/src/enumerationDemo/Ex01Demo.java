package enumerationDemo;

import static java.lang.Math.*;
import static enumerationDemo.Position.*;

public class Ex01Demo {
	public static void main(String[] args) {
		Point pA = new Point(3, 3);
		Point pO = new Point(0, 0);
		double R = 5d;

		Position position = getPosition(pA, pO, R);
		System.out.println("position: " + position);

		if (INSIDE.equals(position)) {
			System.out.println("Vẽ đường thẳng ------------");
		}
	}

	private static Position getPosition(Point pA, Point pO, double R) {
		double distance = sqrt(pow(pA.getX() - pO.getX(), 2) + pow(pA.getY() - pO.getY(), 2));

		if (distance == R) {
			return ONSIDE;
		}

		if (distance < R) {
			return INSIDE;
		}
		return OUTSIDE;
	}
}