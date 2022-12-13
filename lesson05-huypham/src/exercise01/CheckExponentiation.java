package exercise01;

import java.util.Scanner;

public class CheckExponentiation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		System.out.println(isPowerOf( a, b));
	}
	public static boolean isPowerOf(int a, int b) {
		boolean check = false;
		int b1 =b;
		int a1 =a;
		if(a > b) {
			while(a>b) {
					b*=b1;
			}
			System.out.println(b);
			if(a==b) check = true;
			else check = false;
		}else {
			while(a<b) {
					a=a*a1;
			}
			if(a==b) check = true;
			else check = false;
		}
		return check;
	}
}
