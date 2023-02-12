package math.random.format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.Bidi;

public class Ex01MathLibrariDemo {
	public static void main(String[] args) {
		// Hầy gết các function thuộc trong class Math
		// VD: max, min, abs, sqrt, sin, cos, tan, cot, rounding
		
		int maxInt = Math.max(25, 12);
		System.out.println("maxInt: " + maxInt);
		
		// scale: amount of decimal digits
		// rounding(scale) --> 
		// commercial round: 5.54936 --> 5.55
		// 					 4.22135 --> 4.22
		// round up		   : 5.54936 --> 5.55
		// 				   : 4.22135 --> 4.23
		// round down
		double dnumber = 5.54936f;
		long roundedFnumber = Math.round(dnumber); // not support set scale 0
		System.out.println("roundedNumber: " + roundedFnumber);
		
		double roundedUpFnumber = Math.ceil(dnumber);
		System.out.println("roundedNumber: " + roundedUpFnumber);
		
		double roundedDownFnumber = Math.floor(dnumber);
		System.out.println("roundedNumber: " + roundedDownFnumber);
		
		// In reality --> calculation, rounding for decimal number
		//			  --> BigDecimal: class contains double, float value
		//			  	  & support add/subtract/multiple/divide
		//				  & rounding with scale
		
		// Require: rounding 3 decimal digits & commercial round for number
		
		// HALF-UP: commercial round
		BigDecimal bdNumber = BigDecimal.valueOf(dnumber).setScale(2, RoundingMode.HALF_UP);
		System.out.println("bdNumber " + bdNumber);
		
		// calculation
		float value = 52f;
		float sum = 158f;
		
		// --> Find percent of value --> rounding 2 decimal
		BigDecimal bdValue = BigDecimal.valueOf(value);
		BigDecimal bdSum = BigDecimal.valueOf(sum);
		BigDecimal percent = bdValue.divide(bdSum, 6, RoundingMode.HALF_UP); 
		BigDecimal percentInConsole = percent.multiply(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP);
		
		System.out.println("percent: " + percentInConsole);
		
	}
}
