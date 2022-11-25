package view;

import java.util.Random;

public class Ex10RandomNumber {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] A = new int[5];
		for (int i = 0; i < 5; i++) {
			A[i] = rd.nextInt(20, 31);
			if (i >= 1) {
				for (int j = i - 1; j >= 0; j--) {
					while (A[i] == A[j]) {
						do {
							A[i] = rd.nextInt(20, 31);
						} while (A[i] == A[j]);
						j = i - 1;
					}

				}
			}
			System.out.println("A[" + i + "] --> " + A[i]);
		}
	}

}
