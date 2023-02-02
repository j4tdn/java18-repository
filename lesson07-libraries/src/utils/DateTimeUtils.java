package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtils {
	private DateTimeUtils() {
		
	}
	
	/**
	 * 
	 * @param c calendar
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
	
	public static String calendarToString(Calendar c, String pattern) {
		// B1 : Convert calendar to date
		Date date = calendarToDate(c);
		
		// B2 : Convert date to string with given pattern
		String string = dateToString(date, pattern);
		return string;
	}
	
	/**
	 * Convert date to string
	 * 
	 * @param date date to convert
	 * @param pattern pattern of return string
	 * @return converted string from date
	 */
	
	public static String dateToString(Date date, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		String string = df.format(date);
		return string;
	}
	
	public static Calendar dateToCalendar(Date date) {
		// B1: Get now as calendar
		Calendar c = Calendar.getInstance();
		
		// B2 : convert date to calendar [date/calendar is time in milliseconds from ET]	
		//  set time from date to calendar
		c.setTime(date);
		return c;
	}
	
	/**
	 * 
	 * @param string given string convert to date
	 * E.g '15.05.2023', '15/05/2023', '2024-08-28'
	 * --> format dd.MM.yyy
	 * d: day of month
	 * M : month
	 * y : year
	 * 
	 * H: hour in day (clock 24)
	 * m: minute
	 * s: second
	 */
	
	public static Date stringToDate(String string, String pattern) {
		// df --> format for a string with pattern dd/MM/yyy
		// using df --> convert from string (require pattern dd/MM/yyy HH:mm:ss) to java.util.Date
		// if pattern is not '...' --> throw exception
		DateFormat df = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = df.parse(string);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println(date + "is note");
		}
		return date;
	}
	
	/**
	 * Convert string to calendar
	 * 
	 * @param string string to convert
	 * @param pattern pattern
	 * @return converted calendar from string
	 * 
	 */
	
	public static Calendar stringToCalendar(String string, String pattern) {
		// B1 : convert string to date
		Date date = stringToDate(string, pattern);
		
		// B2 : convert date to calendar [date/calendar is time in milliseconds from ET]
		
		// 2.1 : Get current time
		Calendar c = Calendar.getInstance();
		
		// 2.2: set time from date to calendar
		c.setTime(date);
		return c;
	}
}
