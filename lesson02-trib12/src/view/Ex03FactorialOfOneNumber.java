package view;

import java.util.Scanner;

public class Ex03FactorialOfOneNumber {
	public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.print("Enter one number: ");
	
	int n =ip.nextInt();
	int a = 1;
	for (int i=1; i<=n; i++) {
		a = a * i;
	}
	
	System.out.println("Factorial of "+ n + " : " + a);
		
	
	}
}
