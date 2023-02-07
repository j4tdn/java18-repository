package math.random.format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex03DecimalFormatDemo {
	public static void main(String[] args) {
		// 1123456787652345678.628529d;
		double dnumber = 11234567.62d;
		//  1.12345678765234573E18
		System.out.println("dnumber: " + dnumber);
		
		// format --> formatter template
		//        --> scale
		//        --> result in string
		
		// pattern --> # 0 , .
		// # --> phần nguyên, phần thập phân(tùy chọn)
		// 0 --> phần nguyên, phần thập phân(bắt buộc)
		// thập phân 77.782 77.7
		// ..##:     77.78  77.7
		// ..00:     77.78  77.70
		// , --> dấu ngăn cách giữa các nhóm của phân nguyên
		// . --> ngăn cách phần thập phân (công thức)
		// 5,236,233.233 
		String pattern = "#,###.000";
		Locale.setDefault(new Locale("da", "DK"));
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println("formatted dnumber: " + df.format(dnumber));
	}
}
