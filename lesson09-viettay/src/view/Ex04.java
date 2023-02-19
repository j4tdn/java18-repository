package view;
/**
 * 
 * Tìm tất cả các hoán vị của chuỗi String
	Example: input: xyz
	output: xyz, xzy, yxz, yzx, zxy, zyx
 *
 */
public class Ex04 {
	public static void main(String[] args) {
		rs("", "xyz");
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
