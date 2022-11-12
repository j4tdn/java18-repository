package control;

import java.util.Scanner;

public class Ex01IfElseDemo {
	public static void main(String[] args) {
		// 1. Kiểm tra 1 số là chẳn hay lẻ
		// nếu chản in ra this is even number
		// nếu lẻ in ra do nothing
		Scanner ip = new Scanner(System.in);
		/*
		 * System.out.println("Enter N: "); int n = ip.nextInt(); if (n % 2 == 0) {
		 * System.out.println("this is even number ^^ "); } else {
		 * System.out.println("do nothing :((( "); } System.out.println("Enter M: ");
		 * int M = ip.nextInt(); if (M % 2 == 0) {
		 * System.out.println("this is number ^^ "); } else {
		 * System.out.println("this is old number"); }
		 */
		// tìm học lực của học viên getLevel (float point): String
		// BAD (<5), MEDIUM [5, 6.4], PRETTY GOOD [65,7.9], GOOD [>= 8]
		System.out.println("Enter point: ");
		float point = ip.nextFloat();
		String level = " ";
		if (point < 5f) {
			level = "BAD";
		} else if (point <= 6.4f) {
			level = "medium";
		} else if (point <= 7.9f) {
			level = "pretty good";
		} else {
			level = "good";
		}

	}

	private static String getLevel(float point) {
		if (point < 5f) {
			return "bad";
		}
		if (point <= 6.4f) {
			return "medium";
		}
		if (point < 7.9f) {
			return "pretty good";
		}
		return "good";
	}
}