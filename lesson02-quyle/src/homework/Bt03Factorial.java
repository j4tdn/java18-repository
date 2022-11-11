package homework;

import java.util.Scanner;

public class Bt03Factorial {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập N = ");
		int n = ip.nextInt();
		long giaithua =1;
		for ( int i=1;i<=n;i++) {
			giaithua=giaithua*i;
		}
		System.out.println(n + "! = " + giaithua);
	}
	
}
