package control;

import java.util.Scanner;

public class Ex01IfElseDemo {
	public static void main(String[] args) {
		// 1. Kiểm tra 1 số là chẳn hay lẻ
		// + nếu chẵn ==> 'this is even number'
		// + nếu lẻ ==> do thing
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = ip.nextInt();

		if (n % 2 == 0) {
			System.out.println("this is even number");
		}

		System.out.print("Enter n2: ");
		int n2 = ip.nextInt();
		if (n2 % 2 == 0) {
			System.out.println("this is even number");
		} else {
			System.out.println("this is odd number");
		}

		// Tìm học lực học viên: getLevel(float point): String
		// BAD (<5), MEDIUM[5,6.4]

		System.out.println("Enter point: ");
		float point = ip.nextFloat();
		String level = "";

		if (point < 5) {
			level = "BAD";
		}
		if (point >= 5f && point <= 6.4f) {
			level = "MEDIUM";
		}
		if (point >= 6.5f && point <= 7.9f) {
			level = "PRETTY_GOOD";
		}
		if (point >= 8f) {
			level = "GOOD";
		}

		System.out.println("level 1(main) =>> " + level);
		System.out.println("level 2 ==> " + getLevel(point));

	}

	public static String getLevel(float point) {

		if (point < 5f) {
			return "BAD";
		}
		if (point <= 6.4f) {
			return "Medium";

		}
		if (point <= 7.9f) {
			return "PRETTY_GOOD";
		}
		{
			return "GOOD";
		}

	}

}
