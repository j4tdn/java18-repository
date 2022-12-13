package ex01;

import java.util.Scanner;

public class IsPowerOfDemo {
	public static void main(String[] args) {
		int power;
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter power: ");
		power = sc.nextInt();
		
		System.out.println("Enter number: ");
		number = sc.nextInt();
		
		System.out.println("Result is --> " + isPowerOf(power, number));
		
	}
	public static boolean isPowerOf(int a, int b) {
		double result = Math.log(a)/Math.log(b);	
		if (result%1 == 0) {
			return true;
		}
		
		return false;
	}
}
