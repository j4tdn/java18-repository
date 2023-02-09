package math.random.format;

import java.util.Random;

/**
 * 
 * Using: class Random(int, float, double), Math(float,double)
 * + Random number
 * + Random element(s) in array, list
 * + Shuffle(xáo, trộn)
 * 
 */

public class Ex02RandomDemo {
	// 1 2 3 --> Shuffle --> 3! --> 1 2 3, 3, 2 1, 2 1 3 
	public static void main(String[] args) {
		Random rd = new Random();
		System.out.println("number: " + rd.nextInt(10));
		
		// Random a number from 'from(6)' to 'to(10)'
		System.out.println("randNumber from 6 to 10: " + (6 + rd.nextInt(5)));
		
		// rd.nextFloat() <==> Math.random() ==> [0.0 --> 1.0) * 10 --> [0,10)
		System.out.println("randNumber: " + (rd.nextFloat() * 10));
		
		String[] students = {"teo","ti","an"};
		System.out.println("rand student: " + students[rd.nextInt(students.length)]);
	}
}
