package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;

public class Ex02DateTImeConverter {
	// string - date - calendar
	// string --> date, calendar
	// date --> string, calendar
	// calendar --> string, date
	
	public static void main(String[] args) {
		Date stringToDate = stringtoDate("10.01.2023 19:26:40", "dd.MM.yyy HH:mm:ss");
		System.out.println("1. stringToDate --> " + stringToDate);
		
		Calendar stringToCalendar = stringToCalendar("08/01/2023", "dd/MM/yyyy");
		System.out.println("2. stringToCalendar --> " + stringToCalendar);
		
		String dateToString = dateToString(new Date(), "yyyy-MM-dd hh:mm a");
		System.out.println("3. dateTOString --> " + dateToString);
		
		Calendar dateToCalendar = datetoCalendar(new Date(568996445));
		System.out.println("4. dateToCalendar --> " + dateToCalendar);
	}
	
	
	
	/**
	 * Convert string to date
	 * 
	 * @param date date to convert
	 * @param pattern pattern
	 * @return converted string from date
	 */
	public static String dateToString(Date date,String pattern ) {
		DateFormat df = new SimpleDateFormat(pattern);
		String string = df.format(date);
		return string;
	}
	
	public static Calendar datetoCalendar(Date date) {
		// B1: Get now 
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}
	
	/**
	 * Convert string to date
	 * 
	 * string given convert to date
	 * E.g '15.05.2023', '15/05/2023', '2023-05-15'
	 * --> format dd.MM.yyy, dd/MM/yyyy, yyyy-MM-dd
	 * d: day of month
	 * 
	 * 
	 */
	
	public static Date stringtoDate(String string, String pattern) {
		// using df --> convert from string ( require pattern dd/MM/yyy HH:mm:ss) to java.util.Dtae
		// if pattern is not 'dd/MM/yyy HH:mm:ss' --> throw exception
		DateFormat df = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = df.parse(string);
		} catch (ParseException e) {
			System.out.println("," + string + "' is not valid --> required pattern '" + pattern + "'");
		}
		return date;
	}
	/**
	 * 
	 * @param string
	 * @param pattern
	 * @return
	 */
	public static Calendar stringToCalendar(String string, String pattern) {
		//B1: Convert string to date
		Date date = stringtoDate(string, pattern);
		
		//B2: Convert date to calendar [date/aclendar is time in milliseconds
		Calendar c = Calendar.getInstance();
		
		c.setTime(date);
		return c;
	}

}
