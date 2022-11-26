package ExLesson02;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = ip.nextInt();
		RadixConver(n);
	}

	private static void RadixConver(int n) {
		int original = n;
		int[] binaryNum = new int[100];
		int i = 0;
		if (n == 0) {
			System.out.print(n + "(10) ==> " + n + "(2) is 0");
			System.exit(0);
		}
		while (n > 0) {
			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}
		System.out.print(original + "(10) ==> ");
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(binaryNum[j]);
		}
		System.out.println("(2)");
	}

}
