package exercises;

import java.util.Scanner;

public class Ex03Factorial {
	public static void main(String[] args) {
		int wrongTimes = 0;
		Scanner ip = new Scanner(System.in);
		String preNum = "";

		do {
			String a = wrongTimes > 0 ? "(" + wrongTimes + "): " : ": ";
			System.out.print("Enter your number" + a);
			preNum = ip.nextLine();
			if (isNumber(preNum)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 5) {
				System.out.println("wrongTimes = 5 ........... Exit.........");
				System.exit(0);
			}
		} while (true);

		int N = Integer.parseInt(preNum);
		int a = 1;
		for(int i = 1; i <= N; i++) {
			a *= i;
		}
		System.out.println(a);
	}
	
	private static boolean isNumber(String text) {
		if (text == "") {
			return false;
		}
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) < '0' || text.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
}
