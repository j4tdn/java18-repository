package exercise;

/**
 * Thực hiện bài toán chuyển đổi ma trận sau đây : Ma trận có duy nhất một
phần tử có giá trị bằng 0. Chuyển tất cả các hàng và cột của nó về giá trị bằng 0
 * @author ASUS
 *
 */
public class Ex02 {
	public static void main(String[] args) {
	    int[][] matrix = {
	            {1, 2, 3, 4},
	            {4, 0, 6, 7},
	            {7, 8, 0, 4},
	            {5, 2, 4, 1}
	        };

	        int[] rows = new int[matrix.length];
	        int[] cols = new int[matrix[0].length];
	        int k = 0;

	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[0].length; j++) {
	                if (matrix[i][j] == 0) {
	                    rows[k] = i;
	                    cols[k] = j;
	                    k++;
	                }
	            }
	        }

	       
	        for (int i = 0; i < k; i++) {
	            for (int j = 0; j < matrix[0].length; j++) {
	                matrix[rows[i]][j] = 0;
	            }

	            for (int j = 0; j < matrix.length; j++) {
	                matrix[j][cols[i]] = 0;
	            }
	        }

	        // In ma trận sau khi đã chuyển đổi
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[0].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	}
}
