package homework;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		int n = 6;
		System.out.println(n + "! =" + fact(n));
		
	}
	
	private static int fact(int n) {
		int f = 1;
		while ( n > 1) {
			f *= n--;
		}
		return f;
	}
}
