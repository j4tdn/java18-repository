package datetime;

import java.time.Year;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex01DateTimeGetter {
	public static void main(String[] args) {
		// server --> setup --> UTC + 7 
		// sys-time --> sys-time of UTC + 7
		
		// epoch time --> standard base time : 01.01.1970 00:00:00
		// unix time --> base time --> add/subtract/duration time	
		
		long currentTimeInMs = System.currentTimeMillis();
		System.out.println("Current time in ms : " + currentTimeInMs);
		
		System.out.println("[timezone]");
		Date date = new Date(currentTimeInMs);
		System.out.println("date : " + date);
		
		// since JAVA 1.1
		// Calendar --> singleton(unique) at getting time
		Calendar c = Calendar.getInstance();
		System.out.println("c: " + c);
		
		c.set(Calendar.MONTH, Calendar.FEBRUARY);
		
		// Month --> 0 (Jan) -> 11 (December)
		// Sunday = 1 fdow = 1 (US, JP, CND) --> Locale(country, language)
		// default locale --> US
		System.out.println("default locale: " + Locale.getDefault());
		
		int year = c.get(Calendar.YEAR); // c.getYear()
		int month = c.get(Calendar.MONTH);
		
		c.set(Calendar.YEAR, 2020);
		
		int fdow = c.getFirstDayOfWeek();
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		
		System.out.println("fdow: " + fdow);
		System.out.println("days in Month : " + daysInMonth);
		System.out.println("days in Year : " + daysInYear);
		
		System.out.println("default time zone : " + TimeZone.getDefault());
		TimeZone blTz = TimeZone.getTimeZone("HST");
		Calendar cAtHst = Calendar.getInstance(blTz);
		System.out.println("cAtBerlin -->" + cAtHst);
		// printTzIds();
		
		// Thứ ngày, tuần/ngày trong tháng, năm
		int dow = cAtHst.get(Calendar.DAY_OF_WEEK);
		// System.out.println("Day of week : " + dow);
		String[] weekDayAsString = {"Chủ Nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy"};
		String weekday = weekDayAsString[dow-1];
		System.out.println("Day of week : " + weekday);
		
		// Kiểm tra năm nhuận
		int currentYear = Year.now().getValue();
		// Calendar(parent), GregorianCalendar
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLeapYear: " + gc.isLeapYear(2020));
		
		// Ngày đầu tiên trong tuần hiện tại là ngày mấy
		// ==> In ra danh sách các ngày trong tuần hiện tại
		System.out.println();
		
		Calendar cInVn = Calendar.getInstance(new Locale("vi", "VN"));
		System.out.println("fdow in VN : " + cInVn.getFirstDayOfWeek());
		System.out.println("Curent day: " + cInVn.get(Calendar.DAY_OF_MONTH));
		
		Calendar cfodw = getDayOfFdow(cInVn);
		System.out.println("Day of Fdow : " + cfodw.get(Calendar.DAY_OF_MONTH));
		
		
		
//		System.out.println("Day of current first day of week: " + result);
		
		System.out.println("--- Days of current week ---");
		printCurrentWeekDays(cInVn);
	}
	
	private static void printTzIds() {
		System.out.println("TimeZone Ids ....");
		System.out.println("-----------------");
		String[] tzIds = TimeZone.getAvailableIDs();
		for(String tzId : tzIds) {
			System.out.println(tzId);
		}
	}
	
	private static Calendar getDayOfFdow(Calendar c) {
		Calendar cr = Calendar.getInstance();
		cr.setTimeInMillis(c.getTimeInMillis());
		int dow = cr.get(Calendar.DAY_OF_WEEK);
		int fdow = cr.getFirstDayOfWeek();
		cr.add(Calendar.DAY_OF_MONTH, fdow - dow);
		if(dow == Calendar.SUNDAY) {
			cr.add(Calendar.WEEK_OF_YEAR, -1);
		}
		return cr;
	}
	
	private static void printCurrentWeekDays(Calendar c) {
		// B1 : tim duoc fdow
		Calendar start = getDayOfFdow(c);
		Calendar end = Calendar.getInstance();
		end.setTimeInMillis(start.getTimeInMillis());
		end.add(Calendar.WEEK_OF_YEAR, 1);
		for(Calendar running = start; running.before(end); running.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("DD/MM/YY --> " + running.get(Calendar.DAY_OF_MONTH) 
			+ "/" + (running.get(Calendar.MONTH)+1) + "/" + running.get(Calendar.YEAR));
		}
	}
}
