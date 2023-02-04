package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ex01DateTimeGetter {
	public static void main(String[] args) {
		long currentTimeInMs = System.currentTimeMillis();
		System.out.println("Current time in ms: " + currentTimeInMs);
		System.out.println("0. lấy thời gian hiện tại vs timezone");
		//Date date = new Date();
		Date date = new Date(currentTimeInMs);
		System.out.println("date: " + date);
		//Locale.setDefault(new Locale("en", "US"));
		Calendar c = Calendar.getInstance();
		System.out.println("c: " + c);
		c.set(Calendar.MONTH,Calendar.FEBRUARY );
		System.out.println("default locale: " + Locale.getDefault());
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		System.out.println("month/year: " +month + "/" + year);
		
		c.set(Calendar.YEAR, 2020);
		int fdow = c.getFirstDayOfWeek();
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int daysYear = c.getActualMaximum(Calendar.DAY_OF_WEEK);
		System.out.println("fdow: " + fdow);
		System.out.println("daysInMonth: " + daysInMonth);
		System.out.println("daysInYear: " + daysYear);
	}

}
