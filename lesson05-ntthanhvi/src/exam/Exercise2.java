package exam;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = ip.nextInt();
		System.out.println("is special number" );
	}
	
	private static boolean isSpecial (int n, int sum) {
		if (n != 1) {
			return false;
		}
		for (int i = 0; i < n ; i++) {
			sum += i;
			if ( n != sum) {
				return false;
			}
		}
		return true;
	}
}
