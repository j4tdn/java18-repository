package test;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		//int[] a = new int[100];
		int n = ip.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = ip.nextInt();
		}
		Arrays.sort(a);
		for (int x : a) {
			System.out.println(x);
		}
	}
}
