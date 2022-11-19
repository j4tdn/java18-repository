package ex04horsesaddle;

import java.util.Random;
import java.util.Scanner;

public class HorseSaddle {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = ip.nextInt();

		System.out.print("Enter col: ");
		int col = ip.nextInt();

		Random ra = new Random();
		int[][] A = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				A[i][j] = 1 + ra.nextInt(99);
			}
		}

		System.out.println("=====================");
		System.out.println("Aray after random");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println("");
		}

		for (int i = 0; i < row; i++) {
			int jMin = 0;
			int Min = A[i][jMin];
			for (int j = 0; j < col; j++) {
				if (A[i][j] < Min) {
					Min = A[i][j];
					jMin = j;
				}
			}
			int Max = A[0][jMin];
			for (int k = 0; k < row; k++) {
				if (A[k][jMin] > Max) {
					Max = A[k][jMin];
				}
			}

			if (Min == Max) {
				System.out.println("co Phan tu yen ngu");
				break;
			} else {
				System.out.println("Khong co phan tu yen ngua");
				break;
			}
		}
	}

}
