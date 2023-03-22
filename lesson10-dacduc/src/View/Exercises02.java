package View;

public class Exercises02 {
	public static void main(String[] args) {

//		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 9, 0, 9 }, { 2, 9, 6, 5 }, { 1, 2, 4,5 } }; // ma trận ví
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 0, 8, 7 }, { 1, 9, 0, 9 }, { 2, 0, 6, 5 }, { 1, 2, 4, 5 } }; // dụ
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
		// Tìm vị trí của phần tử có giá trị bằng 0
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[k] = i;
					col[k] = j;
					k++;
					break;
				}
			}

		}

		// Chuyển đổi các hàng và cột chứa phần tử 0 về giá trị bằng 0
		for(int e = 0;e<k;e++) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					if (i == row[e] || j == col[e]) {
						matrix[i][j] = 0;
					}
				}
			}
		}
		
		// In ra ma trận sau khi đã chuyển đổi
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
