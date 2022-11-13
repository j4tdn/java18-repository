package control;

import java.util.Scanner;



public class Ex01IfElseDemo {
	public static void main(String[] args) {
		// 1. kiem tra 1 so la chan hay le ( nhap so nguyen n)
		// + neu chan ==> 'this is even number'
		// + neu le ==> do nothing
		Scanner a = new Scanner(System.in);
		/*
		 * System.out.println("Enter n :"); int n = a.nextInt(); if(n%2==0) {
		 * System.out.println("this is even number"); } //1. kiem tra 1 so la chan hay
		 * le ( nhap so nguyen n) // + neu chan ==> 'this is even number' // + neu le
		 * ==> 'this is ' System.out.println("Enter n1 :"); int n1 = a.nextInt();
		 * if(n1%2==0) { System.out.println("this is even number"); } else {
		 * System.out.println("this is odd number"); }
		 * 
		 */
		System.out.println("Enter point : ");
		String level = "";
		float p = a.nextFloat();
		if (p < 5f) {
			level = "BAD";
		} else if (p <= 6.4f) {
			level = "MEDIUM";
		} else if (p <= 7.9f) {
			level = "PRETTY_GOOD";
		} else {
			level = "GOOD";
		}
		System.out.println("level 1 ==>" + level);
		System.out.println("level 2 ==>" + getLevel(p));
	}

	private static String getLevel(float p) {
		if (p < 5f) {
			return "BAD";
		} else if (p <= 6.4f) {
			return "MEDIUM";
		} else if (p <= 7.9f) {
			return "PRETTY_GOOD";
		} else {
			return "GOOD";
		}
	}
}
