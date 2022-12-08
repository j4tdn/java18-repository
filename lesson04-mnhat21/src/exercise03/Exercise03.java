package exercise03;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Input n : ");
		int n = ip.nextInt();
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= i+1; j++) {
				System.out.print(combination(i+1,j) + " ");
			}
			System.out.println(" ");
		}
		
	}
	
	private static int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
	
	private static int combination(int n, int k) {
		return factorial(n)/(factorial(k)*factorial(n-k));
	}
}
