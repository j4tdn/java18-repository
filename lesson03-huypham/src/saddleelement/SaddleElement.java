package saddleelement;

import java.util.Scanner;

public class SaddleElement {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = ip.nextInt();

		System.out.print("Enter col: ");
		int col = ip.nextInt();


		int[][] A = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("Nhap phan tu A[" + (i+1) + "][" + (j+1) + " ]=");
				A[i][j] = ip.nextInt();
			}
		}
		System.out.println("=====================\n");
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println("");
		}
		
		//Find
		boolean check1 = true;
		for (int i = 0; i < row ; i++) {
			int Min = A[i][0];
			int jMin = 0;
			for (int j = 0; j < col; j++) {
				if (A[i][j] <= Min) {
					Min = A[i][j];
					jMin = j;
				}
			}
			check1 = true;
			for(int k = 0; k < row; k++) {
				if (A[k][jMin] > Min) {
					check1 = false;
				}
			}
			if(check1 == true) {
				break;
				}
		}	
		if(check1 == true) {
			System.out.println("Co phan thu yen ngua");
			}else {
			System.out.println("No");
			}
		
	}
}
