package math.random.format;

import java.util.Random;

/**
 * 
 * Using: class random(int,float , double),Math(float ,double)
 * +Random number
 * +Random element(s) in aray ,list
 * +Shuffle(xáo , trộn)
 *
 */
public class Ex02RandomDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		System.out.println("randumNumber : " + rd.nextInt(10));
		// random a number from 'from(6)' to 'to (10)'
		System.out.println("randomNumber from 6 to 10 : " + (6 + rd.nextInt(5)));
		// rd.nextFloat()   <==> Math.random() ==> [0.0 -> 1.0) *10 --> [0.0 ->10.0)
		System.out.println("randomFNumber : " + rd.nextFloat()*10);
		String[] students = {"Tèo ","Nam ","An","Le"};
		System.out.println("random studen : " + students[rd.nextInt(students.length)]);
		//List<String> cards = Arrays.asList("");
		
	}
}
