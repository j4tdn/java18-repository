package io;

import java.util.Random;

public class Ex02BasicRandom {
	public static void main(String[] args) {
		// Random 1 số ngẫu nhiên nhỏ hơn n
		
		// using Class Random
		Random rd = new Random();
		
		int n = 20;
		
		int r1 = rd.nextInt(20); // [0, n)
		System.out.println("first rand ==> " + r1);
		
		int r2 = 5 + rd.nextInt(7); // [a, b) --> [5, 12)
		System.out.println("second rand ==> " + r2);
		
		// using class Math
		double m1 = Math.random(); // [0.0, 1.0)
		System.out.println("m1 ==> " + m1);
		
		// [a, b) ==> [5, 12)
		// Math.floor() => làm tròn dưới (VD: 6.2 => 6)
		int m2 = 5 + (int)Math.floor(Math.random() * 7);
		System.out.println("m2 ==> " + m2);

	}

}
