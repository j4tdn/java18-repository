package throw_throws_trycatch;

import java.util.Objects;

public class Ex01Divisor {
	public static void main(String[] args) {
		System.out.println("d1 --> " + divide(10d, 2d));

		try {
			System.out.println("d1 --> " + divide(null, 2d));
		} catch (NullPointerException e) {
			System.out.println("d2 --> " + e.getMessage());
		}

		try {
			System.out.println("d3 --> " + divide(10d, 0d));
		} catch (ArithmeticException e) {
			System.out.println("d2 --> " + e.getMessage());
		}
		
		System.out.println("-----Finished-----");

	}

	private static Double divide(Double a, Double b) {
		Objects.requireNonNull(a, "A cannot be null !!!");
		Objects.requireNonNull(b, "B cannot be null !!!");

		if (b == 0) {
			throw new ArithmeticException("B should not be ZERO !!!");
		}

		return a / b;
	}
	
	/*
	 * [un] boxing, auto [un]boxing
	 * Integer, Float, Long, Double
	 * try/catch --> needn't
	 * throw/throws
	 *    + vị trí gọi hàm mà chưa có validate --> try catch
	 *    + vị trí gọi hàm mà có validate --> ...
	 */

}
