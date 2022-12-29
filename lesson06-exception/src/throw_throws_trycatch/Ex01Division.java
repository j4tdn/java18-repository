package throw_throws_trycatch;

import java.util.Objects;

public class Ex01Division {
	public static void main(String[] args) {
		System.out.println("5.0 / 2.0 >>> " + divide(5.0d, 2.0d));
		try {
			System.out.println("null / 2.0 >>> " + divide(null, 2.0d));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("5.0 / null >>> " + divide(5.0d, null));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("5.0 / 2.0 >>> " + divide(5.0d, 0d));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	private static Double divide(Double a, Double b) {
		if(a == null) {
			throw new NullPointerException("a cannot be null");
		}
		Objects.requireNonNull(b, "b cannot be null");
		if(b == 0) {
			throw new ArithmeticException("b must not be ZERO");
		}
		return a / b;
	}
}
