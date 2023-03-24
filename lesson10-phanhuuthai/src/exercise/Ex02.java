package exercise;

public class Ex02 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 0, 4 }, { 5, 7, 8, 7 }, { 1, 9, 7, 9 }, { 2, 0, 6, 5 }, { 1, 2, 4, 5 } };
		System.out.println(matrix.length + " " + matrix[0].length);
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					count++;
				}
			}
		}
		int[] row = new int[count];
		int[] col = new int[count];
		int k = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[k] = i;
					col[k] = j;
					k++;
				}
			}

		}

		for(int e = 0;e<k;e++) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					if (i == row[e] || j == col[e]) {
						matrix[i][j] = 0;
					}
				}
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
