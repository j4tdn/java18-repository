package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * String - Date - Calendar
 * String   --> Date --> Calendar   --> DateFormat, SimpleDateFormat
 * Date     --> String
 * Date     --> Calendar
 * Calendar --> Date --> String
 * 
 * DateFormat df = new SimpleDateFormat(pattern);
 * + String --> Date   => date = df.parse(string);
 * + Date   --> String => string = df.format(date);
 */

public class EX02DateTimeConverter {
	public static void main(String[] args) {
		Date stringToDate = stringToDate("10/01/2023 19:26:40", "dd/MM/yyyy HH:mm:ss");
		System.out.println("1. stringToDate --> " + stringToDate);
		
		Calendar stringToCalendar = stringToCalendar("08/01/2023", "dd/MM/yyyy");
		System.out.println("2. stringToCalendar --> " + stringToCalendar);
		
		String dateToString = dateToString(new Date(), "yyyy-MM-dd hh:mm a");
		System.out.println("3. dateToString --> " + dateToString);
		
		Calendar dateToCalendar = dateToCalendar(new Date(21051997));
		System.out.println("4. dateToCalendar --> " + dateToCalendar);
		
		TimeZone tz = TimeZone.getTimeZone("Europe/Berlin");
		Date calendarToDate = calendarToDate(Calendar.getInstance(tz));
		System.out.println("5. calendarToDate --> " + calendarToDate);
		
		String calendarToString = calendarToString(Calendar.getInstance(), "dd/MM/YYYY 'week' w ', DayOfWeek' u");
		System.out.println("6. calendarToString --> " + calendarToString);
	}
	
	/**
	 * Convert String to Date
	 * @param string --> given string convert to date
	 * E.g '15.05.2023', '15/05/2023', '2023-08-28'
	 * --> format dd.MM.yyyy, dd/MM/yyyy, yyyy-MM-dd
	 * d: day of month 
	 * M: month 
	 * y: year
	 * 
	 * H: hour in day (clock 24)
	 * m: minute
	 * s: second
	 * 
	 * using df --> convert from string (require pattern) to java.util.Date
	 * if pattern is not "dd/MM/yyyy HH:mm:ss" --> throw Exception
	 */
	
	public static Date stringToDate(String string, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = df.parse(string);
		} catch (ParseException e) {
			System.out.println("'" + string + "'is not valid --> required pattern'" + pattern + "'");
		}
		return date;
	}
	
	/**
	 * Convert string to calendar
	 * @param string --> string to convert
	 * @param pattern --> pattern
	 * @return converted calendar from string 
	 */
	public static Calendar stringToCalendar(String string, String pattern) {
		// B1: Convert String to Date
		Date date = stringToDate(string, pattern);
		
		// B2: convert Date to Calendar [Date/Calendar is time in milliseconds from Epoch Time]
		Calendar c = dateToCalendar(date);
		
		return c;
	}
	/**
	 * Convert Date to String
	 * @param date: date to convert
	 * @param pattern: pattern of return String
	 * @return converted String from Date
	 */
	public static String dateToString(Date date, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		String string = df.format(date);
		return string;
	}
	
	/**
	 * Convert Date to Calendar
	 * @param date: date to convert
	 * @return converted Calendar from Date
	 */
	public static Calendar dateToCalendar(Date date) {
		// B1: get now as calendar
		Calendar c = Calendar.getInstance();

		// B2: Set time (ms) in date to calendar
		// calendar (timeInMs) = date(timeInMs)
		c.setTime(date);
		return c;

	}
	
	/**
	 * Convert calendar to date
	 * @param calendar
	 * @return converted date
	 */
	public static Date calendarToDate(Calendar c) {
		// Date not support timeZone --> incorrect hour by timezone when convert calendar to date
		// Fix => calendar --> date(correct day, in correct time) 
		// --> String(dateformat) --> Date(dateformat, timezone)
		
		Date dateNoTz = c.getTime();

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		df.setTimeZone(c.getTimeZone());
		String stringTz = df.format(dateNoTz);
		
		Date dateTz = stringToDate(stringTz, "dd/MM/yyyy HH:mm:ss");

		return dateTz;
	}
	
	public static String calendarToString(Calendar c, String pattern) {
		// B1: convert calendar to date 
		Date date = calendarToDate(c);
		
		// B2: convert date to string with given pattern
		String string = dateToString(date, pattern);
		return string;
	}

}
