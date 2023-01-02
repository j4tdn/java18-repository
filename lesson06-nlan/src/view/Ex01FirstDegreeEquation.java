package view;

import java.util.Scanner;

public class Ex01FirstDegreeEquation {
	
public static void main(String[] args) {
	
	
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

}
