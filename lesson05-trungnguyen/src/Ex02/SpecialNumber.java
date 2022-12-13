package Ex02;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int num;
		System.out.println("enter num:");
		num=ip.nextInt();
		System.out.println("is: "+ isSpecialNumber(num));
	}
    private static boolean isSpecialNumber(int n) {
    	int s=0;
    	int i=0;
    	while(true) {
    		s=s+i;
    	  if(s>n) {
    		  return false;
    	  }
    	  else if(s==n) {
    		  return true;
    	  }
    		i++;
    	}
    	
    }
}
