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
		// # --> phần nguyên, phần thập phân( tùy chọn)
		// 0 --> phần nguyên, phần thập phân( bắt buộc)
		//thập phân 77.787	77.7
		// ..## 	77.78 	77.7
		// ..00		77.78	77.70
		// , --> dấu ngăn cách giữa các nhóm phần nguyên
		// . --> ngăn cách phần thập phân ( công thức )
		// 5,233,232.223
		String pattern = "#,###.000";
		Locale
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println("format number: " + df.format(dnumber));
	}
}
