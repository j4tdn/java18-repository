package math.random.format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01MathLibraryDemo {
	public static void main(String[] args) {
		// hầu hết các function thuộc trong class Math
		// VD: max, min, abs, sqrt, sin, cos, tan, cot, rounding
		
		int maxInt = Math.max(25, 12);
		System.out.println("maxInt: " + maxInt);
		
		// scale: amount of decimal digits: số lượng chử số muốn làm tròn
		// rounding(scale(2)) -->
		// commercial round: 5.54936 --> 5.55
		// 					 4.22135 --> 4.22
		// round up          5.54936 --> 5.55
		//				     4.22135 --> 4.23
		// round down
		double dnumber = 5.54936d;
		// not support set scale(scale(0)) --> round to long
		long roundedDnumber = Math.round(dnumber);
		System.out.println("roundedDnumber: " + roundedDnumber);
		
		double roundUpDnumber = Math.ceil(dnumber);
		System.out.println("roundUpDnumber: " + roundUpDnumber);
		
		double roundDownDnumber = Math.floor(dnumber);
		System.out.println("roundDownDnumber: " + roundDownDnumber);
		
		// In reality --> calculation, rounding for dicimal number
		// 	          --> bigDecimal: class contains double, float value
		//			      & support add/subtract/multiple/divide
		//			      & rounding with scale
		
		// require: rounding 3 decimals digits & commercial round for number
		// HALF_UP: commercial round
		BigDecimal bdNumber = BigDecimal.valueOf(dnumber).setScale(2, RoundingMode.HALF_UP);
		System.out.println("bdNumber: " + bdNumber);
		
		// calculation
		float value = 52f;
		float sum = 158f;
		
		// --> find percent of value --> rounding 2 decimal
		BigDecimal bdValue = BigDecimal.valueOf(value);
		BigDecimal bdSum = BigDecimal.valueOf(sum);
		
		BigDecimal percent = bdValue.divide(bdSum, 6, RoundingMode.HALF_UP);
		BigDecimal percentInConsole = percent.multiply(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP);
		System.out.println("percent: " + percent);
		System.out.println("percentInConsole(%): " + percentInConsole);
		
		
		
		
	}
}
