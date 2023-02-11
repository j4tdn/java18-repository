package Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
	 public static void main(String[] args) {
		 Scanner ip = new Scanner(System.in);
			System.out.print("Nhập xâu s1: ");
			String s1 = ip.nextLine();
			System.out.print("Nhập xâu s2: ");
			String s2 = ip.nextLine();
			ArrayList<String> rs = null;
			int m = s1.length();
			int n = s2.length();
			int max = Integer.MIN_VALUE;
			int LCStuff[][] = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (s1.charAt(i) == s2.charAt(j)) {
						if (i == 0 || j == 0) {
							LCStuff[i][j] = 1;
						} else {
							LCStuff[i][j] = LCStuff[i - 1][j - 1] + 1;
						}
						if (LCStuff[i][j] > max) {
							max = LCStuff[i][j];
							rs = new ArrayList<String>();
							rs.add(s1.substring(i - max + 1, i + 1));
						} else if (LCStuff[i][j] == max) {
							rs.add(s1.substring(i - max + 1, i + 1));
						}
					} else {
						LCStuff[i][j] = 0;
					}
				}
			}
			System.out.print("Result: ");
			for (String s : rs) {
				System.out.print(s);
			}
	    }
}
