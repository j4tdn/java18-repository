package exam;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = ip.nextInt();
		System.out.print("Enter b: ");
		int b = ip.nextInt();
	
		System.out.println("is power of " + isPower(a, b));
		
	}
	private static boolean isPower (int a, int b ) {
		if (a == 1 || b == 1) {
			return true;
		}
		int result = a / b;
		int remain = a % b;
		if (remain == 1) {
			return false;
		}
		return true;
	}
}

/*
 * 
		double result = Math.log(a)/Math.log(b);
		System.out.println("result: " + result);
		return Math.ceil(result) == Math.floor(result);
 */