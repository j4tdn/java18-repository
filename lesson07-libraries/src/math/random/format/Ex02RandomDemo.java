package math.random.format;

import java.util.Random;

/**
 * Using: class Random(int, float, double) or Math(float, double)
 * + Random number
 * + Random element(s) in array, list
 * + shuffle (xáo, trộn)
 * 
 * rd.nextFloat() <==> Math.random() --> [0.0 -> 1.0)
 */

public class Ex02RandomDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		System.out.println("randomNumber: " + rd.nextInt(10)); // [0-9]
		
		// random a number from (6) to (10)
		System.out.println("randomNumber from 6 to 10: " + (6 + rd.nextInt(5)));
		
		// random 0-10
		System.out.println("randomNumber: " + rd.nextFloat() * 10);
		
		// in array 
		String[] students = {"Teo", "Nam", "An", "Le", "Van"};
		System.out.println("random student: " + students[rd.nextInt(students.length)]);
		
	}

}
