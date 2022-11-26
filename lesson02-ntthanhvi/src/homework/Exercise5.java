package homework;

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		
		int number = 3437;
		
		System.out.println(number + " is symectric --> " +  isSymetric(number));
	}
	
	private static boolean isSymetric(int number) {
		return number == reverse(number);
	}
	
	private static int reverse(int number) {
		int reverse = 0;
		while(number != 0) {
			reverse = reverse * 10 + number % 10;
			number /= 10;
		}
		return reverse;
	}
}
