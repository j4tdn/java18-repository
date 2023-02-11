package exercise;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = scan.nextLine();
        System.out.print("Enter string s2: ");
        String s2 = scan.nextLine();
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        int maxLength = 0;
        int end = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        end = i;
                    }
                }
            }
        }
        System.out.println(s1.substring(end - maxLength, end));
	}
}
