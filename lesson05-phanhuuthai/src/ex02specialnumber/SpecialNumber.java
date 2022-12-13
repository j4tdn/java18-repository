package ex02specialnumber;

import java.util.Scanner;

public class SpecialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhập a: ");
		int a = Integer.parseInt(sc.nextLine());

		if (isSpecialNumber(a)) {
			System.out.println("a là số đặc biệt");
		} else {
			System.out.println("a không là số đặc biệt");
		}
	}

	public static boolean isSpecialNumber(int a) {
		int n = 0;
		for (int i = 1; i <= a; i++) {
			n = n + i;
			if(n == a) {
				return true;
			}
		}
		return false;
	}
}
