package math.random.format;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ex02RandomDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		System.out.println("randNumber: " + rd.nextInt(10));
		
		System.out.println("randNumber from 6 to 10: " + (6 + rd.nextInt(5)));
		
		System.out.println("randNumber: " + (rd.nextFloat() * 10));
		
		String[] students = {"Teo", "Nam", "An", "Le", "Van"};
		
		System.out.println("randStudent: " + students[rd.nextInt(students.length)]);
		

	}
}
