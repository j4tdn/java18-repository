package view;
import utils.InputUtils;
public class Ex02Power {
	public static void main(String[] args) {
		int n = InputUtils.input("Enter N(N > 0)", 3, Integer.MAX_VALUE);

		System.out.println("is power of 5 --> " + isPower(n, 5));
	}

	// BigDecimal

	// log(power)/log(number) = result
	// result -- so nguyen --> true
	// -- !so nguyen --> false
	private static boolean isPower(int power, int number) {
		double result = Math.log(power) / Math.log(number);
		System.out.println("result --> " + result);
		System.out.println("round up --> " + Math.ceil(result));
		System.out.println("round down --> " + Math.floor(result));
		return Math.ceil(result) == Math.floor(result);
	}
}

