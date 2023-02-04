package datetime;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
		TimeZone blTz = TimeZone.getTimeZone("HST");
		Calendar cAtHST = Calendar.getInstance(blTz);
		System.out.println("cAtBerlin --> " + cAtHST);
		// printTzids();

		// +3. Thứ ngày, tuần/ngày trong tháng, năm
		// --> Thứ Hai --> Chủ Nhật
		int dow = cAtHST.get(Calendar.DAY_OF_WEEK);
		System.out.println("dow: " + dow);
		// 1 -> chủ nhật
		// 2 --> thứ 2
		// ...
		String[] weekDayAsString = { "Chủ Nhật", "Thứ 2", "Thứ 3", "Thứ 4", "Thứ 5", "Thứ 6", "Thứ 7" };
		String weekday = weekDayAsString[dow - 1];
		System.out.println("weekday: " + weekday);

		// +5 Kiểm tra năm hiện tại có phải năm nhuận không
		int currentYear = Year.now().getValue();
		// Calendar(parent), GregorianCalendar
		GregorianCalendar gr = new GregorianCalendar();
		System.out.println("isLeapYear: " + gr.isLeapYear(currentYear));

		// +7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
		// ==> in ra danh sách ngày trong tuần hiện tại
		Locale.setDefault(new Locale("vi", "VN"));
		Calendar cInVn = Calendar.getInstance();
		cInVn.set(Calendar.DAY_OF_MONTH, 1);
		Calendar cfodw = getDayOfFdow(cInVn);

		System.out.println("d/m/y --> " + cfodw.get(Calendar.DAY_OF_MONTH) + "/" + (cfodw.get(Calendar.MONTH) + 1) + "/"
				+ cfodw.get(Calendar.YEAR));
		printCurrentWeekDays(cfodw);
	}

	private static void printCurrentWeekDays(Calendar c) {
		Calendar start = getDayOfFdow(c);

		Calendar end = Calendar.getInstance();
		end.setTimeInMillis(start.getTimeInMillis());
		end.add(Calendar.WEEK_OF_YEAR, 1);

		for (Calendar running = start; running.before(end); running.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("d/m/y --> " + running.get(Calendar.DAY_OF_MONTH) + "/"
					+ (running.get(Calendar.MONTH) + 1) + "/" + running.get(Calendar.YEAR));
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

	private static void printTzids() {
		System.out.println("TimeZone Ids .....");
		System.out.println("-----------------");
		String[] tzIds = TimeZone.getAvailableIDs();
		for (String tzId : tzIds) {
			System.out.println(tzId);
		}
	}

}