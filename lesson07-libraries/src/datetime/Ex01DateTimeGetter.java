package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ex01DateTimeGetter {
	public static void main(String[] args) {
		long currentTimeInMs = System.currentTimeMillis();
		System.out.println("Current time in ms: " + currentTimeInMs);

		System.out.println(".. Lấy thông tin thời gian hiện tại với [time]");

		Date date = new Date(currentTimeInMs);
		System.out.println("date: " + date);

		Calendar c = Calendar.getInstance();
		System.out.println("c: " + c);

		System.out.println("default locale: " + Locale.getDefault());

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println("month/year: " + month + "/" + year);

		c.set(Calendar.YEAR, 2020);
		int fdow = c.getFirstDayOfWeek();
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int daysInYear = c.getActualMinimum(Calendar.DAY_OF_YEAR);

		System.out.println("fdow: " + fdow);
		System.out.println("daysInMonth: " + daysInMonth);
		System.out.println("daysInYear: " + daysInYear);
	}
}