package view;

import utils.InputUtils;

public class Ex08PrimeNum {
	public static void main(String[] args) {

		int num = InputUtils.input("Enter N(N > 0)", 3);
		
		if (isPrimeNum(num)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	private static boolean isPrimeNum(int num) {
		int check = 0;
		if (num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				++check;
			}
		}
		if (check == 0) {
			return true;
		} else {
			return false;
		}
	}
}