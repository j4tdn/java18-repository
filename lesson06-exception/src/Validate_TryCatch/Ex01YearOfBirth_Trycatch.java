package Validate_TryCatch;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth_Trycatch {
	public static void main(String[] args) {
		// Enter yob --> calculate age
		
		Scanner ip = new Scanner(System.in);
		
		int curentYear = Year.now().getValue();
		System.out.println("Current Year --> " + curentYear);
		
		int yob = 0;
		while(true) {
			System.out.println("Enter year of birth: ");
			try {
				// JAVA --> new NumberFormatException
				yob = Integer.parseInt(ip.nextLine());
				break;
			}catch(NumberFormatException e){
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("Your agge --> " + (curentYear - yob + 1));
	}
}
