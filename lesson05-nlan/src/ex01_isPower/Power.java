package ex01_isPower;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a = ip.nextInt();
		int b = ip.nextInt();
		
		
	}
	public static boolean isPowerOf(int a, int b) {
		while (a > 0) {
			if (a == 1)
				return true;
			if (a < b)
				return false;
			if (a % b != 0) {
				return false;
			}
			a /= b;
		}
		return false;
	}
	
 }
