package datetime;

import java.time.Year;
import java.util.Calendar;

/**
 * server --> setup --> UTC+7 --> sys-time --> sys-time of UTC+7
 * select country/timezone --> sys-time at selection timezone
 * epoch time --> standard base time: 01.01.1970 00:00:00
 * unix time --> base time --> add/ subtract time 
 * 
 * singleton: creational design pattern 
 * normal class --> 1-N object(s)
 * singleton    --> 1 object
 * (tạo 100 đối tượng, mang giá trị như nhau => nên dùng singleton => trỏ đến 1 ô nhớ duy nhất)
 */

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex01DateTimeGetter {
	public static void main(String[] args) {
		long currentTimeInMs = System.currentTimeMillis();
		System.out.println("Current time in ms: " + currentTimeInMs);

		System.out.println("0. Lấy thông tin thời gian hiện tịa với [timezone]: ");
		// Date date = new Date(); // now
		Date date = new Date(currentTimeInMs); // calculated from epoch time
		System.out.println("date: " + date);

		// Since JAVA 1.1
		Calendar c = Calendar.getInstance();
		System.out.println("c: " + c);

		c.set(Calendar.MONTH, Calendar.FEBRUARY);

		System.out.println("default locale: " + Locale.getDefault());

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println("month/year: " + month + "/" + year);

		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

		c.set(Calendar.YEAR, 2020);

		// special fields, functions
		// first day of week, day(s) in month/year
		int fdow = c.getFirstDayOfWeek();
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		int daysOfWeek = c.getActualMinimum(dayOfWeek);

		System.out.println("fdow: " + fdow);
		System.out.println("daysInMonth: " + daysInMonth);
		System.out.println("daysInYear: " + daysInYear);
		System.out.println("daysOfWeek: " + daysOfWeek);
		
		System.out.println("===========================================");

		System.out.println("default timezone: " + TimeZone.getDefault());

		TimeZone blTz = TimeZone.getTimeZone("HST");
		Calendar cAtHawaii = Calendar.getInstance(blTz);
		System.out.println("cAtHawaii: " + cAtHawaii);

		printTzIds();
		
		// Thứ Hai - Chủ Nhật
		int dow = cAtHawaii.get(Calendar.DAY_OF_WEEK);
		System.out.println("dow: " + dow);

		String[] weekDayAsString = { "Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy" };
		System.out.println("weekDayAsString: " + weekDayAsString[dow - 1]);
		
		// Leap-year
		int currentYear = Year.now().getValue();
		// Calendar (parent), GregorianCalendar
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLeapYear: " + gc.isLeapYear(currentYear));
		
		// Ngày đầu tiên trong tuần hiện tại là ngày mấy
		Calendar cInVN = Calendar.getInstance(new Locale("vi", "VN"));
		Calendar cfodw = getDayOfFdow(cInVN);
		System.out.println("d/M/Y -->" 
					      + cfodw.get(Calendar.DAY_OF_MONTH)
						  + "/" + (cfodw.get(Calendar.MONTH) + 1)
						  + "/" + cfodw.get(Calendar.YEAR));
		
		printCurrentWeekDays(cInVN);

	}
	
	private static void printCurrentWeekDays(Calendar c) {
		// B1: Tìm ngày đầu tuần --> 26.12.2022
		Calendar start = getDayOfFdow(c);
		
		// B2: Tìm ngày cuối tuần
		Calendar end = Calendar.getInstance();
		end.setTimeInMillis(start.getTimeInMillis());
		end.add(Calendar.WEEK_OF_YEAR, 1);
		
		for (Calendar running = start; running.before(end); running.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("d/M/Y -->" 
				      + running.get(Calendar.DAY_OF_MONTH)
					  + "/" + (running.get(Calendar.MONTH) + 1)
					  + "/" + running.get(Calendar.YEAR));
		}
	}
	
	private static Calendar getDayOfFdow (Calendar c) {
		Calendar cr = Calendar.getInstance();
		cr.setTimeInMillis(c.getTimeInMillis());
		int dow = cr.get(Calendar.DAY_OF_WEEK);
		int fdow = cr.getFirstDayOfWeek();
		cr.add(Calendar.DAY_OF_MONTH, fdow - dow);
		if (dow == Calendar.SUNDAY) {
			cr.add(Calendar.WEEK_OF_YEAR, -1);
		}
		
		return cr;
	}

	private static void printTzIds() {
		System.out.println("-----TimeZone Ids-----");
		String[] tzIds = TimeZone.getAvailableIDs();
		for (String tzId : tzIds) {
			System.out.println(tzId);
		}
	}

}