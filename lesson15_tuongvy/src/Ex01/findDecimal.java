package Ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class findDecimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double number;
		int i = 0;
		while (i < 3)
			try {
				number = scanner.nextDouble();
				if (number == (int) number) {
					System.out.println("Mời nhập lại");
					i++;
				} else {
					find(number);
				}
			} catch (InputMismatchException e) {
				System.out.println("Mời nhập lại số thực.");
				scanner.nextLine();
			}

	}

	private static void find(double number) {
		int count = 1;
		do {
			number = number * 10;
			count *= 10;
		} while (number != (int) number);

		int a = (int) number;
		int b = count;

		while (a != 0) {
			int temp = a;
			a = b % a;
			b = temp;
		}

		System.out.println((int) (number / b) + "/" + (int) (count / b));
	}
}