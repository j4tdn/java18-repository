package demoenum;

public class Ex01EnumDemo {
	public static void main(String[] args) {
		Point pA = new Point(3,5);
		Point pB = new Point(0,0);
		double R = 5d;
		
		Position position = getPosition(pA, pB, R);
		System.out.println(position);
		
		if(Position.INSIDE.equals(position)) {
			System.out.println("Draw a line through 3 point");
		}
	}
	
	private static Position getPosition(Point pA, Point pB, double R) {
		double distance = Math.sqrt(Math.pow(pA.getX() - pB.getX(), 2) + Math.pow(pA.getY() - pB.getY(), 2));
		
		if(distance == R) {
			return Position.ONSIDE;
		}
		
		if(distance < R) {
			return Position.INSIDE;
		}
		return Position.OUTSIDE;
	}
}
