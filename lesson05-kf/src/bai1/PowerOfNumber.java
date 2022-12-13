package bai1;

import java.util.Scanner;

public class PowerOfNumber {

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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhâp cơ số: ");
		int a = sc.nextInt();
		System.out.println("nhập số mũ: ");
		int b = sc.nextInt();
		System.out.println(isPowerOf(a, b));
	}

}