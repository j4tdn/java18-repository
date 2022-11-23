package exercises;

import utils.InputUtils;

public class Ex06MinMax {
	public static void main(String[] args) {

		int a = InputUtils.input("Enter a(N > 0)", 3, 20);
		int b = InputUtils.input("Enter b(N > 0)", 3, 20);
		int c = InputUtils.input("Enter c(N > 0)", 3, 20);
		System.out.println("Max = " + getMax(a, b, c));
		System.out.println("Min = " + getMin(a, b, c));

	}

	private static int getMax(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;
		}
		if (b >= c) {
			return b;
		} else
			return c;
	}

	private static int getMin(int a, int b, int c) {
		if (a <= b && a <= c) {
			return a;
		}
		if (b <= c) {
			return b;
		} else
			return c;
	}

}
