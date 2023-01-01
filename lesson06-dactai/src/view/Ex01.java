package view;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		double a, b;

		do {
				try {
					System.out.println("Enter number: ");
					a = input();
					b = input();
					System.out.println(a + "x" + "+" + b + "=" + divide(a, b));
				} catch (NumberFormatException | ArithmeticException e) {
					System.out.println(e.getMessage());
				}

		} while (true);

	}
	
	public static double input() {
		double number = 0d;
		Scanner in = new Scanner(System.in);
		do {
			try {
				number = Double.parseDouble(in.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid number!!!");
			}
			
		} while (true);
		
		return number;
	}
	
	public static double divide(double a, double b) {
		if(a == 0) {
			throw new ArithmeticException("Divide by zero!!!");
		}
		return -b/a;
	}
	
	

}
