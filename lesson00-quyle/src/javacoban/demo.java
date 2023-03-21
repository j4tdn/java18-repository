package javacoban;

public class demo {
	public static void main(String[] args) {
		Point2d A = new Point2d(3, 4);
		Point2d O = new Point2d(0, 0);
		System.out.println("A :" + A.toString());
		System.out.println("O :" + O.toString());
		A.move(1, 1);
		System.out.println("A move : " + A.toString());
		float c =A.distance(O);
		System.out.println("c = " + c);
		utilyti.move(O, 1, 2);
		System.out.println("O --> " + O);
		Employee E1 = new Employee("quy ", 19, "quang nam ", 5, 5);
		System.out.println("E1 --> " + E1.toString());
	}
	
}
