package throw_throws_trycatch;

import java.util.Objects;

public class Ex01Division {
	public static void main(String[] args) {
		Double a = 10d;
		Double b = 4d;
		
		System.out.println("d1 --> " + divide(10d,  2d));
		
		try {
			System.out.println("d2 --> " + divide(null, 2d));
		} catch (NullPointerException e) {
			System.out.println("d2 >>> " + e.getMessage());
		}
		
		try {
			System.out.println("d3 --> " + divide(10d, null));
		} catch (NullPointerException e) {
			System.out.println("d3 >>> " + e.getMessage());
		}
	}

	private static Double divide(Double a, Double b) {
		// [un]boxing, auto-[un]boxing
		// Integer, Long, Float, Double
		// try/catch --> thừa
		// throw/throws
		// + vị trí gọi hàm mà chưa có validate --> try catch
		// + vị trí gọi hàm mà có validate --> ...
		Objects.requireNonNull(a, "A cannot be null!");
		Objects.requireNonNull(b, "B cannot be null!");

		// 1/0 -> ngoại lệ
		// 1.0/0.0 -> infinitive

		if (b == 0) {
			throw new ArithmeticException("B should not be ZERO !!!");
		}
		return a / b;
	}
}