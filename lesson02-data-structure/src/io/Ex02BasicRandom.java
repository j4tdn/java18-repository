package io;

import java.util.Random;

public class Ex02BasicRandom {
	public static void main(String[] args) {
		// Random một số ngẫu nhiên < N
		Random rd = new Random();
		
		int n = 20;
		
		int r1 = rd.nextInt(n);
		System.out.println("first rand ==> " + r1);
		
		
		int r2 = rd.nextInt(5,12);
		System.out.println("Second rand ==> " + r2); //[a,b)--> [5,12)
		
		double m1 = Math.random(); // [0.0, 1.0)
		System.out.println("m1 ==> " + m1);
		
		// [0.0, 1.0) * 7 => [0.0,7.0)
		// => Math.random() * 7
		int m2 = 5 + (int)Math.floor(Math.random() * 7);
		System.out.println("m2 ==> " + m2);
		
		
	}
}
