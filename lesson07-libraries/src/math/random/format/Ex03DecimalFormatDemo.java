package math.random.format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex03DecimalFormatDemo {
	public static void main(String[] args) {
		double dnumber = 1124234.12312312d;
		System.out.println("dnumber: " + dnumber);
		// format --> formatter template 
		//		  --> scale 
		// 		  --> result in string 
		// pattern --> # 0 ,  . 
		// # --> phần nguyên,phần thập phân (bắt buộc)
		// 0 --> phần nguyên , phần thập phân (bắt buộc)
		// thập phân 77.782 77.7
		// ..##:	77.78    77.7
		// ..00:    77.78    77.70
		// ,--> dấu ngăn cách phần thập phân
		// . ngăn cách phần tập phân
		// 5,231,231.233 ( công thức )
		Locale.setDefault(new Locale("da","DK"));
		String pattern ="#,###.###";
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println("format dnumber --> " + df.format(dnumber));
	}
}
