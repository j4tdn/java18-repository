package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Ex01DateTimeGetter {
	public static void main(String[] args) {
		System.out.println("Curren time in ms " + System.currentTimeMillis());
		System.out.println("0. Lấy thông tin thời gian hiện tại với [timezone]");
		Date date = new Date();
		System.out.println("date: " + date);
		// since JAVA 1.1
		// Calendar --> singleton(unique) at getting time 
		Calendar c = Calendar.getInstance();
		System.out.println("c: " + c);
		c.set(Calendar.MONTH, Calendar.FEBRUARY);
		System.out.println("default locale: " + Locale.getDefault());
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		c.set(Calendar.YEAR, 2020);
		int fdow = c.getFirstDayOfWeek();
		int dayInMonth= c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int dayInYear= c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("fdow " + fdow);
		System.out.println("dayInMonth " + dayInMonth);
		System.out.println("dayInYear " + dayInYear);
		System.out.println("default timezone : " + TimeZone.getDefault());
		TimeZone HST = TimeZone.getTimeZone("HST");
		Calendar a = Calendar.getInstance(HST);
		System.out.println("HST  --> " + a);
		
	}
}
