package kt2;
/**
Bài 4: Tìm tất cả các hoán vị của chuỗi String
		Example: input: xyz
		output: xyz, xzy, yxz, yzx, zxy, zyx
*/
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập chuỗi: ");
		String input = ip.nextLine();
		System.out.print("Tất cả các hoán vị của " + input + " là: ");
		rs("", input);
	}

	private static void rs(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.print(prefix + " ");
		else {
			for (int i = 0; i < n; i++)
				rs(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
		}
	}
}
