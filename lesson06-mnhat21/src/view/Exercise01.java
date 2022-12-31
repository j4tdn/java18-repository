package view;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Double result;
		while(true) {
			try {
				System.out.print("Enter value a : ");
				String a = ip.nextLine();
				System.out.print("Enter value b : ");
				String b = ip.nextLine();
				result = findRoot(a, b);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		System.out.println("Result : " + result);
	}
	
	private static Double findRoot(String a, String b) {
		if(Double.parseDouble(a) == 0d) {
			throw new ArithmeticException("a cannot be ZERO !!");
		}
		if(!a.matches("\\d+\\.\\d+") || !b.matches("\\d+\\.\\d+")) {
			throw new NumberFormatException("Input cannot be Character !!");
		}
		return Double.parseDouble(b) * -1 / Double.parseDouble(a);
	}
}
