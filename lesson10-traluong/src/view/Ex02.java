package view;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int row = 4;
		int col = 5;
		Integer[][] data = new Integer[row][col];
		Integer[][] datas = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{1, 9, 0, 9},
			{2, 9, 6, 5},
			{1, 2, 4, 5}
		};
		data = datas;
		printMatrix(data, row, col);
		Integer[] location = findLocationOfZero(data, row, col);
		System.out.println(Arrays.toString(findLocationOfZero(data, row, col)));
		data = matrixTransfer(data, row, col, location);
		
		printMatrix(data, row, col);
	}
	public static void printMatrix (Integer[][] matrix, int row, int col) {
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static Integer[] findLocationOfZero(Integer[][] matrix, int row, int col) {
		Integer[] location = new Integer[2];
		// location[0] --> number of row
		// location[1] --> number of col
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				if (matrix[i][j] == 0) {
					location[0] = j; 
					location[1] = i;
				}
			}
		}
		return location;
	}
	public static Integer[][] matrixTransfer(Integer[][] matrix, int row, int col, Integer[] location) { 
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				if (j == location[0] || i == location[1]) {
					matrix[i][j] = 0;
				}
			}
		}
		return matrix;
	}
}
