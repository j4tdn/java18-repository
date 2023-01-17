package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

import javax.management.ImmutableDescriptor;

public class Ex01YearOfBirth_Validate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int currentYear = Year.now().getValue();
		System.out.println("Hiên nạy là năm 2023");
		
		String yobAsString = null;
		do {
			System.out.print("Enter year of birth: ");
			yobAsString = sc.nextLine();
			if(yobAsString.matches("\\d+")) { //xử lý chuỗi có những số nguyên hay không
				break;
			}
		}while(true);
		
		int yob = Integer.parseInt(yobAsString);
		
		System.out.println("Your age --> "+(currentYear - yob));
	}
}
