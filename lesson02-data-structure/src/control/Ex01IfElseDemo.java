package control;

import java.util.Scanner;

public class Ex01IfElseDemo {
	public static void main(String[] args) {
		// 1. Nhập vào 1 số nguyên (n) --> Kiểm tra số đó là chẵn hay lẻ
		// + Nếu chẵn ==> 'this is even number'
		// + Nếu lẻ ==> do nothing

		Scanner ip = new Scanner(System.in);
		System.out.println("Enter point: ");
		float point = ip.nextFloat();
//		int n = ip.nextInt();
//		if (n % 2 == 0) {
//			System.out.println("this is even number");
//
//			// 1. Nhập vào 1 số nguyên (n) --> Kiểm tra số đó là chẵn hay lẻ
//			// + Nếu chẵn ==> 'this is even number'
//			// + Nếu lẻ ==> 'this is odd number'
//			System.out.println("Enter n2: ");
//			int n2 = ip.nextInt();
//			if (n2 % 2 == 0) {
//				System.out.println("this is even number");
//			} else {
//				System.out.println("this is odd number");
//			}
			
			// Tìm học lực học viên: getLevel(float point): String
			// BAD(<5), MEDIUM[5, 6.4], PRETTY_GOOD[6.5, 7,9], GOOD[>=8]
			
			System.out.println(getLevel(point));
		}
	
	
	private static String getLevel(float point) {
		if (point < 5f) {
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
