package exercise04;

import java.util.Random;
import java.util.Scanner;

public class HorseSaddleParticle {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Random r = new Random();

		// Input matrix
		System.out.print("Enter amount of rows: ");
		int n = ip.nextInt();
		System.out.print("Enter amount of columns: ");
		int m = ip.nextInt();

		int[][] matrix = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = 0 + r.nextInt(100);
			}
		}

		// Print matrix
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + "  ");
			}

			System.out.print("\n");
		}

		// Check
		boolean check = false;
		for (int i = 0; i < n; i++) {

			int minId = 0;
			int min = matrix[i][minId];

			for (int j = 0; j < m; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
					minId = j;
				}
			}

			int max = matrix[0][minId];

			for (int k = 0; k < n; k++) {
				if (matrix[k][minId] > max) {
					max = matrix[k][minId];
				}
			}

			if (min == max) {
				System.out.println("=> Matrix have horse saddle particle is: " + min);
				check = true;
				break;
			}
		}
		if (!check) {
			System.out.println("=> Matrix don't have horse particle");
		}
	}
}
