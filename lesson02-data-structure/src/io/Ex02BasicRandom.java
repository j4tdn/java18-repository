package io;

import java.util.Random;

public class Ex02BasicRandom {
	public static void main(String[] args) {
		Random rd = new Random();
		int n = 20;
		int r1= rd.nextInt(n); // [0, n)
		System.out.println("rand ==> " + r1);
		
		int r2 = rd.nextInt(5, 12);
		System.out.println("rand ==> " + r2);
		
		double r3 = rd.nextDouble(15);
		System.out.println("rand ==> " + r3);
		
		double r4 = Math.random();
		System.out.println("rand ==> " + r4);
		
		// [5-12)
		int m2 = 5 + (int)Math.floor(Math.random() * 7);
		System.out.println("rand ==> " + m2);
	}
}
