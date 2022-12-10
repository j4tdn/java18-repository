package exercises03_trianglePascal;

import java.util.Scanner;

public class TrianglePascal {
	public static void main(String[] args) {
		System.out.println("Enter N:");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ouput(n);
	}
	
	public static void ouput(int n) {
		int[][] A = new int[50][50];
		
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i + 1; j++) {
				if (j == 0 || j == i +1)
				{
					A[i][j] = 1;	
				}
				else {
					A[i][j] = A[i-1][j] + A[i-1][j-1];
					
				}
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
			
		}
		
		
		
	}
	
}
