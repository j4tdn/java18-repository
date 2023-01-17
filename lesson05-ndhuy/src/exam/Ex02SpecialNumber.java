package exam;

import java.util.Scanner;

public class Ex02SpecialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number needed check: ");
		int a = sc.nextInt();
		if(isSpecialNumber(a)) {
			System.out.println("số " + a +" là số đặc biệt");
		}
		else {
			System.out.println("số " + a +" không phải là số đặc biệt");
		}
	}
	public static boolean isSpecialNumber(int a) {
		if(a == 1) {
			return true;
		}
		for(int i = 0; i < a;i++) {
			int sum = 0;
			for(int j = 0;j<=i;j++) {
				sum+=j;
			}
			if(sum==a) {
				return true;
			}
		}
		return false;
	}
}
