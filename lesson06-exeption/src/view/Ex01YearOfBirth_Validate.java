package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth_Validate {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int currentYear = Year.now().getValue();
		
		System.out.println("Enter year of birth: ");
		int yob = Integer.parseInt(sc.nextLine());	
		
		System.out.println("Your age: " + (currentYear-yob));
	}
}
