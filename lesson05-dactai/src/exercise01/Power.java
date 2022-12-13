package exercise01;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		isPowerOf(a, b);
	}

	public static boolean isPowerOf(int a, int b) {
		int c = 1;
		if (a > b) {
			for (int i = 0; i < a; i++) {
				c *= b;

				if (a == c) {
					System.out.println("true");
					return true;
				} else if (c > a) {
					System.out.println("false");
					break;
				}

			}
		}

		else {
			for (int i = 1; i < b; i++) {
				c *= a;

				if (b == c) {
					System.out.println("true");
					return true;
				} else if (c > b) {
					System.out.println("false");
					break;
				}
			}
		}

		return false;

	}

}