package kf;

import java.util.Scanner;

public class Ex01Exponential {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("nhap so can kiem tra: ");
		int  a = ip.nextInt();
		System.out.println("nhap so can kiem tra: ");
		int  b = ip.nextInt();
		System.out.println(isPower(a, b));
	}
	
	private static boolean isPower(int power, int number) {
		double result = Math.log(power) / Math.log(number);
		return Math.ceil(result) == Math.floor(result);
	}

}
