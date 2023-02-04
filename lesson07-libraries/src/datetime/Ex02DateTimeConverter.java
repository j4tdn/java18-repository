package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02DateTimeConverter {
	// String - date - calendar
	// String --> date, calendar --> DateFormat ở lớp cha; SimpleDateFormat ở lớp con
	// date --> string, calendar --> 
	// calendar --> string, date
	public static void main(String[] args) {
		Date stringToDate = stringToDate("22.02.2001 07:00:00", "dd.MM.yyyy HH:mm:ss" );
		System.out.println("stringToDate: " + stringToDate);
	}
	
	/**
	 * Convert string to date
	 * 
	 * string given string convert to date
	 * E.g '22.02.2001', '22/02/2001', '2001-02-22'
	 * --> format dd.MM.yyyy, dd/MM/yyyy, yyyy-MM-dd
	 * 
	 * H: hour in day (clock 24)
	 * 
	 * m: minute
	 * s: second
	 */
	public static Date stringToDate(String string, String pattern) {
		// df là format require a string with pattern 
		// dùng df để convert từ string đến to java.util.Date
		// nếu pattern không phải dd/MM/yyyy --> throw exception
		DateFormat df = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = df.parse(string);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
}
