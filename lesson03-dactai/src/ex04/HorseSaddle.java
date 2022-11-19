package ex04;

import java.util.Random;
import java.util.Scanner;

public class HorseSaddle {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter row: ");
		int n = in.nextInt();
		System.out.println("Enter column: ");
		int m = in.nextInt();
		int[][] matrix = matrix(n, m);
		printMatrix(matrix, n, m);
		boolean check = checkHorseSaddle(matrix, n, m);
		System.out.println(check);
		

	}
	
	private static boolean checkHorseSaddle(int[][] matrix, int n, int m) {

		for(int i = 0; i < n; i++) {
			int[] row = new int[m];
			for(int j = 0; j < m; j++) {
				row[j] = matrix[i][j];
			};
			int colIndex = minOfRow(row, m);
			int minNum = matrix[i][colIndex];
			int[] col = new int[n];
			for(int k = 0; k < n; k++) {
				col[k] = matrix[k][colIndex];
			}
			int maxNum = matrix[maxOfCol(col, m)][colIndex];
			
			if(minNum == maxNum) {
				System.out.println("====> matrix(" + maxOfCol(col, m) + ", " + colIndex + ")");
				return true;
			}
		}
		
		return false;
	}
	
	private static int minOfRow(int[] matrix, int n) {
		int min = matrix[0];
		int res = 0;
		for(int i = 1; i < n; i++) {
			if(matrix[i] < min) {
				min = matrix[i];
				res = i;
			}
		}
		return res;
	}
	
	private static int maxOfCol(int[] matrix, int n) {
		int max = matrix[0];
		int res = 0;
		for(int i = 1; i < n; i++) {
			if(matrix[i] > max) {
				max = matrix[i];
				res = i;
			}
		}
		return res;
	}
	
	private static int[][] matrix(int n, int m){
		Random rand = new Random();
		int[][] res = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				res[i][j] = 0 + rand.nextInt(100);
			}
		}
		
		return res;
	}
	
	private static void printMatrix(int[][] matrix, int n, int m) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + "	");
			}
			System.out.print("\n");
		}
	}

}
