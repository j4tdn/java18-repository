package control;

import java.util.Scanner;

public class Ex01IfElseDemo {
		// n
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n = ");
		int n = Integer.parseInt(sc.nextLine());
		if (n % 2 == 0) {
			System.out.println("This is even number");
		} else {
			System.out.println("this is old number");
		}
		
		// point
		System.out.println("Enter point: ");
		float point = sc.nextFloat();
		System.out.println(point);
		String level = "";
		if (point < 5f) {
			level = "BAD";
		}
		if (point >= 5f && point <= 6.4f) {
			level = "MEDIUM";
		}
		if (point >= 6.5f && point <= 7.9f) {
			level = "PRETTY_GOOD";
		}
		else {
			level = "GOOD";
		}
		System.out.println(level);

	}

	public static String getLevel(float point) {
		if (point < 5f) {
			return "BAD";
		}
		if (point < 6.4f) {
			return "MEDIUM";
		}
		if (point < 7.9f) {
			return "PRETTY_GOOD";
		}
		return "GOOD";

		/*
		 * System.out.println("Nhap diem: "); point = Float.parseFloat(sc.nextLine());
		 * String level = ""; if (point < 5) { level = "BAD"; } else if (point <= 6.4) {
		 * level = "MEDIUM"; } else if (point <= 7.9) { level ="PRETTY_GOOD"; } else {
		 * level = "GOOD"; } System.out.println("level ==> ");
		 */

	}

}
