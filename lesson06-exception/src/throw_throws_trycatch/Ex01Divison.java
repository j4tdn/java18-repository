package throw_throws_trycatch;

import java.util.Objects;

public class Ex01Divison {
	public static void main(String[] args) {
		try {
		System.out.println("d1 --> " + divide(null, null));
		} catch (NullPointerException e) {
			System.out.println("d1 >> " + e.getMessage());
		}
		
		System.out.println("d2 --> " + divide(10d, 2d));
		
		try {
			System.out.println("d3 --> " + divide(10d, 0d));
		} catch (ArithmeticException e) {
				System.out.println("d3 >> " + e.getMessage());
		}
		System.out.println("end.....");
	}
	
	private static Double divide (Double a, Double b) {
		// try/cathc --> thừa nếu chỗ gọi hàm đã validate
		// throw/throws
		//	+ Vị trí gọi hàm mà chưa có validate --> try catch
		//	+ Vị trí gọi hàm mà có validate -->...
		
		Objects.requireNonNull(a,"A cannot be null :)");
		Objects.requireNonNull(b,"B cannot be null :)");
		
		if (b == 0) {
			throw new ArithmeticException("B should not be ZERO");
		}
		return a/b;
	}
}
