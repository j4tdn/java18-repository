package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex02DateTimeConverter {
	// string - date - calendar [date/calendar --> day, month, year, hour, minute, second]
	// date/calendar(milliseconds from epoch time)
	
	// string   --> date  --> calendar    --> DateFormat, SimpleDateFormat
	
	// date     --> string
	// date     --> calendar
	
	// calendar --> date --> string
	public static void main(String[] args) {
		Date stringToDate = stringToDate("10.01.2023 19:26:40", "dd.MM.yyyy HH:mm:ss");
		System.out.println("1. stringToDate --> " + stringToDate);
		
		Calendar stringToCalendar = stringToCalendar("08/01/2023", "dd/MM/yyyy");
		System.out.println("2. stringToCalendar --> " + stringToCalendar);
		
		String dateToString = dateToString(new Date(), "yyyy-MM-dd hh:mm a");
		System.out.println("3. dateToString --> " + dateToString);
		
		Calendar dateToCalendar = dateToCalendar(new Date(56899644526l));
		System.out.println("4. dateToCalendar --> " + dateToCalendar);
		
		Date calendarToDate = calendarToDate(Calendar.getInstance(TimeZone.getTimeZone("Europe/Berlin")));
		System.out.println("5. calendarToDate --> " + calendarToDate);
		
		String calendarToString = calendarToString(Calendar.getInstance(), 
				"dd/MM/YYYY 'Week' w ', DayOfWeek' u");
		System.out.println("6. calendarToString --> " + calendarToString);
	}
	
	public static String calendarToString(Calendar c, String pattern) {
		// B1: Convert calendar to date
		Date date = calendarToDate(c);
		
		// B2: Convert date to string with given pattern
		String string = dateToString(date, pattern);
		return string;
	}
	
	/**
	 * Convert calendar to date
	 *
	 * @param calendar
	 * @return converted date
	 */
	public static Date calendarToDate(Calendar c) {
		// Date not support timezone --> incorrect hour by timezone when
		// convert calendar to date
		
		// Fix --> calendar --> date(correct day, incorrect time) 
		// --> string(dateformat) --> date(dateformat, timezone)
		
		Date dateNoTz = c.getTime();
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		df.setTimeZone(c.getTimeZone());
		String stringTz = df.format(dateNoTz);
		
		Date dateTz = stringToDate(stringTz, "dd/MM/yyyy HH:mm:ss");
		
		return dateTz;
	}
	
	/**
	 * Convert string to date.
	 * 
	 * @param date    date to convert
	 * @param pattern pattern
	 * @return converted string from date
	 */
	public static String dateToString(Date date, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		String string = df.format(date);
		return string;
	}
	
	/**
	 * Convert date to calendar
	 * 
	 * @param date    date to convert
	 * @return converted calendar from date
	 */
	public static Calendar dateToCalendar(Date date) {
		// B1: Get now as calendar
		Calendar c = Calendar.getInstance();
		
		// B2: Set time(ms) in date to calendar
		// calendar(timeInms) = date(timeInMs)
		c.setTime(date);
		
		return c;
	}
	
	/**
	 * Convert string to date
	 * 
	 * @param string given string convert to date
	 * E.g '15.05.2023', '15/05/2023', '2024-08-28'
	 * --> format dd.MM.yyyy, dd/MM/yyyy, yyyy-MM-dd
	 * d: day of month
	 * M: month
	 * y: year
	 * 
	 * H: hour in day (clock 24)
	 * m: minute
	 * s: second
	 * 
	 * E.g: pattern: dd/MM/yyyy HH:mm:ss
	 */
	public static Date stringToDate(String string, String pattern) {
		// using df --> convert from string(require pattern  dd/MM/yyyy HH:mm:ss) to java.util.Date
		// if pattern is not ' dd/MM/yyyy HH:mm:ss' --> throw exception
		DateFormat df = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = df.parse(string);
		} catch (ParseException e) {
			System.out.println("'" + string + "' is not valid --> required pattern '" + pattern + "'");
		}
		return date;
	}
	
	/**
	 * Convert string to calendar
	 * 
	 * @param string  string to convert
	 * @param pattern pattern
	 * @return converted calendar from string
	 */
	public static Calendar stringToCalendar(String string, String pattern) {
		// B1: Convert string to date
		Date date = stringToDate(string, pattern);
		
		// B2: Convert date to calendar [date/calendar is time in milliseconds from ET]
		Calendar c = dateToCalendar(date);
		
		return c;
	}
}
