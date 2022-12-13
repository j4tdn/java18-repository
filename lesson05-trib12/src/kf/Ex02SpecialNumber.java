package kf;

import java.util.Scanner;

public class Ex02SpecialNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("nhap so can kiem tra");
		int n = ip.nextInt();
		System.out.println(isSpecialNumber(n));
	}

	private static boolean isSpecialNumber(int a) {
		int i = 1, sum =0;
		do {
			i++;
			sum = sum+i;
		}
		while(i<a);
		return sum == a;
	}
	
}


