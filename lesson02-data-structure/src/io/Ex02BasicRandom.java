package io;

import java.util.Random;

public class Ex02BasicRandom {

	public static void main(String[] args) {
		// Random 1 số ngẫu nhiên < n
		Random rd = new Random();
		int n = 20;
		int r1 = rd.nextInt(n); // [0,n)
		System.out.println("first rand ==>  " + r1);

		int r2 = 5 + rd.nextInt(12); // [a,b) --> [5,12)
		System.out.println("second rand ==>  " + r2);

		// using class math
		double m1 = Math.random(); // [0.0,1.0]
		System.out.println("m1 ==> " + m1);

		// [0.0,1.0] * 7 [0.0,7.0) [a,b) --> [5,12)
		int m2 = 5 + (int) Math.floor(Math.random() * 7);
		System.out.println("m2 ==> " + m2);

	}

}
