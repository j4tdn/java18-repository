package math.random.format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01MathLibraryDemo {
	public static void main(String[] args) {
		// scale: amount of decimal digits
		// routing(scale(2)) -->
		// comercial round: 5.54936 --> 5.55
		double dmath = 5.54936d;
		long roundedFnumber = Math.round(dmath);
		System.out.println("roundedFnumber: " + roundedFnumber);
		// 4.22135 --> 4.22
		// round up : 5.54936 --> 5.55
		double roundedUpDnumber = Math.ceil(dmath);
		System.out.println("roundedFnumber: " + roundedUpDnumber);
		// round down
		double roundedDownDnumber = Math.floor(dmath);
		System.out.println("roundedFnumber: " + roundedDownDnumber);

		/**
		 * require: rounting 3 decimals digits & comercial round for number
		 */
		BigDecimal bdNumber = BigDecimal.valueOf(dmath).setScale(3, RoundingMode.HALF_UP);
		System.out.println("bdNumber: " + bdNumber);
		// calculator
		float value = 52f;
		float sum = 158f;

		/**
		 * find percent of value --> rounding 2 decimal
		 */
		BigDecimal bdValue = BigDecimal.valueOf(value);
		BigDecimal bdSum = BigDecimal.valueOf(sum);

		BigDecimal percent = bdValue.divide(bdSum, 5, RoundingMode.HALF_UP);
		System.out.println("percent: " + percent);
	}
}
