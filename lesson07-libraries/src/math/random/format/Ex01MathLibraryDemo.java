package math.random.format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01MathLibraryDemo {
	public static void main(String[] args) {
		//hầu hết các function thuộc trong class Math
		// Vd: max, min, abs, sqrl, sin, cos, tan, cot, rounding
		
		int maxInt = Math.max(22, 12);
		System.out.println("maxInt: " + maxInt);
		
		// scale: amount of decimal digits
		// rounding(scale(2)) 
		// commercial round: 5.54936  --> 5.55
		//                   4.22135  --> 4.22
		// round up			 5.5439   --> 5.55
		//                   4.22135  --> 4.23
		// round down
		double dnumber = 5.54936f;
		// not support set scale(scale(0)) --> round to long
		long roundedFnumber = Math.round(dnumber); 
		System.out.println("RoundedFnumber: " + roundedFnumber);
		
		double roundedUpnumber = Math.ceil(dnumber);
		System.out.println("RoundedUpnumber: " + roundedUpnumber);
		
		double roundedDownnumber = Math.floor(dnumber);
		System.out.println("RoundedUpnumber: " + roundedDownnumber);
		
		// trong thực tế --> tính toán hoặc rounding cho số dicimal
		// nta sẽ sử dụng BigDecimal: cũng là 1 class chứa giá trị double, float
		//                           và hỗ trợ add/subtract/multiple/divide
		//                           và rounding with scale
		
		// Yêu cầu: làm tròn 3 chữ số 
		// HALF_UP: commercial round
		BigDecimal bdnumber = BigDecimal.valueOf(dnumber)
										.setScale(2, RoundingMode.HALF_UP);
		System.out.println("Bdnumber: " + bdnumber);
		
		// calculation
		float value = 52f;
		float sum = 158f;
		
		// --> Find percent of value --> rounding 2 decimal
		BigDecimal bdValue = BigDecimal.valueOf(value);
		BigDecimal bdSum = BigDecimal.valueOf(sum);
		
		BigDecimal percent = bdValue.divide(bdSum, 5, RoundingMode.HALF_UP); 
		BigDecimal percentInConsole = percent.multiply(BigDecimal.valueOf(100))
											 .setScale(2, RoundingMode.HALF_UP);
		System.out.println("Percent: " + percent);
		System.out.println("Percent in console (%): " + percentInConsole);
		
	}
}
