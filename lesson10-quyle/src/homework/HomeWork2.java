package homework;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("nhập hạng của ma trận : ");
		int n = ip.nextInt();
		int m = ip.nextInt();
		int[][] a = new int[n + 1][m + 1];
		int[] hang = new int[n+1];
		int[] cot = new int[m+1];
		int dem = 1;
		System.out.println("nhập phần tử của ma trận " + m + "*" + n);
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				a[i][j] = ip.nextInt();
				//System.out.println(i + " " + j);
				if (a[i][j] == 0) {
					hang[dem] = i;
					cot[dem] = j;
					dem++;
					//System.out.println(i + " " + j);
				}
			}
		}
		for (int i = 1; i <= dem; i++) {
			doithanh0(a, hang[i], cot[i], n, m);
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println("");
		}
	}

	public static void doithanh0(int a[][], int hang, int cot, int n, int m) {
		for (int i = 1; i <= n; i++) {
			a[i][hang] = 0;
		}
		for (int i = 1; i <= m; i++) {
			a[cot][i] = 0;
		}
	}
}
