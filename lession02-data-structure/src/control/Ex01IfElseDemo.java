package control;

import java.util.Scanner;

public class Ex01IfElseDemo {
	public static void main(String[] args) {
		//1.
		Scanner ip = new Scanner(System.in);
//		
//		System.out.println("Enter n1:");
//		int n1 = ip.nextInt();
//		
//		if (n1 % 2 == 0) {
//			System.out.println("This is even number");
//		}
//		// 2.
//		System.out.println("Enter n2:");
//		int n2 = ip.nextInt();
//		
//		if (n2 % 2 == 0) {
//			System.out.println("This is even number");
//		} else {
//			System.out.println("This is even number");
//		}
		
		//Tim hoc luc hoc vien
		System.out.println("Enter student point:");
		float point = ip.nextFloat();
		System.out.println("Level ==> " + getLevel(point));
		
	}
	private static String getLevel(float point) {
		if (point < 5) {
			return "BAD";
		} 
		if (point <= 6.4f) {
			return "MEDIUM";
		}
		if (point <= 7.9f) {
			return "PRETTY_GOOD";
		}
		return "GOOD";
	}
}
