package view;


import utils.InputUtils;
public class Ex07TransferBinaryNumber {
	public static void main(String[] args) {
		int n = InputUtils.input("Enter N(N > 0)", 5);
		if (n != 0) {
			System.out.print("Binary number of "+n +":");
			Transfer(n);
		} else {
			System.out.print("Binary number of n --> 0");
		}
	}

	private static void Transfer(int n) {

		if (n != 0) {
			Transfer(n / 2);
			System.out.print(n % 2);
		}
	}
}
