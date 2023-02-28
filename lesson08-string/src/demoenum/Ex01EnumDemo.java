package demoenum;

import static java.lang.Math.*;
import static demoenum.Position.*;

public class Ex01EnumDemo {
	public static void main(String[] args) {
		/*
		 Ex11: Viết chương trình tìm vị trí tương đối 
		       của một điểm A so với đường tròn tâm O bán kính R
		       
		       . Nếu vị trí của điểm nằm trong đường tròn
		       --> Vẽ bán kính đi qua A
		       . Không làm gì cả 
		 */
		Point pA = new Point(3, 3);
		Point pO = new Point(0, 0);
		double R = 5d;
		
		Position position = getPosition(pA, pO, R);
		System.out.println("position: " + position);
		
		if (Position.INSIDE.equals(position)) {
			System.out.println("Vẽ đường thẳng ---------------");
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