package throw_throws_trycatch;

import java.util.Objects;

public class Ex01Divisor {

	public static void main(String[] args) {
		System.out.println("d1 --> " + divide(10d, 2d));
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
		
		System.out.println("d4 --> " + divide(10d, 4d));
		
		try {
			System.out.println("d5 --> " + divide(10d, 0d));
		} catch (IllegalArgumentException e) {
			// tham số không hợp lệ
			System.out.println("d5 >>> " + e.getMessage());
		}
		System.out.println("Finish");
	}

	private static double divide(Double a, Double b) {
		/*
		Integer, Long, Float, Double
		Integer x = 10;
		[un]boxing, auto-[un]ưboxing
		un-boxing: đối tượng sang nguyên thủy: int y = x;
		boxing: nguyên thủy sang đối tượng: x = y;
		 */
		
		/*
		 * try/catch ---> thừa nếu chổ gọi hàm đã validate
		 * throw/throws
		 * 	+ vị trí gọi hàm mà chưa có validate --> try/catch
		 *  + vị trí gọi hàm có validate ---> ....
		 */
		
//		if (a == null) {
//			throw new NullPointerException("A cannot be null !!!");
//		}
		Objects.requireNonNull(a, "A cannot be null !!!");
		Objects.requireNonNull(b, "B cannot be null !!!");
		
		// 1/0 --> ngoại lệ
		// 1.1/0.0 --> Infinitive
		
		if (b == 0) {
			// ArithmeticException: toán học
			throw new IllegalArgumentException("B should not be ZERO");
		}
		return a / b;
	}
}
