
package exam;

import java.util.Scanner;

public class EX01PowerOf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số cần kiểm tra: ");
		int a = sc.nextInt();
		System.out.print("Nhập số luỹ thừa: ");
		int b = sc.nextInt();
		if(isPowerOf(a, b)) {
			System.out.println("số " + a +" là luỹ thừa của số "+b);
		}
		else {
			System.out.println("số " + a +" không phải là luỹ thừa của số "+b);
		}
	}
	private static boolean isPowerOf(int a,int b) {
		if( a == 1 ) {
			return true;
		}
		int result = a / b;
		int remain = a % b;
		if (remain == 1) {
			return false;
		}
		return isPowerOf(result, b);
	}
}
