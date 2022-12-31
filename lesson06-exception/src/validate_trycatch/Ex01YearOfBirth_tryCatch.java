package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth_tryCatch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int currentYear = Year.now().getValue();
		System.out.println("CurrentYear ---> " + currentYear);
		int yob=0;
		while(true ) {
			System.out.println("Enter year of birth: ");
			try {
				yob=Integer.parseInt(ip.nextLine());
				break;
			}catch(NumberFormatException e) {
				//e.printStackTrace();
				System.out.println(">>>> " + e.getMessage());
			}
			System.out.println("Your age --> " + (currentYear -yob+1));
		}
	}
}
