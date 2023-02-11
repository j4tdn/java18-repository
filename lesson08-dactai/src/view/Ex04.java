package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number 1 here: ");
		int num1 = in.nextInt();
		System.out.print("Enter number 2 here: ");
		int num2 = in.nextInt();
		List<Integer> listNum1 = primeFactors(num1);
		List<Integer> listNum2 = primeFactors(num2);
		
		if (listNum1.equals(listNum2)) {
			System.out.println("YES");
		} else System.out.println("NO");

		
	}
	
	private static List<Integer> primeFactors(int n) 
	{ 
		List<Integer> res = new ArrayList<Integer>();
	    while (n%2 == 0) 
	    { 
	        if(!res.contains(2)) res.add(2);
	        n = n/2; 
	    } 
	     
	    for (int i = 3; i <= Math.sqrt(n); i = i+2) 
	    { 
	        while (n%i == 0) 
	        { 
	            if(!res.contains(i)) res.add(i);
	            n = n/i; 
	        } 
	    } 
	      
	    if (n > 2) 
	        res.add(n);
	    
	    return res;
	} 

}
