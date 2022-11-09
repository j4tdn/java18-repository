package io;

import java.util.Random;

public class Ex02BasicRandom {
	public static void main(String[] args) {
		
		// Using class Random
		// Random 1 so ngau nhien < n
		Random rd = new Random();
		
		int rand = rd.nextInt(20); // [0; 20)
		System.out.println("first rand ==> " + rand);
		
		int r2 = 5 + rd.nextInt(7); // [5; 12)
		System.out.println("first rand ==> " + r2);
		
		
		// Using class Math
		double m1 = Math.random(); // [0.0; 1.0)
		System.out.println("m1 ==> " + m1);
		
		// [0.0;1.0) * 7 [0.0; 7.0) [a,b) ==> [5,12)
		int m2 = 5 + (int)Math.floor(Math.random()* 7);
		System.out.println("m2 ==> " + m2);
		
		// [a,b) ==> [5,12)
	}
}
