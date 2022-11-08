package control;

import java.util.Scanner;

public class Ex01IfElseDemo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n1: ");
		int n1 = ip.nextInt();
		if (n1 % 2 == 0) {
			System.out.println("this is number");
		}
		System.out.println("Enter n2: ");
		int n2 = ip.nextInt();
		if (n2 % 2 == 0) {
			System.out.println("this is even number");
		} else {
			System.out.println("this is odd number");
		}
		//
		System.out.println("Enter point: ");
		float point = ip.nextInt();

		String level = "";
		if (point < 5f) {
			level = "BAD";
		}
		if (point > 5f && point <= 6.4f) {
			level = "MEDIUM";
		}
		if (point > 5f && point <= 7.9f) {
			level = "PRETTY GOOD";
		}
		if (point >= 8f) {
			level = "GOOD";
		}
		System.out.println("level 1(main) ==> " + level);
		System.out.println("level 2(getLevel) ==> " + getLevel(point));
	}

	private static String getLevel(float point) {
		if (point < 5f) {
			return "BAD";
		}
		if (point <= 6.4f) {
			return "MEDIUM";
		}
		if (point <= 7.9f) {
			return "PRETTY GOOD";
		}
		return "GOOD";
	}

}
