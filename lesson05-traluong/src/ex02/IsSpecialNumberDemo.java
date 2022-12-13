package ex02;

import java.util.Scanner;

public class IsSpecialNumberDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Enter number:");
		num = sc.nextInt();
		
		System.out.println("Special number? --> " + isSpecialNumber(num));
	}
	public static boolean isSpecialNumber(int a) {
		int s = 0;
		int i = 0;
		
		while (true) {
			s +=i;
			if (s > a) break;
			else if (s == a ) return true;
			i++;
		}
		
		return false;
	}
}	

