package view;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input: ");
		int n = sc.nextInt();
		int m = n;
		int a;
		int count = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while (n > 0) {
			while (n > 0) {
				a = n % 10;
				n = n / 10;
				count += a * a;
			}
			n = count;
			count = 0;
			if (n == 1) {
				System.out.println(m + " la so hanh phuc");
				break;
			}

			for (Integer j : arr) {
				if (j == n) {
					System.out.println(m + " khong phai so hanh phuc.");
					n = 0;
					break;
				}
			}
			arr.add(n);

		}
	}

}
