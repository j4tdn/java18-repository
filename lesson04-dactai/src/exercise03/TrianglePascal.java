package exercise03;

import java.util.Scanner;

public class TrianglePascal {

	public static void main(String[] args) {
		int size;
		Scanner input = new Scanner(System.in);
		 System.out.print("Nhap n: ");
		 size = input.nextInt();
		int row = size + 1;
		int col = size + 2;
		int[][] triangle = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				triangle[i][j] = 0;

			}

		}

		triangle[0][0] = 1;
		triangle[0][1] = 1;
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (j == 0) {
					triangle[i][j] = 1;
					continue;
				}
				triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];

			}
			System.out.println("\n");
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(triangle[i][j] + " ");
			}
			System.out.println("\n");
		}
	}

}
