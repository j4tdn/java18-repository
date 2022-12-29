package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth_Validate {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		int currentYear = Year.now().getValue();
		
		String yobAsString = null;
		do {
			System.out.print("Enter year of birth : ");
			yobAsString = ip.nextLine();
			if(yobAsString.matches("[1-9]+")){
				break;
			}
		} while(true);
		
		
		int yob = Integer.parseInt(yobAsString);
		
		System.out.println("Your age --> " + (currentYear - yob));
		
	}
}
