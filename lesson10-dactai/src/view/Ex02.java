package view;

import java.util.Arrays;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 0, 8, 7 }, { 1, 9, 0, 9 }, { 2, 0, 6, 5 }, { 1, 2, 4, 5 }

		};
		printMatrix(matrix);
		changeToZero(matrix);
		System.out.println("============= Result ==============");
		printMatrix(matrix);
	}
	
	private static void printMatrix(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static void changeToZero(int[][] matrix) {
		int[] indexX = new int[100];
		int[] indexY = new int[100];
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
