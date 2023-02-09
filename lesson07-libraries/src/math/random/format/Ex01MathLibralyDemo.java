package math.random.format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01MathLibralyDemo {
	public static void main(String[] args) {
		// Hầu hết các function thuộc trong class Math
		//VD: max ,min abs,sqrl,sin,cos,tan,cot,rounding
		int maxInt = Math.max(25, 12);
		System.out.println("Maxint : " + maxInt);
		// scale: amount ò decimal digits
		// rouding(scale) --> commercial round :
		// rouding (scale(2)) -->
		// commercial round : 5.54936--> 5.55
		// round up : 5.549--> 5.55
		// round down :
		
		double dnumber = 5.54936f;
		long roundedFnumber= Math.round(dnumber);
		System.out.println("roundedDnumber -->" + roundedFnumber);
		// not support set scale --> round to long 
		double roundupFnumber= Math.ceil(dnumber);
		System.out.println("roundupDnumber -->" + roundupFnumber);
		double rounddownFnumber= Math.floor(dnumber);
		System.out.println("rounddownFnumber -->" + rounddownFnumber);
		
		// In reality --> calculation 
		//			  --> Bigdecimal : class contains double ,float value
		//				  & support add/subtract/multiple
		// 				  & rouding with scale 
		
		// Require : rouding 3 decimals digits
		// Half_up : commercial round 
		BigDecimal bdNumer = BigDecimal.valueOf(dnumber).setScale(3, RoundingMode.HALF_UP);
		System.out.println("bdNumer : "  + bdNumer);
		// calculation
		float value = 52f;
		float sum = 158f;
		// --> Find percont of value --> rouding 2 decimal
		BigDecimal bdValue = BigDecimal.valueOf(value);
		BigDecimal bdSum = BigDecimal.valueOf(sum);
		BigDecimal percent = bdValue.divide(bdSum, 6, RoundingMode.HALF_UP);
		BigDecimal percentConsole = percent.multiply(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP);
		System.out.println("percent--> " + percent);
		System.out.println("percentConsole(%)--> " + percentConsole);
		
	}
}
