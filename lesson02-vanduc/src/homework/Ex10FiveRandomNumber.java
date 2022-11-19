package homework;

import java.util.Random;

public class Ex10FiveRandomNumber {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] number = new int[5];
		number[0] = 20 + rd.nextInt(11);

		do {
			number[1] = 20 + rd.nextInt(11);
		} while (number[1] == number[0]);
		do {
			number[2] = 20 + rd.nextInt(11);
		} while (number[2] == number[1] || number[2] == number[0]);
		do {
			number[3] = 20 + rd.nextInt(11);
		} while (number[3] == number[1] || number[3] == number[0] || number[3] == number[2]);
		do {
			number[4] = 20 + rd.nextInt(11);
		} while (number[4] == number[1] || number[4] == number[0] || number[4] == number[2] || number[4] == number[3]);

		System.out.println("Random the number 20 to 30 : " + number[0] + ", " + number[1] + ", " + number[2] + ", "
				+ number[3] + ", " + number[4] + ". ");
	}
}
