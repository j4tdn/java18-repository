package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int currentYear = Year.now().getValue();
		String yob_String = null;
		do {
			System.out.println("Enter year of birth: ");
			yob_String = sc.nextLine();
			if (yob_String.matches("\\d+")) {
				break;
			}
		}while(true);
		
		int yob = Integer.parseInt(yob_String);	
		
		
		System.out.println("Your age: " + (currentYear-yob+1));
	}
}
