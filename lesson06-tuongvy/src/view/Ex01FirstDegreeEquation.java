package view;
import java.util.Scanner;

public class Ex01FirstDegreeEquation {
	public static void main(String[] args) {
		double a, b;
		do {
			try {
				System.out.println("Enter Number: ");
				a = input();
				b = input();
				System.out.println(a + " * x + " + b + " = " + divide(a, b));
			} catch (NumberFormatException | ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			
		}while(true);
	}
	
	private static double input() {
		Scanner sc = new Scanner(System.in);
		double number = 0d;
		do {
			try {
				number = Double.parseDouble(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid Number!");
			}
		}while(true);
		return number;
	}
	
	private static double divide(double a, double b) {
		if (a == 0) {
			throw new ArithmeticException("Divide by zero!");
		}
		return -b/a;
	}
	

}
