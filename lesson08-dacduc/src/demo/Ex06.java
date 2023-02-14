package demo;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number : ");
		int ipNumber = sc.nextInt();
		System.out.print("Input position : ");
		int kNumber = sc.nextInt();
		System.out.println("Position " + kNumber + " --> number " + findNumberAtPosition(kNumber,ipNumber));
	}

	private static int findNumberAtPosition(int position,int number) {
		String value = String.valueOf(number);
		int result = Integer.parseInt(String.valueOf(value.charAt(position-1)));
		return result;
	}
}
