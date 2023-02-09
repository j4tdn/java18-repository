package math.random.format;

import java.util.List;
import java.util.Random;

/**
 * Using: class Random(int, float, double). Math(float, double)
 * + Random number
 * + Random element(s) in array, list
 * + Shuffle(xao, tron)
 * 
 */

public class Ex02RandomDemo {
	// 1 2 3 -- shuffle - 1 3 2 || 1 2 3 || 2 3 1
	public static void main(String[] args) {
		Random rd = new Random();
		System.out.println("randNumber: " + rd.nextInt(10));
		
		// random a number from 'from(6) to 'to(10)'
		System.out.println("randNumber from 6 to 10: " + 6 + rd.nextInt(5));
		
		// rd.nextFloat() <==> Math.random() ==> [0.0 --> 1.0) *10 --> [0.0 --> 10.0)
		System.out.println("randFNumber: " + rd.nextFloat() * 10);
		
		String[] students = {"Teo", "Nam", "An", "Le", "Van"};
		System.out.println("rand student: " + students[rd.nextInt(students.length)]);
		
		
		
		
	}

}
