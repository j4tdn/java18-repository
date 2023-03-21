package view;

/**
 Bài 2: Thực hiện bài toán chuyển đổi ma trận sau đây : Ma trận có duy nhất một
		phần tử có giá trị bằng 0. Chuyển tất cả các hàng và cột của nó về giá trị bằng 0
 
 		  INPUT:  			 OUTPUT: 
 				   1 2 3 4			   1 2 0 4
				   5 6 8 7			   5 6 0 7
 		    	   1 9 0 9			   0 0 0 0
 		    	   2 9 6 5  		   2 9 0 5
 		    	   1 2 4 5 			   1 2 0 5   
					 				   
 Nâng cao:
 	      INPUT: 			 OUTPUT: 
				   1 2 3 4			   1 0 0 4			   
				   5 0 8 7			   0 0 0 0	
				   1 9 0 9			   0 0 0 0
				   2 0 6 5			   0 0 0 0
				   1 2 4 5			   1 0 0 5 	
 	     
 */
public class Ex02 {
	public static void main(String[] args) {
		int[][] n1 = { { 1, 2, 3, 4 }, { 5, 6, 8, 7 }, { 1, 9, 0, 9 }, { 2, 9, 6, 5 }, { 1, 2, 4, 5 } };
		int[][] n2 = { { 1, 2, 3, 4 }, { 5, 0, 8, 7 }, { 1, 9, 0, 9 }, { 2, 0, 6, 5 }, { 1, 2, 4, 5 } };
		test1(n1);
		test2(n2);
	}

	private static void test1(int[][] numbers) {
		int r = -1;
		int c = -1;
		int m = numbers.length;
		int n = numbers[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (numbers[i][j] == 0) {
					r = i;
					c = j;
					break;
				}
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == r || j == c) {
					numbers[i][j] = 0;
				}
			}
		}
		System.out.println("Kết quả 1: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void test2(int[][] numbers) {
		int m = numbers.length;
		int n = numbers[0].length;
		boolean[] r = new boolean[m];
		boolean[] c = new boolean[n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (numbers[i][j] == 0) {
					r[i] = true;
					c[j] = true;
				}
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (r[i] || c[j]) {
					numbers[i][j] = 0;
				}
			}
		}
		System.out.println("\nKết quả 2: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}

}
