package datetime;

import java.time.Year;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import javax.print.CancelablePrintJob;

/**
 Ex01: 
    + 0. Lấy thông tin thời gian hiện tại với [timezone]
	+ 1. Ngày, Tháng, Năm
	+ 2. Giờ 12-24, Phút, Giây
	+ 3. Thứ ngày, tuần/ngày trong tháng, năm
    + 4. Đếm số ngày tháng, năm hiện tại >> Calendar
	+ 5. Kiểm tra năm hiện tại có phải năm nhuận không
	+ 6. Ngày đầu tiên trong tuần là thứ mấy với locale
        + 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
        ==> In ra danh sách các ngày trong tuần hiện tại   
=>>> Epoch time
 */
public class Ex01DateTimeGetter {
	public static void main(String[] args) {
		// server --> setup --> UTC+7 --> 
		// sys-time --> sys-time of UTC+7
		// select country/timezone --> sys-time at selection timezone
		
		// epoch time --> standard base time: 01.01.1970 00:00:00
		// unix time --> base time --> add/subtract/duration time
		long currentTimeInMs = System.currentTimeMillis();
		System.out.println("Current time in ms: " + currentTimeInMs);
		
		System.out.println("0. Lấy thông tin thời gian hiện tại với [timezone]");
		// Date date = new Date();
		Date date = new Date(currentTimeInMs);
		System.out.println("date: " + date);
		
		Locale.setDefault(new Locale("vi", "VN"));
		
		// Since JAVA 1.1
		// Calendar --> singleton(unique) at getting time
		Calendar c = Calendar.getInstance();
		System.out.println("c: " + c);
		
		c.set(Calendar.MONTH, Calendar.FEBRUARY);
		
		// MONTH --> 0(Jan) -> 11(Dec)
		
		// SUNDAY=1 fdow=1(US, JP, CND) ---> Locale(country, language)
		// default locale --> US
		System.out.println("default locale: " + Locale.getDefault());
		
		// java.util.GregorianCalendar[time=1672840666119,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Bangkok",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=4,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=57,SECOND=46,MILLISECOND=119,ZONE_OFFSET=25200000,DST_OFFSET=0]
	
		// YEAR=2023, MONTH=0 --> too many attributes
		int year = c.get(Calendar.YEAR); // c.getYear()
		int month = c.get(Calendar.MONTH) + 1; // c.getMonth();
		System.out.println("month/year: " + month + "/" + year);
		
		// dayOfMonth, dayOfYear, weekOfYear
		// int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		// int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		// int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		
		c.set(Calendar.YEAR, 2020);
		
		// special fields, functions
		// first day of week, day(s) in month/year
		int fdow = c.getFirstDayOfWeek();
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		
		System.out.println("fdow: " + fdow);
		System.out.println("daysInMonth: " + daysInMonth);
		System.out.println("daysInYear: " + daysInYear);
		
		System.out.println("\n//////////////////////////////////\n");
		
		/*
		 + 0. Lấy thông tin thời gian hiện tại với [timezone]
		 + 1. Ngày, Tháng, Năm
		 + 2. Giờ 12-24, Phút, Giây
		 + 3. Thứ ngày, tuần/ngày trong tháng, năm
	     + 4. Đếm số ngày tháng, năm hiện tại >> Calendar
		 + 5. Kiểm tra năm hiện tại có phải năm nhuận không
		 + 6. Ngày đầu tiên trong tuần là thứ mấy với locale
         + 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
         ==> In ra danh sách các ngày trong tuần hiện tại  
		 */
		System.out.println("default time zone: " + TimeZone.getDefault());
		TimeZone hstTz = TimeZone.getTimeZone("HST");
		Calendar cAtHst = Calendar.getInstance(hstTz);
		System.out.println("cAtHst --> " + cAtHst);
		// printTzIds();
		
		// + 3. Thứ ngày, tuần/ngày trong tháng, năm
		// --> Thứ Hai --> Chủ Nhật
		int dow = cAtHst.get(Calendar.DAY_OF_WEEK);
		System.out.println("dow: " + dow);
		// 1-> Chủ Nhật
		// 2-> Thứ Hai
		// 3-> Thứ Ba
		// 7-> Thứ Bảy
		String[] weekDayAsString = {"Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy"};
		String weekday = weekDayAsString[dow-1];
		System.out.println("weekday: " + weekday);
		
		// + 5. Kiểm tra năm hiện tại có phải năm nhuận không
		int currentYear = Year.now().getValue();
		// Calendar(parent), GregorianCalendar
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLeapYear: " + gc.isLeapYear(currentYear));
		
		// + 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
        // ==> In ra danh sách các ngày trong tuần hiện tại 
		Calendar cInVn = Calendar.getInstance(new Locale("vi", "VN"));
		cInVn.set(Calendar.DAY_OF_MONTH, 1);
		
		Calendar cfodw = getDayOfFdow(cInVn);
		System.out.println("D/M/Y --> " + cfodw.get(Calendar.DAY_OF_MONTH)
				+ "/" + (cfodw.get(Calendar.MONTH) + 1)
				+ "/" + cfodw.get(Calendar.YEAR));
		
		System.out.println("-- Current week days --");
		printCurrentWeekDays(cInVn);
		
		// Enumeration, design pattern
		
		printTzIds();
	}
	
	// 01.01.2023
	private static void printCurrentWeekDays(Calendar c) {
		// B1: Tìm ngày đầu tuần --> 26.12.2022
		Calendar start = getDayOfFdow(c);
		
		// B2: Tìm ngày cuối tuần
		Calendar end = Calendar.getInstance();
		end.setTimeInMillis(start.getTimeInMillis());
		end.add(Calendar.WEEK_OF_YEAR, 1);
		
		for(Calendar running = start; 
				running.before(end); 
					running.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("D/M/Y --> " 
					+ running.get(Calendar.DAY_OF_MONTH)
					+ "/" + (running.get(Calendar.MONTH) + 1)
					+ "/" + running.get(Calendar.YEAR));
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
	
	private static void printTzIds() {
		System.out.println("TimeZone Ids ....");
		System.out.println("----------------------");
		String[] tzIds = TimeZone.getAvailableIDs();
		for (String tzId: tzIds) {
			System.out.println(tzId);
		}
	}
}
