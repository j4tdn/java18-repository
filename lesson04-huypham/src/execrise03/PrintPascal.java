package execrise03;

import java.util.Scanner;

public class PrintPascal {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = ip.nextInt();
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= i+1; j++) {
				System.out.print(combination(i+1,j) + " ");
			}
			System.out.println(" ");
		}
		
	}
	
	private static int factorial(int n) {
		if(n == 0 || n == 1)
			return 1;
		else 
			return n*factorial(n-1);
	}
	
	private static int combination(int n, int k) {
		return factorial(n)/(factorial(k)*factorial(n-k));
	}
}
