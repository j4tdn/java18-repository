package control;

import java.util.Scanner;

public class Ex01IfElseDemo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n: ");
		int a = Integer.parseInt(ip.nextLine());

		if (a % 2 == 0) {
			System.out.println("this is even number");
		} else {
			System.out.println("this is odd number");
		}

		System.out.println("Enter point: ");
		float p = ip.nextFloat();
		System.out.println(getLevel(p));
	}

	public static String getLevel(float point) {
//		if (point < 5) {
//			return "BAD";
//		} else {
//			if (point <= 6.4) {
//				return "MEDIAN";
//			} else {
//				if (point <= 7.9) {
//					return "PRETTY_GOOD";
//				} else {
//					return "GOOD";
//				}
//			}
//		}
		
		if(point < 5f) {
			return "BAD";
		}
		if(point <= 6.4f) {
			return "MEDIUM";
		} 
		if(point <= 7.9f) {
			return "PRETTY_GOOD";
		}
		return "GOOD";
	}
}
