package exercise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		int count = 0;
		do {
			if(count > 0) {
				System.out.println("number must be greater than zero");
			}
			System.out.print("input: ");
			number = scanner.nextInt();
			
			count++;
		} while (number <= 0);

		if (isHappy(number)) {
			System.out.println(number + " is happy number");
		} else {
			System.out.println(number + " is not happy number");
		}
	}

	public static boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();
		while (n != 1) {
			int sum = 0;
			while (n > 0) {
				int digit = n % 10;
				sum += digit * digit;
				n /= 10;
			}
			if (set.contains(sum)) {
				return false;
			}
			set.add(sum);
			n = sum;
		}
		return true;
	}

}
