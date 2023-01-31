package datetime;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/*
 * 0. Lấy thông tin thời gian hiện tại với [timezone]
 * 1. Day, Month, Year
 * 2. Hour, minute, second	
 * 3. Thứ ngày, tuần/ ngày trong tháng năm
 * 4. Đếm số ngày tháng, năm hiện tại
 * 5. Kiểm tra có phải năm nhuận không
 * 6. Ngày đầu tiên trong tuần là thứ mấy với locate
 * 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
 * ==> in ra danh sách các ngày trong tuần hiện tại
 */
public class Ex01DateTimeGetter {
	public static void main(String[] args) {
		// epoch time --> standard base time : 01.01.1970 00:00:00
		// unix time --> base time --> add/subtract/duration time
		long currentTimeInMS = System.currentTimeMillis();
		System.out.println("Current Time in MS: " + currentTimeInMS);

		System.out.println("0. Lấy thông tin thời gian hiện tại với [timezone]");
		Date date = new Date();
		System.out.println("--> date: " + date);

		// set default locale
		Locale.setDefault(new Locale("vi", "VN"));

		// Since Java11
		// Calender --> singleton at getting time
		Calendar c = Calendar.getInstance();
		System.out.println("calender: " + c);
		c.set(Calendar.MONDAY, Calendar.FEBRUARY);

		// default locale --> US
		System.out.println("default locale: " + Locale.getDefault());

		// calender:
		// java.util.GregorianCalendar[time=1673020156511,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="GMT+07:00",offset=25200000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=6,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=49,SECOND=16,MILLISECOND=511,ZONE_OFFSET=25200000,DST_OFFSET=0]
		// default locale: vi_VN
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println("month/year: " + month + "/" + year);// c.getYEAR()

		// dayOfMonth, dayOYear, weekOfYear
		int dom = c.get(Calendar.DAY_OF_MONTH);
		int doy = c.get(Calendar.DAY_OF_YEAR);
		int woy = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println(dom + "-" + doy + "-" + woy);

		// special field, function
		// first day of week, day(s) in month/year
		int fdow = c.getFirstDayOfWeek();
		int dim = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int diy = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(dim);
		System.out.println(diy);
		// 2.Hour, minute, second
		TimeZone tz = TimeZone.getTimeZone("HST");
		Calendar cAt = Calendar.getInstance(tz);
		System.out.println("cAtist: " + cAt);
		// printTzIds();

		// 3. Thứ ngày, tuần/ngày trong tháng năm
		int dow = cAt.get(Calendar.DAY_OF_WEEK);
		System.out.println("dow: " + dow);
		String[] weekDayStrings = { "Chủ nhật", "Thứ 2", "Thứ 3", "Thứ 4", "Thứ 5", "Thứ 6", "Thứ 7" };
		System.out.println(weekDayStrings[dow - 1]);
		// 5. Kiểm tra có phải năm nhuận không
		int currentYear = Year.now().getValue();
		// Calendar(parent),
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.isLeapYear(currentYear));

		// 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
		Calendar cInVn = Calendar.getInstance(new Locale("vi", "VN"));
		cInVn.set(Calendar.DAY_OF_MONTH, 1);
		Calendar cfdowCalendar = getDayOfFdow(cInVn);

		// 8. In ra các ngày trong tuần
		printCurrentWeekDays(cInVn);
	}

	private static void printTzIds() {
		System.out.println("Timezone Ids");
		System.out.println("-----------------------------");
		String[] tzIds = TimeZone.getAvailableIDs();
		for (String tzId : tzIds) {
			System.out.println(tzId);
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

	private static void printCurrentWeekDays(Calendar c) {
		//b1: tìm ngày đầu tiên của tuần
		Calendar start = getDayOfFdow(c);
		
		//B2; Tìm ngày cuối tuàn
		Calendar end = Calendar.getInstance();
		end.setTimeInMillis(start.getTimeInMillis());
		end.add(Calendar.WEEK_OF_YEAR, 1);

		for (Calendar running = start; running.before(end); running.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("D/M/Y --> " + running.get(Calendar.DAY_OF_MONTH) + "/"
					+ (running.get(Calendar.MONTH) + 1) + "/" + running.get(Calendar.YEAR));
		}
	}
}
