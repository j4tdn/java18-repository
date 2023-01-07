package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth_Validate {
	public static void main(String[] args) {
		//Enter yob --> calcultate age
		Scanner ip = new Scanner(System.in);
		
		int currentYear = Year.now().getValue();
		System.out.println("Current year --> " + currentYear);
		

		String yobString = null;
		
		do {
			System.out.print("Enter year of birth: ");
			yobString = ip.nextLine();
			if(yobString.matches("\\d+")) {
				break;
			}
			
		} while (true);
		
		int yob = yob = Integer.parseInt(yobString);
		System.out.println("Your age --> " + (currentYear - yob + 1));
	}
	
	
}