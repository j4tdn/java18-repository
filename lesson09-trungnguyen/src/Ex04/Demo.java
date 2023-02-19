package Ex04;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
     public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String tk = null;
	    String mk = null;
	    System.out.println("enter your tk: ");
    	tk = sc.nextLine();
	    do {
	    	
	    	System.out.println("enter your mk: ");
	    	mk=sc.nextLine();
	    	try {
				if (isValid(mk,tk)) {
					System.out.println("Password is valid!");
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				
			}
	    }while(true);
	}
     
     private static boolean isValid(String mk, String tk) throws Exception{
    	 if (mk.length() < 8) {
 			throw new Exception("Password must contain at least 8 character!!!");
 		}
    	 if (!Pattern.matches(".*[A-Z].*", mk)) {
 			throw new Exception("Password must contain at least 1 uppercase aphabetic character (A,B,C,..)");
 		}
    	int count = 0;
    	char c1=mk.charAt(0);
    	char[] c1_arr =mk.toCharArray();
    	char c2=mk.charAt(0);
    	char[] c2_arr =tk.toCharArray();
    	for(char char1: c1_arr) {
    		for(char char2: c2_arr) {
    			if(char1==char2) {
    				count++;
    			}
    		}
    	}
    	if(count>3) {
    		
    		throw new Exception("no no no");
    		
    		
    	}
    	
    	 return true;
     }
     
     
}
