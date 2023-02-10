package view;
/**
 Bài 7: Cho xâu kí tự S bao gồm toàn các ký tự ‘a’ đến ‘z’, không quá 255 ký tự. “Dãy
		con đúng” trong xâu S là dãy có các kí tự liền kề giống nhau
		Yêu cầu:
		Hãy tính độ dài lớn nhất của dãy con đúng của dãy S.
		Hãy tính độ dài nhỏ nhất của dãy con đúng của dãy S.
		
		Example: ‘aaabaaabbaaaaa’
		Độ dài lớn nhất của dãy con đúng : 5 “aaaaa” [9]
		Độ dài nhỏ nhất của dãy con đúng: 1 “b” [3]
		Với [x] => bắt đầu từ vị trí x trong xâu S
 */
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập xâu kí tự: ");
		String str = ip.nextLine();
		int a = 0, b = 0;
		char c1 = str.charAt(0);
		char c2 = str.charAt(0);
		int n = str.length();
		int count1 = Integer.MIN_VALUE;
		int count2 = Integer.MAX_VALUE;
		int cur_count = 1;
		for (int i = 0; i < n; i++) {
			if (i < n - 1 && str.charAt(i) == str.charAt(i + 1))
				cur_count++;
			else {
				if (cur_count > count1) {
					count1 = cur_count;
					c1 = str.charAt(i);
					a = i;
				} else if (cur_count < count2) {
					count2 = cur_count;
					c2 = str.charAt(i);
					b = i;
				}
				cur_count = 1;
			}
		}
		String rs1 = "";
		for (int i = 0; i < count1; i++) {
			rs1 = rs1 + c1 + "";
		}
		String rs2 = "";
		for (int i = 0; i < count2; i++) {
			rs2 = rs2 + c2 + "";
		}
		System.out.println(
				"Độ dài lớn nhất của dãy con đúng: " + count1 + " \"" + rs1 + "\"" + " [" + (a - count1 + 1) + "]");
		System.out.println(
				"Độ dài nhỏ nhất của dãy con đúng: " + count2 + " \"" + rs2 + "\"" + " [" + (b - count2 + 1) + "]");
	}

}
