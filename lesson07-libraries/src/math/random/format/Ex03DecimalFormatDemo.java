package math.random.format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex03DecimalFormatDemo {
	public static void main(String[] args) {
		double dnumber = 12356345234.523423d;
		// 1.2356345234958275E19
		System.out.println("dnumber: " + dnumber);
		
		// format --> formatter template
		//        --> scale
		//        --> result in string
		
		/*
		 * pattern --> # 0 , .
		 * # --> phần nguyên, phần thập phân(tùy chọn)
		 * 0 --> phần nguyên, phần thập phân(bắt buộc)
		 * thập phân  77.782   77.7
		 * ..##       77.78    77.7
		 * ..00       77.78    77.70 
		 * , --> dấu ngăn cách giữa các nhóm của phần nguyên
		 * . --> dấu ngắn cách phần thập phân (công thức)
		 * 5,234,354.233
		 */
		String pattern = "#,###.000";
		// Cách hiển thị bên Đan Mạch: 12.356.345.234,523
		// Bên Anh: 12,356,345,234.523
		Locale.setDefault(new Locale("da", "DK"));
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println("formatted number: " + df.format(dnumber));
	}
}
