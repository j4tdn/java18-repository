package math.random.format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex03DecimalFormatDemo {
	public static void main(String[] args) {
		double dnumber = 3125362547623578d;
		System.out.println("dnumber : " + dnumber);
		
		//format --> formatter template
		//       --> scals
		//       --> result in String
		
		//pattern --> # 0 , .
		// # --> pháº§n nguyÃªn, pháº§n tháº­p phÃ¢n( tÃ¹y chá»�n)
		// 0 --> pháº§n nguyÃªn, pháº§n tháº­p phÃ¢n( báº¯t buá»™c)
		//tháº­p phÃ¢n 77.787	77.7
		// ..## 	77.78 	77.7
		// ..00		77.78	77.70
		// , --> dáº¥u ngÄƒn cÃ¡ch giá»¯a cÃ¡c nhÃ³m pháº§n nguyÃªn
		// . --> ngÄƒn cÃ¡ch pháº§n tháº­p phÃ¢n ( cÃ´ng thá»©c )
		// 5,233,232.223
		String pattern = "#,###.000";
//		Locale
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println("format number: " + df.format(dnumber));
	}
}
