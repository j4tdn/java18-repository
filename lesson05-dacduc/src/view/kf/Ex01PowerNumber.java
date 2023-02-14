package view.kf;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01PowerNumber {
	public static void main(String[] args) {
		System.out.println("power (3, 9): " + isPowerOf(3, 9));
	}

	private static boolean isPowerOf(int a, int b) {
		double log = BigDecimal.valueOf(Math.log(Math.max(a, b)) / Math.log(Math.min(a, b)))
				.setScale(6, RoundingMode.HALF_UP) // Làm tròn 6 chữ số (HALF UP: chế độ làm tròn; VD 5.5 => 6)
				.doubleValue(); // ép kiểu từ BigDecimal sang double
		return Math.ceil(log) == Math.floor(log);
	}
}
