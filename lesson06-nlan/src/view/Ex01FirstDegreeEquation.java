package view;

import java.util.Scanner;

public class Ex01FirstDegreeEquation {

	public static void main(String[] args) {
		do {
			Double a = enterNumber();
			Double b = enterNumber();
			try {
				System.out.println("X: " + divide(a, b));
				break;
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}

		} while (true);

	}

	private static Double enterNumber() {
		Scanner ip = new Scanner(System.in);
		Double number = 0d;
		do {
			try {
				System.out.println("Enter number: ");
				number = Double.parseDouble(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Number is not valid");

			}
		} while (true);
		return number;
	}

	public static Double divide(Double a, Double b) {
		if (a == 0) {
			throw new ArithmeticException("Denominator cannot be ZERO");
		} else {
			return -b / a;
		}
	}

}
