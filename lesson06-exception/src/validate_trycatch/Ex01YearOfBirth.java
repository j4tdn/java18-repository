package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

import javax.management.ImmutableDescriptor;

public class Ex01YearOfBirth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int currentYear = Year.now().getValue();
		System.out.println("Hiên nạy là năm 2023");

		System.out.print("Enter year of birth: ");
		int yob = Integer.parseInt(sc.nextLine());
		
		System.out.println("Your age --> "+(currentYear - yob));
	}
}

