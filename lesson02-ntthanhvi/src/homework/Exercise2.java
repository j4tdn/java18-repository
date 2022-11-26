package homework;

import java.util.Scanner;

import utils.InputUtils;

public class Exercise2 {
	public static void main(String[] args) {
		
		int n = InputUtils.input("Enter N(N>0) ", 3);
		
		System.out.println("is power of 2 " + isPower(n,2));
	}
	
	private static boolean isPower (int power, int number) {
		double result = Math.log(power)/Math.log(number);
		System.out.println("result --> " + result);
		System.out.println("round up --> " + Math.ceil(result));
		System.out.println("round down --> " + Math.floor(result));
		return Math.ceil(result) == Math.floor(result);
	}
}
