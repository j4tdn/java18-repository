package exam;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int number1 = ip.nextInt();
		int number2 = ip.nextInt();
		int tich = 1;
		if (number1 >= number2) {
			for (int i = 0; i < 100; i++) {
				tich = tich * number2;
				if (tich > number1) {
					System.out.println("false");
					System.exit(0);
				} else if (number1 == tich) {
					System.out.println("true");
					System.exit(0);
				}
			}
		} else {
			for (int i = 0; i < 100; i++) {
				tich = tich * number1;
				if (tich > number2) {
					System.out.println("false");
					System.exit(0);
				} else if (tich == number2) {
					System.out.println("true");
					System.exit(0);
				}
			}
		}
	}
}
