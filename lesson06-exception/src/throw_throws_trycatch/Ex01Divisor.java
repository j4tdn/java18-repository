package throw_throws_trycatch;

import java.util.Objects;

public class Ex01Divisor {
	public static void main(String[] args) {
		// validate a!=null, b!=null, b!=0
		System.out.println("d1 --> " + divide(10d, 2d));
		
		try {
			System.out.println("d2 --> " + divide(null, 2d)); // ER
		} catch (NullPointerException e) {
			System.out.println("d2 >>> " + e.getMessage());
		}
		
		try {
			System.out.println("d3 --> " + divide(10d, null)); // ER
		} catch (NullPointerException e) {
			System.out.println("d3 >>> " + e.getMessage());
		}
		
		System.out.println("d4 --> " + divide(10d, 4d));
		
		try {
			System.out.println("d5 --> " + divide(10d, 0d)); // ER
		} catch (ArithmeticException e) {
			System.out.println("d5 >>> " + e.getMessage());
		}
		
		System.out.println("Finished ..........");
		
	}
	
	private static Double divide(Double a, Double b) {
		// [un]boxing, auto-[un]boxing
		// Integer, Long, Float, Double
		// try/catch --> thừa nếu chỗ gọi hàm đã validate
		// throw/throws
		//   + vị trí gọi hàm mà chưa có validate --> try catch
		//   + vị trí gọi hàm mà có validate --> ....
		Objects.requireNonNull(a, "A cannot be null !!!");
		Objects.requireNonNull(b, "B cannot be null !!!");
		
		// 1/0     --> ngoại lệ
		// 1.0/0.0 --> Infinitive
		if (b == 0) {
			throw new ArithmeticException("B should not be ZERO !!!");
		}
		return a / b;
	}
}
