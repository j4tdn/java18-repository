package Ex04Saddle;

import java.util.Scanner;

public class Ex04Saddle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[][] = new int[50][50];
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		System.out.print("Nhap m: ");
		int m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("A["+ i + "][" + j + "] = " );
				A[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Ma tran nhap vao: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(A[i][j] + "  ");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < n; i++) {
			int jMin = 0;
			int Min = A[i][jMin];
			for(int j = 0; j < m; j++) {
				if(A[i][j] < Min) {
					Min = A[i][j];
					jMin = j;
				}
			}
			int Max = A[0][jMin];
			for (int k = 0; k < n; k++) {
				if (A[k][jMin] > Max) {
					Max = A[k][jMin];
				}
			}
			
			if ( Min == Max) {
				System.out.println("Phan tu yen ngua: " + Min);
				break;
			}
			else {
				System.out.println("Khong co phan tu yen ngua");
				break;
			}
		}
	}
	
}
