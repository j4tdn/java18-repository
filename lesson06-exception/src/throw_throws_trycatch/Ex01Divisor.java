package throw_throws_trycatch;

import java.util.Objects;

public class Ex01Divisor {
	public static void main(String[] args) {
		// validate(tiền xử lý) a!=null, b!=null, b!=0
		System.out.println("d1 ---> " + divide(10d, 2d));

		try {
			System.out.println("d2 --> " + divide(null, 2d));
		} catch (Exception e) {
			System.out.println("d2 >>> " + e.getMessage());
		}

		try {
			System.out.println("d3 --> " + divide(10d, null));

		} catch (Exception e) {
			System.out.println("d3 >>> " + e.getMessage());
		}

		System.out.println("d4 ---> " + divide(10d, 4d));
		
		try {
			System.out.println("d5 ---> " + divide(10d, 0d));
		} catch (ArithmeticException e) {
			System.out.println("d5 >>> " + e.getMessage());
		}
		System.out.println("Finished ........");
	}

	private static Double divide(Double a, Double b) {
		// [un]boxing, auto-[un]boxing
		// Integer, Long, float, Double
		// Integer x = 10;
		// int y = x;
		// x = y; gán y(nguyên thủy) cho x(đối tượng)

		// try/catch --> thừa
		// throw/throws
		// -> vị trí gọi hàm mà chưa có validate --> try catch
		// -> vị trí gọi hàm mà có validate --> không xảy ra exception

		Objects.requireNonNull(a,"A cannot be null !!!");
		Objects.requireNonNull(b, "B cannot be null !!!");
		
		// 1/0 --> ngoại lệ
		// 1.0/0.0 --> Infinitive (+ vô cùng)
		if ( b == 0) {
			throw new ArithmeticException("B should not be ZERO");
		}
		return a / b;
	}
}
