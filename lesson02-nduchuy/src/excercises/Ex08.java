package excercises;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wrongTimes = 0;
		String preNumber = "";

		do {
			wrongTimes++;
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "): " : ": ";
			System.out.print("Please enter valid number" + suffix);

			preNumber = sc.nextLine();
			if (isNumber(preNumber)) {
				if (Integer.parseInt(preNumber) > 0) {
					break;
				}
			}

			if (wrongTimes == 5) {
				System.out.println("Over five times ===> Lock");
				System.exit(0);
			}
		} while (true);

		int number = Integer.parseInt(preNumber);
		if(isPrimeNumber(number)) {
			System.out.println(number+ " is prime number");
		}else {
			System.out.println(number+ " is not prime number");
		}
	}

	private static boolean isNumber(String text) {
		if (text.length() == 0) {
			return false;
		}
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}

	private static boolean isPrimeNumber(int number) {
		int count = 0;
		if(number==1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if(number % i==0) {
				++count;
			}
		}
		if(count == 0) {
			return true;
		}else {
			return false;
		}
	}
}
