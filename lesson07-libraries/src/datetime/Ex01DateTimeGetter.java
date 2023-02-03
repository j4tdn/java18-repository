package datetime;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex01DateTimeGetter {

	public static void main(String[] args) {
		// server --> setup --> UTC+7 -->
		// sys-time --> sys-time of UTC+7

		// select country/timezone --> sys-time at selection timezone

		// epoch time --> standard base time: 01.01.1970 00:00:00
		// unix time --> base time --> add/sub/duration time
		long currentTimeInMs = System.currentTimeMillis();
		System.out.println("Current time in ms: " + currentTimeInMs);

		System.out.println("0. Lấy thông tin thời gian hiện tại: ");
		// Date date = new Date();
		Date date = new Date(currentTimeInMs);
		System.out.println("date: " + date);

		Locale.setDefault(new Locale("vi", "VN"));

		// Since JAVA 1.1
		// Calender --> singleton(unique) at getting time
		Calendar c = Calendar.getInstance();
		System.out.println("c: " + c);

		// c.set(Calendar.MONTH, Calendar.FEBRUARY);

		// MONTH --> 0(Jan) --> 11(Dec)

		// Sunday = 1 fdow = 1 (US, JP, CND) --> Locale(language, country)
		// default locale = US
		System.out.println("default locale: " + Locale.getDefault());

		// YEAR: 2020, MONTH = 0 --> too many atributes
		int year = c.get(Calendar.YEAR); // c.getYear()
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println("month/year " + month + "/" + year);

		// dayOfMonth, dayOfYear, weekOfYear
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);

		// c.set(Calendar.YEAR, 2020);

		// special fields, functions
		// first day of week, day(s) in month/year
		int fdow = c.getFirstDayOfWeek();
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);

		System.out.println("flow: " + fdow);
		System.out.println("daysInMonth: " + daysInMonth);
		System.out.println("daysInYear: " + daysInYear);

		System.out.println("============================================");

		// Lấy thông tin hiện tại với TimeZone

		System.out.println("default time zone: " + TimeZone.getDefault());
		TimeZone blTz = TimeZone.getTimeZone("HST");
		Calendar cAtHst = Calendar.getInstance(blTz);
		System.out.println("cAtHst: " + cAtHst);
		// printTzIds();

		// Thứ ngày, tuần, tháng trong năm

		// Thứ 2 --> Chủ Nhật
		int dow = cAtHst.get(Calendar.DAY_OF_WEEK);
		System.out.println("dow: " + dow);
		// 1 -> chủ nhật
		// 2 -> thứ 2
		// 7 -> thứ 7
		String[] weekDayAsString = { "Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy" };
		String weekday = weekDayAsString[dow - 1];
		System.out.println("weekday: " + weekday);

		// Kiểm tra năm hiện tại có phải năm nhuần không
		int currentYear = Year.now().getValue();
		// Calendar(parent), GregorianCalendar();
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLeapYear: " + gc.isLeapYear(currentYear));

		// Ngày đầu tiên trong tuần hiện tại là ngày mấy
		// ==> In ra danh sách các ngày trong tuần hiện tại
		Calendar cInVn = Calendar.getInstance(new Locale("vi", "VN"));
		cInVn.set(Calendar.DAY_OF_MONTH, 29);

		Calendar cfodw = getDayOfFdow(cInVn);

		System.out.println("d/M/Y --> " + cfodw.get(Calendar.DAY_OF_MONTH) + "/" + (cfodw.get(Calendar.MONTH) + 1) + "/"
				+ cfodw.get(Calendar.YEAR));
		System.out.println("--crrent week days--");
		printCurrentWeekDay(cInVn);
		// Enumeration, design pattern

	}

	private static void printTzIds() {
		System.out.println("TimeZone Ids...");
		System.out.println("------------------------");
		String[] tzIds = TimeZone.getAvailableIDs();
		for (String tzid : tzIds) {
			System.out.println(tzid);
		}
	}

	private static Calendar getDayOfFdow(Calendar c) {
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

	// 01.01.2023
	private static void printCurrentWeekDay(Calendar c) {
		// B1: tìm ngày đầu tuần --> 26/12/2022
		Calendar start = getDayOfFdow(c);

		// B2: tìm ngày cuối tuần
		Calendar end = Calendar.getInstance();
		end.setTimeInMillis(start.getTimeInMillis());
		end.add(Calendar.WEEK_OF_YEAR, 1);
		for (Calendar running = start; running.before(end); running.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("d/M/Y --> " + running.get(Calendar.DAY_OF_MONTH) + "/"
					+ (running.get(Calendar.MONTH) + 1) + "/" + running.get(Calendar.YEAR));
		}
	}

}
