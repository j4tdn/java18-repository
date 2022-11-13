package exercises02;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		
		int wrongTimes = 0;
		Scanner ip = new Scanner(System.in);
		String preN = ""; 
		
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ":";
			System.out.print("Please enter valid n " + suffix);
			preN = ip.nextLine();
			if (isNumber(preN)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 5) {
				System.out.println("Wrong time = 5");
				System.exit(0);
			}
		} while (true); 
		
		int number = Integer.parseInt(preN);
		String result = isPowerOf2(number) ? "Is power of 2" : "Is not power of 2";
		System.out.println(result);
		
	}
	private static boolean isNumber (String text) {
		if (text.length() == 0) {
			return false;
		}
		for (int i =0; i < text.length();i++) {
			char letter = text.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}
	private static boolean isPowerOf2 (int number) {
		if (number == 1) {
			return true ;
		}
		int result = number / 2;
		int remain = number % 2;
		if (remain == 1) {
			return false;
		}
		return isPowerOf2(result);
	}
}
