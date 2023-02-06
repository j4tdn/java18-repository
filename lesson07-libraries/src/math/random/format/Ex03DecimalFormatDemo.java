package math.random.format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex03DecimalFormatDemo {
	public static void main(String[] args) {
		double dnumber = 1923874797812375d;
		System.out.println("dnumber : " + dnumber);
		
		// format --> formatter template
		// 		  --> scale
		// 		  --> result in string
		
		// pattern --> # 0 , .
		// # --> Phần nguyên, phần thập phân (optional)
		// 0 --> Phần nguyên, phần thập phân (bắt buộc)
		// , --> Ngăn cách phần nguyên
		// . --> Ngăn cách phần nguyên với phần thập phân
		String pattern = "#,###";
		Locale.setDefault(new Locale("da", "DK"));
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println("formatted dnumber : " + df.format(dnumber));
	}
}
