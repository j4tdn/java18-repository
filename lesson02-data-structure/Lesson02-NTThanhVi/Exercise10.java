package Lesson02Exercises;

import java.util.Random;

public class Exercise10 {
	public static void main(String[] args) {
		Random rd = new Random();
		int Num1, Num2, Num3, Num4, Num5;
		
		Num1 = 20 + rd.nextInt(11);
		System.out.println("Num1: " + Num1);
		
		do {
			Num2 = 20 + rd.nextInt(11);
		} while (Num2 == Num1);
		System.out.println("Num2: " + Num2);
		
		do {
			Num3 = 20 + rd.nextInt(11);
		} while (Num3 == Num1 || Num3 == Num2);
		System.out.println("Num3: " + Num3);
		
		do {
			Num4 = 20 + rd.nextInt(11);
		} while (Num4 == Num1 || Num4 == Num2 || Num4 == Num3);
		System.out.println("Num4: " + Num4);
		
		do {
			Num5 = 20 + rd.nextInt(11);
		} while (Num5 == Num1 || Num5 == Num2 || Num5 == Num3 || Num5 == Num4);
		System.out.println("Num5: " + Num5);
	}
}
