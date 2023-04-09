package view;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		System.out.println(rs(n));
	}

	public static boolean rs(int n) {
		Set<Integer> seenNumbers = new HashSet<>();
		while (n != 1 && !seenNumbers.contains(n)) {
			seenNumbers.add(n);
			n = sum(n);
		}
		return n == 1;
	}

	private static int sum(int n) {
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			sum += digit * digit;
			n /= 10;
		}
		return sum;
	}
}
