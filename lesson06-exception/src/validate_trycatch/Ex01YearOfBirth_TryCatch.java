package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth_TryCatch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int currentYear = Year.now().getValue();
		int yob = 0;
		while(true) {
			try {
				System.out.print("Enter year of birth : ");
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Your age --> " + (currentYear - yob));
	}
}
