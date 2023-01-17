package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

import javax.management.ImmutableDescriptor;

public class Ex01YearOfBirth_TryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int currentYear = Year.now().getValue();
		System.out.println("Hiên nạy là năm: " + currentYear);
		int yob = 0;

		do {
			System.out.print("Enter year of birth: ");
			try {
				yob = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				// e.printStackTrace(); //là lỗi đỏ và dừng chương trình như biên dịch java
				System.out.println("FAULT --> " + e.getMessage());
			}
		} while (true);

		System.out.println("Your age --> " + (currentYear - yob + 1));
	}
}
