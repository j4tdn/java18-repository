package Validate_TryCatch;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth {
	public static void main(String[] args) {
		// Enter yob --> calculate age
		
		Scanner ip = new Scanner(System.in);
		
		int curentYear = Year.now().getValue();
		System.out.println("Current Year --> " + curentYear);
		
		System.out.println("Enter year of birth: ");
		int yob = Integer.parseInt(ip.nextLine());
		
		System.out.println("Your agge --> " + (curentYear - yob));
	}
}
