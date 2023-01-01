package throw_throws_trycatch;

import java.util.Objects;

public class Ex01Division {
	public static void main(String[] args) {
		System.out.println("d1 --> " + divide(10d, 2d));
		
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
	}
	
	private static Double divide(Double a, Double b) {
		// [un]boxing, auto-[un]boxing
		// Integer, Long, Float, Double
		// Try/catch, Long, Float, Double
		// throw/throws
		Objects.requireNonNull(a, "A cannot be null !!!");
		Objects.requireNonNull(b, "B cannot be null !!!");
		
		if(b == 0) {
			throw new ArithmeticException("B should not be ZERO !!!");
		}
		return a/b;
	}
}
