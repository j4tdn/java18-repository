package view;

import utils.InputUtils;

public class Ex05SymmetryNumbers {
	public static void main(String[] args) {

		int num = InputUtils.input("Enter N(N > 0)", 3);
		
		int check = num, numCheck = 0;
		
		while(check != 0) {
			int digit = check % 10;
			numCheck = numCheck * 10 + digit;
			check /= 10;
		}
		
		if (num == numCheck) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}