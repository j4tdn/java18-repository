package math.random.format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01MathLibraryDemo {
	public static void main(String[] args) {
		//Hầu hết các function thuộc trong class Math
		//VD: max, min, abs, sqrl, sin, cos, tan, cot, rounding
		
		int maxInt = Math.max(25,12);
		System.out.println("MaxInt: " + maxInt);
		
		//scale: amount of decimal digits
		//rounding(scale(2)) -->
		//              4.2213 --> 4.22
		//              5.5496 --> 5.55
		
		float dnumber = 5.54936f;
		long roundedDnumer = Math.round(dnumber);
		System.out.println("roundedDnumer: " + roundedDnumer);
		
		double roundedUpDnumer = Math.ceil(dnumber);
		System.out.println("roundedUpDnumer: " + roundedUpDnumer);
		
		double roundedDowDnumer = Math.floor(dnumber);
		System.out.println("roundedDowDnumer: " + roundedDowDnumer);
		
		//In reality --> calculation, rounding forr dicimalnumber
		//           --> BigDecimal: class contains double, float value
		//               & support add/subtract/multip;e/divide
		//  			 & rounding with scale
		
		
		//require: rounding 3 decimals digit & commercial round for number
		//HALF_UP: commercial round
		BigDecimal bdNumber = BigDecimal.valueOf(dnumber).setScale(3, RoundingMode.HALF_UP);
		System.out.println("bdNumber: " + bdNumber);
		
		//caculation
		float value = 52f;
		float sum = 158f;
		
		//--> Find percent of value --> rounding 3 decimal
		BigDecimal bdValue = BigDecimal.valueOf(value);
		BigDecimal bdSum = BigDecimal.valueOf(sum);
		
		BigDecimal percent = bdValue.divide(bdSum, 6, RoundingMode.HALF_UP);
		BigDecimal percentInConsole = percent.multiply(BigDecimal.valueOf(100))
				.setScale(2, RoundingMode.HALF_UP);
		System.out.println("percent: " + percent);
		System.out.println("percentInConsole: " + percentInConsole);
	}
}
