package view.kf;

import static java.lang.Math.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01PowerNumber2 {
	public static void main(String[] args) {
		System.out.println("power (3, 9): " + isPower(3, 9));
	}

	private static boolean isPower(int a, int b) {
		return b > a ? isPowerOf(a, b) : isPowerOf(b, a);
	}

	private static boolean isPowerOf(int a, int b) {
		double resultLog = log(b) / log(a);
		resultLog = BigDecimal.valueOf(resultLog).setScale(1, RoundingMode.HALF_UP).doubleValue();
		return ceil(resultLog) == floor(resultLog);
	}

}
