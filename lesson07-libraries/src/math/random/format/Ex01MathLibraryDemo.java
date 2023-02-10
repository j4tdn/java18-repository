package math.random.format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01MathLibraryDemo {
	public static void main(String[] args) {
		// Hau het cac function thuoc trong class Math
		// VD: max, min, abs, sqrl, sin, cos, tan, cot, rounding
		
		
		int maxInt = Math.max(25, 12);
		System.out.println("maxInt: " + maxInt);
		
		// scale: amount of decimal digits
		// rounding(scale(2)) --> 
		// commercial round: 5.54936 --> 5.55
		//					 4.22135 --> 4.22
		// round up		   : 5.54936 --> 5.55
		//					 4.22135 --> 4.23
		// round down
		
		double dnumber = 5.54936f;
		long roundedDnumber = Math.round(dnumber);
		System.out.println("roundedFnumber: " + roundedDnumber);
		
		double roundedUpDnumber = Math.ceil(dnumber);
		System.out.println("roundedUpDnumber: " + roundedUpDnumber);
		
		double roundedDownDnumber = Math.floor(dnumber);
		System.out.println("roundedDownDnumber: " + roundedDownDnumber);
		
		// In reality --> calculation, rounding for dicimal number
		//			  --> BigDecimal: class contains double, float value & support add/subtract/multiple/divide & rounding with scale
		BigDecimal bdNumber = BigDecimal.valueOf(dnumber).setScale(2, RoundingMode.HALF_UP);
		System.out.println("bdNumber: " + bdNumber);
		
		// calculation
		float value = 52f;
		float sum = 158f;
		
		BigDecimal bdValue = BigDecimal.valueOf(value);
		BigDecimal bdSum = BigDecimal.valueOf(sum);
		
		BigDecimal percent = bdValue.divide(bdSum, 6, RoundingMode.HALF_UP);
		BigDecimal percentInConsole = percent.multiply(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP);
		
		System.out.println("percent: " + percent);
		System.out.println("percentInConsole(%): " + percentInConsole);
		
		
		
	}

}