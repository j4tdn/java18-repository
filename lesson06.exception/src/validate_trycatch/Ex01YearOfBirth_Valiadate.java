package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth_Valiadate {
	   public static void main(String[] args) {
				//Enter yob --> calculate age
	        	 
	        	 Scanner ip = new Scanner(System.in);
	        	 
	        	 int currentYear = Year.now().getValue();
	        	 System.out.println("Current year--->" + currentYear);
	        	 
	        	 String yobAsString="";
	        	 do {
	        		 System.out.print("Enter year of birth: ");
	        		 yobAsString=ip.nextLine();
	        		 if(yobAsString.matches("\\d+")) {
	        			 break;
	        		 }
	        	 }while(true);
	        	 
	        	
	        	 int yob =Integer.parseInt(yobAsString);
	        	 
	        	 System.out.print("your age--->"  + (currentYear-yob));
	        	 
	        	 
	        
			}
	

}
