package exercises;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		while (true) {
			Double a = enterNumber();
			Double b = enterNumber();

			try {
				System.out.println("ket qua giai phuong trinh: " + divide(a, b));
				break;
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static Double enterNumber() {
		Scanner s = new Scanner(System.in);
		Double number = 0d;
		do {
			try {
				System.out.print("nhap so: ");
				number = Double.parseDouble(s.nextLine());
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
