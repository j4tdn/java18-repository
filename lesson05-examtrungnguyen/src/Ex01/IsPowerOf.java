package Ex01;

import java.util.Scanner;

public class IsPowerOf {
	public static void main(String[] args) {
		int pow, num;
		Scanner ip = new Scanner(System.in);

		System.out.println("enter power:");
		pow = ip.nextInt();
		Scanner sc = new Scanner(System.in);

		System.out.println("enter number:");
		num = sc.nextInt();
		System.out.println(" is:"+isPowerOf(pow, num));

	}

	private static boolean isPowerOf(int a, int b) {
		double result = Math.log(a) / Math.log(b);

		if (result % 1 == 0) {
			return true;
		}
		return false;
	}
}
