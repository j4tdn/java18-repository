package math.random.format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex03DecimalFormatDemo {
	public static void main(String[] args) {
		//1123456787652345678.628529d;
		double dnumber = 112378.62d;
		System.out.println("dnumber: " + dnumber);

		String pattern = "#,###.000";
		Locale.setDefault(new Locale("da", "DK"));
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println("formatted dnumber: " + df.format(dnumber));
	}
}