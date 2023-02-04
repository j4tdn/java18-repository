package datetime;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;

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
		
		System.out.println("default time zone: " + TimeZone.getDefault());
		TimeZone bITz = TimeZone.getTimeZone("HST");
		Calendar cAtBerLin = Calendar.getInstance(bITz);
		System.out.println("cAtBerLin --> " + cAtBerLin);
		//printTzIds();
		
		int dow = cAtBerLin.get(Calendar.DAY_OF_WEEK);
		System.out.println("dow: " + dow);
		
		String[] weekDayAsString = {"CHủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy"};
		String weekday = weekDayAsString[dow -1];
		System.out.println("weekday: " + weekday);
		
		int currentYear = Year.now().getValue();
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLeapYear: " + gc.isLeapYear(currentYear));
		
		Calendar cInVn = Calendar.getInstance(new Locale("vi", "VN"));
		System.out.println("fdow in VN: " + cInVn.getFirstDayOfWeek());
		System.out.println("current day: " + cInVn.get(Calendar.DAY_OF_MONTH));
		
		cInVn.set(Calendar.DAY_OF_MONTH, 1);
		Calendar cfodw = getDayOffdow(cInVn);
		System.out.println("d/M/Y --> " + cfodw.get(Calendar.DAY_OF_MONTH) + "/" + (cfodw.get(Calendar.MONTH) + 1) + "/" + (cfodw.get(Calendar.YEAR)) );
		System.out.println("--------current weekday--------------");
		printCurrentWeekday(cInVn);
	}
	
	private static Calendar getDayOffdow(Calendar c) {
		Calendar cr = Calendar.getInstance();
		cr.setTimeInMillis(c.getTimeInMillis());
		int dow = cr.get(Calendar.DAY_OF_WEEK);
		int fdow = cr.getFirstDayOfWeek();
		cr.add(Calendar.DAY_OF_MONTH, fdow - dow);
		if (dow == Calendar.SUNDAY) {
			cr.add(Calendar.DAY_OF_WEEK, -7);
		}
		return cr;
	}
	
	private static void printCurrentWeekday(Calendar c) {
		Calendar start = getDayOffdow(c);
		Calendar end = Calendar.getInstance();
		end.setTimeInMillis(start.getTimeInMillis());
		end.add(Calendar.WEEK_OF_YEAR, 1);
		
		for (Calendar running = start; running.before(end); running.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("d/M/Y --> " + running.get(Calendar.DAY_OF_MONTH) + "/" + (running.get(Calendar.MONTH) + 1) + "/" + (running.get(Calendar.YEAR)) );		
		}
	}
	
	private static void printTzIds() {
		System.out.println("TImezone Ids ...");
		System.out.println("----------------");
		String[] tzIds = TimeZone.getAvailableIDs();
		for (String tzId: tzIds ) {
			System.out.println(tzId);
		}
	}
	
	

}
