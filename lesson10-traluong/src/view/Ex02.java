package view;

import java.util.Arrays;

public class Ex02 {
	static int row = 4;
	static int col = 5;
	public static void main(String[] args) {
		Integer[][] data = new Integer[row][col];
		Integer[][] datas = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{1, 9, 0, 9},
			{2, 1, 6, 5},
			{1, 2, 4, 0}
		};
		data = datas;
		String[] locationOfZeros = findLocationsOfZero(data);
		
		System.out.println(Arrays.toString(locationOfZeros));
		
		printMatrix(matrixTransfer(data, locationOfZeros));
	}
	public static void printMatrix (Integer[][] matrix) {
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static int numberOfZero(Integer[][] matrix) {
		int count = 0;
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				if (matrix[i][j] == 0) count++;
		
			}
		}
		return count;
	}
	public static String[] findLocationsOfZero(Integer[][] matrix) {
		String[] location = new String[numberOfZero(matrix)];
		// 	i --> number of row
		//	j --> number of col
		int k = 0;
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				if (matrix[i][j] == 0) {
					location[k] = j + ";" + i;
					k++;
				}
			}
		}
		return location;
	}
	public static Integer[][] matrixTransfer(Integer[][] matrix, String[] location) {
		
		for (String e: location) {
			
			int x = Integer.parseInt(String.valueOf(e.charAt(2)));
			int y = Integer.parseInt(String.valueOf(e.charAt(0)));
			
			for (int i = 0; i < col; i++) {
				for (int j = 0; j < row; j++) {
					if (i == x || j == y) {
						matrix[i][j] = 0;
					}
				}
			}
		}
		return matrix;
	}
}
