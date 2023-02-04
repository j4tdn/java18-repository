package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02DateTimeConverter {
	// string - date - calendar [
	
	// string   --> date, calendar 		--> DateFormat, SimpleDateFormat 
	// date	    --> string, calendar
	// calendar --> string, date
	public static void main(String[] args) {
		System.out.println("1. String to date: " + stringToDate("10/01/2023 20:50:22", "dd/MM/yyyy HH:mm:ss"));
		System.out.println("2. String to calendar: " + stringToCalendar("8/01/2023 19:50:22", "dd/MM/yyyy HH:mm:ss"));
		System.out.println("3. dateToString --> " + dateToString(new Date(), "dd/MM/yyyy HH:mm:ss"));
		System.out.println("4. dateToCalendar --> " + dateToCalendar(new Date(5466456)));
		System.out.println("5. calendarToDate" + calendarToDate(null));
		
		System.out.println("6. calendarToSting --> " + calendarToString(Calendar.getInstance(), "dd/MM/yyyy HH:mm:ss"));
	}
	
	public static String calendarToString(Calendar c, String pattern) {
		Date date = calendarToDate(c);
		
		String string = dateToString(date, pattern);
		return string;
	}
	
	public static Date calendarToDate(Calendar c) {
		Date dateNoTz = c.getTime();
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		df.setTimeZone(c.getTimeZone());
		String stringTz = df.format(dateNoTz);
		
		Date dateTz = stringToDate(stringTz, "dd/MM/yyyy HH:mm:ss");
		
		return dateTz;
	}
	
	/**
	 * Convert date to string
	 * @param date date to convert
	 * @param pattern of return string
	 * @return converted string 
	 */
	public static String dateToString(Date date, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		String string = df.format(date);
		return string;
	}
	
	public static Calendar dateToCalendar(Date date) {
		// B1: Get now as calendar
		Calendar c = Calendar.getInstance();
		
		// B2: set time(ms) in date to calendar
		// calendar(timeInms) = date(timeInMs)
		c.setTime(date);
		
		return c;
	}
	
	/**
	 * Convert string to date
	 * 
	 * @param string given string convert to date
	 * E.g '15.05.2023', '15/5/2023', '2024-08-28'
	 * --> format dd.MM.yyyy, format dd/MM/yyyy,...
	 * d: day of month
	 * M: month of year
	 * y: year
	 * 
	 * H: hour in day (clock 24)
	 * m: minute
	 * s: second
	 * 
	 * pattern: dd/MM/yyyy HH:mm:ss
	 */
	public static Date stringToDate(String string, String pattern) {
		// df --> require for a string with pattern dd/MM/yyyy
		// using df --> convert from string(with pattern dd/MM/yyyy) to java.util.date
		// if pattern is not format --> throw exeption
		DateFormat df = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = df.parse(string);
		} catch (Exception e) {
			System.out.println("'" + string + "' is not valid --> require pattern '" + pattern + "'");
		}
		
		return date;
	}
	
	public static Calendar stringToCalendar(String string, String pattern) {
		// B1: convert string to date
		Date date = stringToDate(string, pattern);
		
		// B2: convert date to calendar [date/calendar is time in milliseconds from ET]
		
		// 2.1: Get current time
		Calendar cal = Calendar.getInstance();
		
		//2.2 Set time from date to calendar
		cal.setTime(date);
		return cal;
	}
}
