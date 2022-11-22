package view;

import java.util.Scanner;

public class Ex05SymmetryNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = ip.nextInt();
		if (isSymmetryNumber(n)) {
			System.out.println("============== \nIs Symmetry Number");
		} else {
			System.out.println("============== \nIs not Symmetry Number");
		}

	}

	private static boolean isSymmetryNumber(int n) {
		int temp1 = n;
		int temp2 = n;
		int rev = 0;
		
		while (temp1 != 0) {
			temp1 = temp1 / 10;
		}

		while (temp2 != 0) {
			int a = temp2 % 10;
			temp2 = temp2 / 10;
			rev = rev * 10 + a;
		}

		if (rev == n) {
			return true;
		}
		return false;
	}

}
