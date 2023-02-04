package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	public static Calendar stringToCalendar(String string, String pattern) {
		Date date = stringToDate(string, pattern);
		Calendar cal = dateToCalendar(date);
		return cal;
	}

	public static Date stringToDate(String string, String pattern) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = df.parse(string);
		} catch (ParseException e) {
			System.out.println("'" + string + "'is not valid --> required pattern'" + pattern + "'");
		}
		return date;
	}

	public static Calendar dateToCalendar(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}
}
