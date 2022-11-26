package homework;

import java.util.Scanner;

public class Exercise8 {
public static void main(String[] args) {
		
		int wrongTimes = 0;
		Scanner ip = new Scanner(System.in);
		String preN = ""; 
		
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ":";
			System.out.print("Enter number " + suffix);
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
		String result = isPrimeNumber(number) ? "Is prime number" : "Is not prime number";
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
	private static boolean isPrimeNumber (int number) {
		int count = 0;
		if (number == 1) {
			return false ;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				++count;
			}
		}
		if (count == 1) {
			return true;
		}
		return false;
	}
}
