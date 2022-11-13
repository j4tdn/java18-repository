package control;

import java.util.Scanner;

public class Ex04LoopDoWhile {
	public static void main(String[] args) {
		// in ra phần tử nhỏ hơn n
		Scanner sc = new Scanner(System.in);
		System.out.print("Hãy nhập số nguyên n: ");
		int n = sc.nextInt();
		int i = 0;
		while (i < n) {
			System.out.print(i + " ");
			++i;
		}
		System.out.println("\n==========================");
		System.out.println("\nfinish");
		System.out.println("\n==========================");
		i = 0;
		while (true) {
			System.out.print(i + " ");
			++i;
			if (i == n) {
				break;
			}
		}
		sc.close();
	}
}
