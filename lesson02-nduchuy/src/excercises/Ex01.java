package excercises;

import java.util.Scanner;

public class Ex01 {
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
		if (isMultipleOfTwo(number)) {
			System.out.println(number + " is multiple of base 2");
		} else
			System.out.println(number + " is not multiple of base 2");
		sc.close();
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

	public static boolean isMultipleOfTwo(int n) {
		if(n%2==0) {
			return true;
		}else {
			return false;
		}
	}
}
