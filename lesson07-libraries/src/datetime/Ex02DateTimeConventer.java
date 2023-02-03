package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex02DateTimeConventer {
	public static void main(String[] args) {
		Date stringToDate = stringToDate(" 10.01.2023 19:30:12", "dd.MM.yyyy HH:mm:ss");
		System.out.println("1. stringToDate --> " + stringToDate);
		
		Calendar stringToCalendar = stringToCalendar(" 10/01/2023", "dd/MM//yyyy");
		System.out.println("2. stringToCalendar --> " + stringToCalendar);
		
		Date calendarToDate = calendarToDate(Calendar.getInstance(TimeZone.getTimeZone("Europe/Berlin")));
		System.out.println("5. calendartoDate --> " + calendarToDate);
		
		String calendarToString = calendarToString(Calendar.getInstance(), "dd/MM/yyyy 'Week' w ', DayOfWeek' u");
		System.out.println("6. calendarToString --> " + calendarToString);
	}
	
	public static Date stringToDate(String string, String pattern) {
		//using df --> convert from string(require pattern dd/MM/yy HH:mm:ss) to java.util.Date
		// if pattern is not correct --> throw exception
		
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
	 * @param string string to convert
	 * @param pattern pattern
	 * @return converted calendar from string
	 * 
	 * 
	 */
	
	public static Calendar stringToCalendar(String string, String pattern) {
		//B1: Convert String to Date
		
		Date date = stringToDate(string, pattern);
		
		//B2: Convert date to calendar [date/calendar is time in milliseconds from ET]
		
		//2.1: get current time
		Calendar c = Calendar.getInstance();
		
		//2.2: Set time from date to calendar
		c.setTime(date);
		
		return c;
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
	
	/**
	 * Convert date to calendar
	 * 
	 * @param date date to convert
	 * @return converted calendar from date
	 */
	
	public static Calendar dateToCalendar(Date date) {
		//B1: get now as calendar
		Calendar c = Calendar.getInstance();
		
		//B2 Set time(ms) in date to calendar
		//calendar(timeInms) = date(timeInms)
		c.setTime(date);
		return c;
	}
	
	public static String calendarToString(Calendar c, String pattern) {
		//B1: Convert calendar to date
		Date date = calendarToDate(c);
		
		//B2 Convert date to string with given pattern
		String string = dateToString(date, pattern);
		return string;
	}
	
	
	
	public static Date calendarToDate(Calendar c) {
		
		// Date not not support timezone --> 
		
		Date dateNoTz = c.getTime();
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		df.setTimeZone(c.getTimeZone());
		String stringTz = df.format(dateNoTz);
		
		Date dateTz = stringToDate(stringTz, "dd/MM/yyyy HH:mm:ss");
		
		return dateTz;
	}
}
