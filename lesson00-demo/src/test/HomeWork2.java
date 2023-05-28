package test;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int[] a = new int[100];
		int[] b = new int[100];
		int n, max = 0;
		n = ip.nextInt();
		for (int i = 0; i < n; i++) {
			a[i] = ip.nextInt();
			b[a[i]]++;
			if (a[i] > max) {
				max = a[i];
			}
		}
		for (int i = 0; i <= max; i++) {
			if (b[i] != 0) {
				System.out.println(i + " " + b[i]);
				b[i]=0;
			}
		}

	}
}
