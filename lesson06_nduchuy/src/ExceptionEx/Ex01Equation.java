package ExceptionEx;

import java.util.Scanner;

public class Ex01Equation {
	public static void main(String[] args) {
		do {
			System.out.print("Enter number a: ");
			double a = validNumber();
			System.out.print("Enter number b: ");
			double b = validNumber();
			try {
				System.out.println("x= "+solution(a, b));
				break;
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}
	public static double validNumber() {
		Scanner sc = new Scanner(System.in);
		double number;
		do {
			try {
				number = Double.parseDouble(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.print("Please enter valid number: ");
			}
		} while (true);
		return number;
	}
	public static double solution(double a, double b) {
		if(a == 0) {
			throw new ArithmeticException("a cannot be a ZERO");
		}else {
			return -b/a;
		}
	}
}
