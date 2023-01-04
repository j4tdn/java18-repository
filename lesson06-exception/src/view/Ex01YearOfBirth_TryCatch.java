package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth_TryCatch {
	public static void main(String[] args) {
		// enter yob --> calculate age
		
		Scanner ip = new Scanner(System.in);
		
		int currentYear = Year.now().getValue();
		System.out.println("CurrenYear --> " + currentYear);
		System.out.print("Enter year of birth: ");
		int yob = 0;
		while (true) {
			System.out.println("Enter year of birth: ");
			try {
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println(">>> " + e.getMessage());
			}
		}
		
		System.out.println("Your age --> " + (currentYear - yob +1 ));
		
	}

}
