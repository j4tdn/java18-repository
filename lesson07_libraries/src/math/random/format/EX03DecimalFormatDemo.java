package math.random.format;

import java.text.DecimalFormat;
import java.util.Locale;

public class EX03DecimalFormatDemo {
	public static void main(String[] args) {
		double dnumber = 112345678345678d;
		System.out.println("dnumber: " + dnumber);
		String pattern = "#,###.000";
		Locale.setDefault(new Locale("da", "DK"));
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println("formatted dnumber: " + df.format(dnumber));
	}

}
