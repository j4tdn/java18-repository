package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	
	private DateUtils() {
		
	}
	
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
	
	public static String dateToString(Date date, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		String string = df.format(date);
		return string;
	}
	
	public static String calendarToString(Calendar c, String pattern) {
		// B1: convert calendar to date 
		Date date = calendarToDate(c);
		
		// B2: convert date to string with given pattern
		String string = dateToString(date, pattern);
		return string;
	}

}
