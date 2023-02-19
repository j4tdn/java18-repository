package math.random.format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01MathLibraryDemo {
	public static void main(String[] args) {
		int maxInt = Math.max(25,12);
		System.out.println("maxInt: " + maxInt);
		double dnumber = 5.54936f;
		long roundedDnumer = Math.round(dnumber);
		System.out.println("roundedDownNumer: " + roundedDnumer);
		
		double roundedUpDnumer = Math.ceil(dnumber);
		System.out.println("roundedUpnumer: " + roundedUpDnumer);
		
		double roundedDownDnumer = Math.floor(dnumber);
		System.out.println("roundedUpNumer: " + roundedDownDnumer);
		
		
		BigDecimal bdNumber = BigDecimal.valueOf(dnumber).setScale(2, RoundingMode.HALF_UP);
		
		System.out.println("bdNumber: " + bdNumber);
		
		float value = 52f;
		float sum = 158f;
		
		BigDecimal bdValue = BigDecimal.valueOf(value);
		BigDecimal bdSum = BigDecimal.valueOf(sum);
		
		BigDecimal percent = bdValue.divide(bdSum, 6, RoundingMode.HALF_UP);
		BigDecimal percentInConsole = percent.multiply(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP);
		
		
		System.out.println("percent: " + percent);
		System.out.println("percentInConsole%: " + percentInConsole);
	}

}
