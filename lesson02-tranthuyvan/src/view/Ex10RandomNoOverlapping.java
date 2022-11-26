package view;

import java.util.Random;

/**
 * Viết chương trình in ra 5 số nguyên ngẫu nhiên từ 20 đến 30 → [20, 30]
 * Yêu cầu: 5 số ngẫu nhiên không được trùng nhau
 */

public class Ex10RandomNoOverlapping {
	public static void main(String[] args) {
		// Random a number
		Random rd = new Random();

		// Create array to store random numbers
		int[] num = new int[5];

		// Create each number and add condition -> no overlapping
		num[0] = 20 + rd.nextInt(11);

		do {
			num[1] = 20 + rd.nextInt(11);
		} while (num[1] == num[0]);

		do {
			num[2] = 20 + rd.nextInt(11);
		} while (num[2] == num[0] || num[2] == num[1]);

		do {
			num[3] = 20 + rd.nextInt(11);
		} while (num[3] == num[0] || num[3] == num[1] || num[3] == num[2]);

		do {
			num[4] = 20 + rd.nextInt(11);
		} while (num[4] == num[0] || num[4] == num[1] || num[4] == num[2] || num[4] == num[3]);

		System.out.println("Numbers--> " + num[0] + ", " + num[1] + ", " + num[2] + ", " + num[3] + ", " + num[4]);

	}

}
