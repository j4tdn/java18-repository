package ex03trianglepascal;

import java.util.Scanner;

public class TrianglePascal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap n:");
		int n = sc.nextInt();
		int[][] matrix = new int[n + 1][n + 2];

		for (int i = 0; i < n + 1; i++) {
			matrix[i][0] = 1;
		}
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < n + 2; j++) {
				if(j==i+1) {
					matrix[i][j] = 1;
 				}
				else if(j > 0 && i>0){
					matrix[i][j] = matrix[i-1][j] + matrix[i-1][j-1];
				}
			}
		}
		
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < n + 2; j++) {
				if(matrix[i][j]>0) {
					System.out.print(matrix[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}
