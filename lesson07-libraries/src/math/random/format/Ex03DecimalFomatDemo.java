package math.random.format;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Ex03DecimalFomatDemo {
	public static void main(String[] args) {
		double dnumber = 123213214214124948149d;
		System.out.println(dnumber);
		
		//format --> formatter template
//				 --> scale
//				 --> result in String
		
        //pattern --> # 0 , .
		String pattern = "#,###.000";
		Locale.setDefault(new Locale("da","DK"));
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println("formatted dnumber: "+df.format(dnumber));
	
	}
}
