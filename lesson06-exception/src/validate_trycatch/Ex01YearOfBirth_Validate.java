package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth_Validate {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	int currentYear = Year.now().getValue();
	System.out.println("CurrentYear ---> " + currentYear);
	String yobAsString = null;
	do {
		System.out.println("Enter year of birth: ");
		yobAsString = ip.nextLine();
		if(yobAsString.matches("\\d+")) {
			break;
		}
	}while(true);
	int yob=Integer.parseInt(ip.nextLine());
	System.out.println("Your age --> " + (currentYear -yob+1));
	
}
}
