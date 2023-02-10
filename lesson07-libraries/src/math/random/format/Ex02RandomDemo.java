package math.random.format;

import java.util.Random;

/**
 * Ussing: class Random(int, float, double) , Math(float, double)
 * + Random number
 * + Random element(s) in array, list
 * + Shuffle(Xáo, trộn)
 *
 */
public class Ex02RandomDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		System.out.println("randNumber: " + rd.nextInt(10));
		
		//random a number from 'from(6)' to 'from(10)'
		System.out.println("number from 'from(6)' to 'from(10)': " + (6 + rd.nextInt(5)));
		System.out.println("number from 'from(6)' to 'from(10)': " + rd.nextInt(6, 10));
		System.out.println("number from 'from(6)' to 'from(10)': " + rd.nextInt(6, 10));
		
		// rd.nextFloat() <==> Math.random()
		System.out.println("randomFnumber: " + (rd.nextFloat() * 10));
		
		String[] student = {"Ti", "Teo", "Tao" };
		System.out.println("rand student: " + student[rd.nextInt(student.length)]);
		
	}
}
