package view;

import utils.InputUtils;

public class Ex01MultiplesOfNumberTwo {
	public static void main(String[] args) {
		
		int num = InputUtils.input("Enter N(N > 0)", 3);
		
		if (num % 2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}