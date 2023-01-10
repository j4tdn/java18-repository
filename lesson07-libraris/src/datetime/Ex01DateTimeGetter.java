package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ex01DateTimeGetter {
	public static void main(String[] args) {
		// server --> setup --> UTC+7
		// --> sys-time --> sys-time of UTC+7
		// select country/timezone --> sys-time at selection timezone

		// epoch time --> standard base time: 01.01.1970 00:00:00
		// unix time --> base time --> add/subtract/duration time

		long currentTimeInMs = System.currentTimeMillis();
		System.out.println("Current time in ms: " + currentTimeInMs);

		System.out.println("Lấy thông tin thời gian hiện tại với [timezone]");
		// Date date = new date();
		Date date = new Date(currentTimeInMs);
		System.out.println("date: " + date);

		// Since JAVA 1.1
		// Calendar --> singleton(unique) at getting
		// singleton: creation design pattern
		// normal class --> 1-N object
		// singleton class --> 1 object

		Calendar c = Calendar.getInstance();
		System.out.println("c: " + c);

		c.set(Calendar.MONTH, Calendar.FEBRUARY);

		// MONTH --> 0(Jan) - 11(Dec)
		// SUNDAY = 1
		// defaut locale(country,language) --> US

		System.out.println("defaut locale: " + Locale.getDefault());

		// YEAR=2023, MONTH=0 --> too many attributes

		int year = c.get(Calendar.YEAR); // c.getYear();
		int month = c.get(Calendar.MONTH);
		System.out.println("month/year: " + month + "/" + year);

		// dayOfMonth, dayOfYear, weekOfYear
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);

		c.set(Calendar.YEAR, 2020);

		int fdow = c.getFirstDayOfWeek();
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);

		System.out.println("fdow: " + fdow);
		System.out.println("daysInMonth: " + dayOfMonth);
		System.out.println("daysInYear: " + daysInYear);

	}
}
