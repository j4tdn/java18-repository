package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateUtils {
	public DateUtils() {
		// TODO Auto-generated constructor stub
	}

	public static Date StringToDate(String string, String pattern) {
		// sử dụng df --> chuyển từ string (with pattern dd//MM/yyyy) to java.util.Date
		// Nếu pattern không phải 'dd/MM/yyyy' ném ngoại lệ
		DateFormat df = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = df.parse(string);
		} catch (ParseException e) {
			System.out.println(string + " is not formed");
		}
		return date;
	}
	
	/**
	 * Chuyển từ String sang Calendar
	 *
	 */
	public static Calendar StringToCalendar(String string, String pattern) {
		Date date = StringToDate(string, pattern);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}
	public static LocalDateTime stringToLocalDateTime(String string, DateTimeFormatter dtf) {
		LocalDateTime lDateTime = null;
		if (string != "") {
			try {
				lDateTime = LocalDateTime.parse(string, dtf);
			} catch (Exception e) {
				System.out.println(string + " is not formed");
			}
		}
		return lDateTime;
	}
	
	/**
	 * Chuyển từ date sang string
	 */
	public static String dateToString(Date date, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		String string = df.format(date);
		return string;
	}
	/**
	 * Convert date to Calendar
	 */
	public static Calendar dateToCalendar(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}
	
	/**
	 * Convert Calendar to date
	 */
	public static Date calenderToDate(Calendar c) {
		Date date = c.getTime();
		TimeZone tz = c.getTimeZone();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		df.setTimeZone(tz);
		String string = df.format(date);
		date = StringToDate(string, "dd/MM/yyyy HH:mm:ss");
		return date;
	}
	/**
	 * Convert calendar to string
	 */
	public static String calendarToString(Calendar c, String pattern) {
		Date date = calenderToDate(c);
		DateFormat df = new SimpleDateFormat(pattern);
		String string = df.format(date);
		return string;
	}
}