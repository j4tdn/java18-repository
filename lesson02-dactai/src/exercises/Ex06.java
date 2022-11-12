package exercises;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		String preInput = "";
		String txt = "acc";
		System.out.print("Enter a: ");
		int a = Integer.parseInt(getInput(preInput));
		System.out.print("Enter b: ");
		int b = Integer.parseInt(getInput(preInput));
		System.out.print("Enter c: ");
		int c = Integer.parseInt(getInput(preInput));
		System.out.println("Max = " + getMax(a, b, c));
		System.out.println("Min = " + getMin(a, b, c));

	}

	private static String getInput(String preInput) {
		Scanner ip = new Scanner(System.in);
		int count = 0;
		do {
			if (count > 0)
				System.out.print("Enter again: ");
			preInput = ip.nextLine();
			if (isValid(preInput)) {
				break;
			}
			count++;

		} while (true);
		return preInput;
	}

	private static boolean isValid(String text) {
		if (text.length() == 0) {
			return false;
		}

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) < '0' || text.charAt(i) > '9') {
				return false;
			}
		}
		if (Integer.parseInt(text) > 20) {
			return false;
		}
		return true;
	}

	private static int getMax(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;
		}
		if (b >= c) {
			return b;
		} else
			return c;
	}

	private static int getMin(int a, int b, int c) {
		if (a <= b && a <= c) {
			return a;
		}
		if (b <= c) {
			return b;
		} else
			return c;
	}

}
