package Validate_TryCatch;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth_Validate {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		int curentYear = Year.now().getValue();
		System.out.println("Current Year --> " + curentYear);
		
//		System.out.println("Enter year of birth: ");
//		int yob = Integer.parseInt(ip.nextLine());

		String yobAssString = null;
		do {
			System.out.println("Enter year of birth: ");
			yobAssString = ip.nextLine();
			if(yobAssString.matches("\\d+")){
				break;
			}
		}while(true);
		
		int yob = Integer.parseInt(yobAssString);
		
		System.out.println("Your agge --> " + (curentYear - yob + 1));
	}
}
