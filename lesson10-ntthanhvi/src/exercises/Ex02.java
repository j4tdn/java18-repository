package exercises;

import java.util.*;
public class Ex02 {


	public static void main(String[] args) {
		int[][] matrix= { 
				{ 2, 3, 4, 5, 6 }, 
				{ 3, 2, 1, 5, 6 }, 
				{ 4, 5, 0, 2, 3 }, 
				{ 5, 7, 9, 4, 1 },
				{ 9, 8, 7, 6, 5 } };
		System.out.println("Ma trận ban đầu:");
		printMatrix(matrix);
		
		System.out.println("Ma trận sau chuyển đổi: ");
		transformMatrix(matrix);
		printMatrix(matrix);
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void transformMatrix (int[][] matrix) {
		int[] indexX = new int[10];
		int[] indexY = new int[10];
		int count = 0;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == 0) {
					indexX[count] = i;
					indexY[count] = j;
					count++;
				}
			}
		}
		indexX = Arrays.copyOfRange(indexX, 0, count);
		indexY = Arrays.copyOfRange(indexY, 0, count);
		
		for(int y:indexY) {
			for(int i = 0; i < matrix.length; i++) {
				matrix[i][y] = 0;
			}
		}
		
		for(int x:indexX) {
				for(int j = 0; j < matrix[x].length; j++) {
					matrix[x][j] = 0;
			}
		}
		
	}

}
