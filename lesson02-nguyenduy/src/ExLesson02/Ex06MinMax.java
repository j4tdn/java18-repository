package ExLesson02;

import ultils.Input;

public class Ex06MinMax {
	public static void main(String[] args) {

		int a = Input.input("Enter N(N>0)", 3);
		int b = Input.input("Enter N(N>0)", 3);
		int c = Input.input("Enter N(N>0)", 3);

		if (a >= b && a >= c) {
			System.out.println(a + " is max number");
		} else if (b >= a && b >= c) {
			System.out.println(b + " is max number");
		} else if (c >= a && c >= b) {
			System.out.println(c + " is max number");
		}
		if (a <= b && a <= c) {
			System.out.println(a + " is min number");
		} else if (b <= a && b <= c) {
			System.out.println(b + " is min number");
		} else if (c <= a && c < b) {
			System.out.println(c + " is min number");
		}

	}

}
