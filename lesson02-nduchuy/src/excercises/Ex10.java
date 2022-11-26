package excercises;

import java.util.Random;

public class Ex10 {
	public static void main(String[] args) {
		Random rand = new Random();
		int num1,num2,num3,num4,num5;
		
		num1 = 20 + rand.nextInt(11);

		do{
			num2 = 20 + rand.nextInt(11);
		}
		while (num2 == num1);
		do{
			num3 = 20 + rand.nextInt(11);
		}
		while (num3 == num1 || num3 == num2);
		do{
			num4 = 20 + rand.nextInt(11);
		}
		while (num4 == num1 || num4 == num2 || num4 == num3);
		
		do{
			num5 = 20 + rand.nextInt(11);
		}
		while (num5 == num1 || num5 == num2 || num5 == num3 || num5 == num4);

		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
	}
}
