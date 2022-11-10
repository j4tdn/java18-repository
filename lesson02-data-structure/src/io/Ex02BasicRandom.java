package io;

import java.util.Random;

public class Ex02BasicRandom {
	public static void main(String[] args) {
//		using class random
//		random 1 so ngau nhien nho hon n
		Random rd = new Random();
		int n =20;
		int r1 = rd.nextInt(n);
		System.out.println("first rand ==>"+ r1);
		int r2 =5+rd.nextInt(7);
		System.out.println("sec rand ==>"+ r2);
//		using class math
		double m1 = Math.random();
		System.out.println("m1 = "+ m1);
		
		int m2 = 5 + (int)Math.floor(Math.random()*7);
		System.out.println("m2= "+ m2);
	}

}
