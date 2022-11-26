package view;

import utils.InputUtils;

public class Ex02ExponentsOfNumberTwo {
	public static void main(String[] args) {
		
		int num = InputUtils.input("Enter N(N > 0)", 3);
		
		if (isExponentOfNumberTwo(num)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	private static boolean isExponentOfNumberTwo(int num) {
		if(num == 1) {
			return true;
		}
		do {
			if (num % 2 != 0) {
				return false;
			}
			num /= 2;
			if (num < 2) {
				break;
			}
		} while (true);
		return true;
	}
	
}