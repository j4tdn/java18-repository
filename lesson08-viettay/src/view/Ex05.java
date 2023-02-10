package view;
/**
 Bài 5: Xâu s1 có dộ dài m và s2 có độ dài n ( m,n là hai số tự nhiên; n,m<250)
		Biết rằng s1,s2 chỉ chứa các kí tự ‘A’...’Z’.	
		Yêu cầu: Hãy viết phương trình tìm xâu con chung dài nhất của xâu s1 và s2.	
		Dữ liệu vào: Nhập từ bàn phím 2 xâu s1 và s2.
		Kết quả: Xuất ra màn hình xâu con chung của 2 xâ s1 và s2.
		Example:
		Input: S1:ABCEDEABC
			   S2:ABCEDCBBCK
		Output: ABCED
 */
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
