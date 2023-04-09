package view;

import java.util.HashSet;
import java.util.Set;

public class Ex02CheckingHappyNumber {
	public static void main(String[] args) {
		int number = 19;
		String result = isHappy(number) ? number + " is a happy number." : number + " is an unhappy number.";
		System.out.println(result);
	}

	public static boolean isHappy(int n) {
		Set<Integer> numbers = new HashSet<>();
		while (n != 1) {
			int sum = 0;
			while (n > 0) {
				int digit = n % 10;
				sum += digit * digit;
				n /= 10;
			}
			if (numbers.contains(sum)) {
				return false;
			}
			numbers.add(sum);
			n = sum;
		}
		return true;
	}
}