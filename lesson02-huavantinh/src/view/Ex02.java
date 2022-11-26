package view; 
import java.util.Scanner;

import Utils.InputUtils;

public class Ex02 {
	public static void main(String[] args) {
		int n = InputUtils.input("Enter N(N > 0)", 3);
		System.out.println("is power of 2 --> " + isPower(n));
	}
	
	private static boolean isPower(int n) {
		while(n != 1) {
			if (n % 2 != 0) {
				return false;
			}
			n /= 2;
		}
		return true;
		
	}
}
