/*
 * Cách 3: Sử dụng throw, throws để ném ngoại lệ
 * 	--> throw tại đoạn code ngoại lệ
 * 		+ điều khiển việc ném ngoại lệ
 * 		+mục đích: chọn exception, message phù hợp
 * 	--> throws tại phần khai báo của hàm chứa đoạn code xảy ra ngoại lệ
 * 		+Khi bên trong hàm có throw runtime-exception
 * 			--> Bắt buộc phải throws compile-exception
 * 		+khi bên trong hàm có throw runtime-exception
 * 			--> không bắt buộc/ cần phải throws runtime-exception
 * 		+chổ gọi hàm này phải try/catch nếu muốn chương trình không bị kết thúc khi gặp ngoại lệ
 */
package throw_throws_trycatch;

import java.util.Objects;

public class Ex01Division {
	public static void main(String[] args) {
//		divide(10d, null);
//		divide(null, 6d);
//		divide(7d, 0d);
		System.out.println("d1 --> "+divide(50d, 6d));
		try {
			System.out.println("d2 --> "+divide(null, 60d));
		} catch (NullPointerException e) {
			System.out.println("d2 >> "+e.getMessage());
		}
		try {
			System.out.println("d3 --> "+divide(70d, 0d));
		} catch (Exception e) {
			System.out.println("d3 >> "+e.getMessage());
		}
		
	}
	private static Double divide(Double a, Double b) {
		Objects.requireNonNull(a,"A cannot be null !!!");
		Objects.requireNonNull(b,"B cannot be null !!!");
		if(b==0) {
			throw new ArithmeticException("B should be not Zer0");
		}
		return a/b;
	}
}
