package homework;

import utils.InputUtils;

public class Ex02PowerOfTwo {
	public static void main(String[] args) {
		int n = InputUtils.input("Enter N(N > 0)", 3);
		
		System.out.println("is power of 2 --> " + isPower(n));
	}
	
	private static boolean isPower(int n) {
		if(n==1) {
			return true;
		}
		int running = 2;
		while(running !=n) {
			running *= 2;
			if (running > n) {
				return false;
			}
		}
		return true;
	}
}
