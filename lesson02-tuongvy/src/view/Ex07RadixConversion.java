package view;

import java.util.Scanner;

public class Ex07RadixConversion {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("He thap phan: ");
		int N = sc.nextInt();
		int temp = 0, n, i = 1;
		do {
			n = N % 2;
			temp = temp + (i * n);
			N = N /2;
			i = i * 10;
		} while (N > 0);
		
		
		System.out.println("He nhi phan: " + temp);
		
	}
	
	
}
