package homework3;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int n = number.nextInt();
		int[][] arraynumber = new int[100][100];
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+2;j++) {
				if(j==0||j==i+1) {
					arraynumber[i][j]=1;
					System.out.print(arraynumber[i][j]);
				}
				else if(0<j & j<i+1) {
					arraynumber[i][j]=arraynumber[i-1][j-1]+arraynumber[i-1][j];
					System.out.print(arraynumber[i][j]);
				}
				else {
					arraynumber[i][j]=0;
					System.out.print(arraynumber[i][j]);
				}
			}
			System.out.println("");
		}
	}
}
