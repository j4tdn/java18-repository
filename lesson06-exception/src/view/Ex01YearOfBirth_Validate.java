package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth_Validate {
	public static void main(String[] args) {
		// enter yob --> calculate age
		
		Scanner ip = new Scanner(System.in);
		
		int currentYear = Year.now().getValue();
		System.out.println("CurrenYear --> " + currentYear);
		
		String yobAsString = null;
		// Tiền xử lý
		do {
			System.out.print("Enter year of birth: ");
			yobAsString = ip.nextLine();
			if (yobAsString.matches("\\d+")) {
				break;
			}
		} while (true);
		// đảm bảo khi chạy lệnh không bị ném ra Exception
		
		int yob = Integer.parseInt(yobAsString);
		
		System.out.println("Your age --> " + (currentYear - yob +1 ));
		
	}

}
