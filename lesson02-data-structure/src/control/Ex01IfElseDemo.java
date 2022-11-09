package control;

import java.util.Scanner;

public class Ex01IfElseDemo {
	public static void main(String[] args) {
		// Kiem tra 1 so hay le
		// + Neu chan ==> 'This is even number'
		// + Neu le ==> Do nothing
		
		Scanner ip = new Scanner(System.in);
		
		// int n = ip.nextInt();
		
		System.out.print("Input : ");
		float point = ip.nextFloat();
		
//		if(n % 2 == 0) {
//			System.out.println("This is even number");
//		}
//		
//		
//		// Kiem tra 1 so hay le
//		// + Neu chan ==> 'This is even number'
//		// + Neu le ==> 'This is odd number'
//		else {
//			System.out.println("This is odd number");
//		}
		
		System.out.println(getLevel(point));
		
	}
	
	public static String getLevel(float point) {
		if(point < 5f && point >= 0f) {
			return "BAD";
		}
		else if(point <= 6.4f) {
			return "MEDIUM";
		}
		else if(point <= 7.9f) {
			return "PRETTY_GOOD";
		}
		return "GOOD";
	}
}
