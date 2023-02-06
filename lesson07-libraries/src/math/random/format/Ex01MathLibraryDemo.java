package math.random.format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01MathLibraryDemo {
	public static void main(String[] args) {
		int maxInt = Math.max(12, 98);
		System.out.println("maxInt : " + maxInt);
		
		// scale : amount of decimal digits
		// rounding(scale(2)) --> commercial round : 5.54936 -> 5.55
		// 										   : 4.22135 -> 4.22
		// round up								   : 5.54936 -> 5.55
		//										   : 4.22135 -> 4.23
		
		double dnumber = 5.54936d;
		long roundedFnumber = Math.round(dnumber);
		System.out.println("roundedFnumber : " + roundedFnumber);
	
		double roundedUpDnumber = Math.ceil(dnumber);
		System.out.println("roundedUpDnumber : " + roundedUpDnumber);
		
		double roundedDownNumber = Math.floor(dnumber);
		System.out.println("roundedDownNumber : " + roundedDownNumber);
		
		// In reality --> calculation, rounding for decimal number
		// --> BigDecimal : class contains double, float value & support
		// 					add/subtract/multiple/divide & rounding with scale
		
		// Require: rounding 3 decimals digits & commercial round for number
		// Half up : commercial round 2080301 20272
		BigDecimal bdNumber = BigDecimal.valueOf(dnumber)
				.setScale(3, RoundingMode.HALF_UP);
		System.out.println("bdNumber : " + bdNumber);
		
		// calculation
		float value = 52f;
		float sum = 158f;
		
		// --> Find percent of value --> rounding 2 decimal
		BigDecimal bdValue = BigDecimal.valueOf(value);
		BigDecimal bdSum = BigDecimal.valueOf(sum);
		
		BigDecimal percent = bdValue.divide(bdSum, 8, RoundingMode.HALF_UP);
		BigDecimal percentInConsole = percent.multiply(BigDecimal.valueOf(100))
				.setScale(2, RoundingMode.HALF_UP);
		System.out.println("Pecent : " + percent);
		System.out.println("PercentInConsole(%) : " + percentInConsole + "%");
	}
}
