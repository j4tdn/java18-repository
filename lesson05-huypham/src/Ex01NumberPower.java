import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01NumberPower {
	public static void main(String[] args) {
		System.out.println("power(4,16) : " + isPowerOf(4,16));
	}
	private static boolean isPowerOf(int a, int b) {
		double log = BigDecimal.valueOf(
				Math.log(Math.max(a, b)) / Math.log(Math.min(a, b)))
				.setScale(3, RoundingMode.HALF_UP)
				.doubleValue();
		System.out.println(log);
		return Math.ceil(log) == Math.floor(log);
	}
}
