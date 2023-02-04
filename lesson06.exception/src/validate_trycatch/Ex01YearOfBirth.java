package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth {
         public static void main(String[] args) {
			//Enter yob --> calculate age
        	 
        	 Scanner ip = new Scanner(System.in);
        	 
        	 int currentYear = Year.now().getValue();
        	 System.out.println("Current year--->" + currentYear);
        	 
        	 System.out.print("Enter year of birth: ");
        	 int yob =Integer.parseInt(ip.nextLine());
        	 
        	 System.out.print("your age--->"  + (currentYear-yob));
        	 
        	 
        
		}
}
