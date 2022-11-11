package view;

import java.util.Scanner;
public class Ex07TransferBinaryNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = ip.nextInt();
		if (n != 0) {
			System.out.print("Binary number of "+n +":");
			Transfer(n);
		} else {
			System.out.print("Binary number of n --> 0");
		}
	}

	private static void Transfer(int n) {

		if (n != 0) {
			Transfer(n / 2);
			System.out.print(n % 2);
		}
	}
}
