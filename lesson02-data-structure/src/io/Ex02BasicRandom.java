package io;

import java.util.Random;

public class Ex02BasicRandom {
	public static void main(String[] args) {
		Random rd = new Random();
		int ran = rd.nextInt(20);
//		int r2 = rd.nextInt(5, 12);
//		System.out.println(r2);
		
		double m1 = Math.random();
		System.out.println(m1);
		
		int m2 = 5+(int)Math.floor(7*Math.random());
		System.out.println(m2);
		System.out.println(ran);
	}
}
