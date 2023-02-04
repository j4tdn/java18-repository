]]]]]]ưpackage validate_trycatch;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth_TryCatch {
	public static void main(String[] args) {
		//Enter yob --> calculate age
    	 
    	 Scanner ip = new Scanner(System.in);
    	 
    	 int currentYear = Year.now().getValue();
    	 System.out.println("Current year--->" + currentYear);
    	 
    	
    	 int yob =0;
    	 while(true) {
    		 System.out.print("Enter year of birth: ");;
    		 try {
    			 //JaVA --> new NumberFormatException("....");
    			 yob =Integer.parseInt(ip.nextLine());
    			 break;
    		 }catch(NumberFormatException e) {
    			 //e.printStackTrace();
    			 System.out.println(">>>"+ e.getMessage());
    		 }
    		 
    	 }
    	 
    	 System.out.print("your age--->"  + (currentYear-yob));
    	 
    	 
    
	}
}
