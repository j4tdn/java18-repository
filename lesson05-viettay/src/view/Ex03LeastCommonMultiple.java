package view;

/**
 *  Bài 3: Cho mảng A gồm n phần tử (2 < n < 20). Ak = [1, 10]
	Tìm bội chung nhỏ nhất của các phần tử trong mảng
	 VD1: Ak = [2, 3] >> BCNN = 6
	 VD2: Ak = [2, 3, 4] >> BCNN = 12 
 *
 */
public class Ex03LeastCommonMultiple {

	public static void main(String[] args) {
		int[] elements = { 2, 3, 4, 5 };
		System.out.println("LCM: " + getLeastCommonMultiple(elements));
	}

	private static int getLeastCommonMultiple(int[] elements) {
		if (elements.length == 0) {
			throw new IllegalArgumentException("At least one element...");
		}
		if (elements.length == 1) {
			return elements[0];
		}
		int result = lcm(elements[0], elements[1]);
		for (int i = 2; i < elements.length; i++) {
			result = lcm(result, elements[i]);
		}
		return result;
	}

	private static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	// Greatest Common Divisor ( ước chung lớn nhất )
	private static int gcd(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

//	private static int gcd(int a, int b) {
//		return b == 0 ? a : gcd(b, a % b);
//	}

}
