package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth_Validate {
	public static void main(String[] args) {
		// Enter yob --> calculate age

		Scanner ip = new Scanner(System.in);

		int currentYear = Year.now().getValue();
		System.out.println("Current year --> " + currentYear);

		String yobAsString = null;

		do {
			System.out.print("Enter year of birth: ");
			yobAsString = ip.nextLine();
			if (yobAsString.matches("\\d+")) {
				break;
			}
		} while (true);

		// Đảm bảo khi chạy lệnh, code sẽ không thể ném ra exception

		int yob = Integer.parseInt(yobAsString);

		System.out.println("Your age --> " + (currentYear - yob + 1));

	}

}
