package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter s:");
		int s = ip.nextInt();
		
		System.out.println(isSpecialNumber());
	}

	public static boolean isSpecialNumber() {
	
		for (int i = 0; i < 100; i++) {
			int v = 0;
			v += i;
			if (s == v) {
				return true;
			}

		}
	}
}
