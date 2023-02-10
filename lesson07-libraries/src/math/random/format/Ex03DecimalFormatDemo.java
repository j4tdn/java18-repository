package math.random.format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex03DecimalFormatDemo {
	public static void main(String[] args) {
		double dnumber = 864762347856384762176d;
		System.out.println("dnumber: " + dnumber);
		// format --> formatter tamplate
		//		  --> scale
		//		  --> result in string
		
		// pattern --> # 0 , .
		// # --> phần nguyên, phần thập phân(tuỳ chọn)
		// 0 --> phần nguyên, phần thập phân(bắt buột)
		
		// ex: 		77.712 	77.7
		// ..##		77.71  	77.7
		// ..00		77.71  	77.70
		// , --> dấu ngăn cách gwiaux các nhóm của phần nguyên
		//		so với phần thập phân
		// 5,345,142.432
		String pattern = "#,###.000";
		Locale.setDefault(new Locale("da", "DK"));
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println("formatted dnumber: " + df.format(dnumber));
	}

}