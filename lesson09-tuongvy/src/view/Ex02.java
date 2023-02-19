package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input: ");
		int n = sc.nextInt();
		int m = n;
		int a;
		int count = 0;
		Arrays arr;
		String s = String.valueOf(n);
		for (int i = 0; i < n; i++) {
			while(n > 0) {
				a = n%10;
				n = n/10;
				count += a*a;
			}
		
			n = count;
			count = 0;
			if (n == 1) {
				System.out.println(m + " la so hanh phuc");
				break;
			}
		}
	}

}
