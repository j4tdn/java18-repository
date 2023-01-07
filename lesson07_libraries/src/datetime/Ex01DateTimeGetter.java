package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ex01DateTimeGetter {
	public static void main(String[] args) {
		// sever --> setup --> UTC + 7
		// sys-time --> sys-time of UTC + 7
		// select country/ timezone --> sys-time at selecttion timezone
		
		long currentTimeInMs = System.currentTimeMillis();
		System.out.println("Current time in ms: " + currentTimeInMs);
		
		System.out.println("0. Lay thong tin thoi gian hien tai voi [timezone]");
		Date date = new Date(currentTimeInMs);
		System.out.println("date: " + date);
		
		// since JAVA 1.1
		Calendar c = Calendar.getInstance();
		System.out.println("c: " + c);
		
		c.set(Calendar.MONTH, Calendar.FEBRUARY);
		
		System.out.println("default locale: " + Locale.getDefault());
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println("month/year: " + month + "/" + year);
		
		c.set(Calendar.YEAR, 2020);
		// special fields, functions
		// first day of week, day(s) in month/year
		int fdow = c.getFirstDayOfWeek();
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		
		System.out.println("fdow: " + fdow);
		System.out.println("daysInMonth: " + daysInMonth);
		System.out.println("daysInYear: " + daysInYear);
		
		
	}
	
	

}
