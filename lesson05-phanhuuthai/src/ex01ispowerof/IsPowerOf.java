package ex01ispowerof;

import java.util.Scanner;

public class IsPowerOf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhập a: ");
		int a = Integer.parseInt(sc.nextLine());

		System.out.print("nhập b: ");
		int b = Integer.parseInt(sc.nextLine());

		if (isPowerOf(a, b)) {
			System.out.println("b là lũy thừa của a");
		} else {
			System.out.println("b không là lũy thừa của a");
		}
	}

	public static boolean isPowerOf(int a, int b) {
		if(b==0||b==1) {
			return true;
		}
		int x = b/a;
		int y = b%a;
		if(y!=0) {
			return false;
		}
		return isPowerOf(a, x);
	}
}
