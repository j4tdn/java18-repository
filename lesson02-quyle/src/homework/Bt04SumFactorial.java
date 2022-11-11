package homework;

import java.util.Scanner;

public class Bt04SumFactorial {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("nhập a : ");
		int a = ip.nextInt();
		System.out.println("nhập b : ");
		int b = ip.nextInt();
		System.out.println("nhập c : ");
		int c = ip.nextInt();
		System.out.println("nhập d : ");
		int d = ip.nextInt();
		
		long giaithuaA;
		long giaithuaB;
		long giaithuaC;
		long giaithuaD;
		giaithuaA = Tinhgiaithua(a);
		giaithuaB = Tinhgiaithua(b);
		giaithuaC = Tinhgiaithua(c);
		giaithuaD = Tinhgiaithua(d);
		long tong;
		tong = giaithuaA + giaithuaB + giaithuaC + giaithuaD;
		System.out.println("Tổng giai thừa là : " + tong);
	}

	private static int Tinhgiaithua(int m) {
		int giaithua = 1;
		for (int i = 1; i <= m; i++) {
			giaithua = giaithua * i;
		}
		return giaithua;

	}
}
