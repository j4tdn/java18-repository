package datetime;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex02DateTimeconverter {
	
	// string --> date --> calendar
	
	
	
	// string --> date , calendar --> Dateformat, simpledateformate
	public static void main(String[] args) {
		Date stringToDate = stringToDate("10.01.2023 19:24:56","dd.MM.yyyy HH:mm:ss");
		System.out.println("1. stringToDate --> " + stringToDate);
		
		Calendar stringToCalendar = stringToCalendar("08/01/2023","dd/MM/yyyy");
		System.out.println("2. stringtocalendar --> " + stringToCalendar);
		
		String dateToString = dateToString(new Date(),"yyyy-MM-dd hh:mm:a");
		System.out.println("3. dateToString --> " + dateToString);
		
		Calendar dateCalendar = dateToCalendar(new Date(728364671));
		System.out.println("4. datetocalender --> " + dateToString);
		
		Date calendarToDate = calendarToDate(Calendar.getInstance());
		System.out.println("5. calendarToDate --> " + calendarToDate);
			
		
	}
	/**
	 * 
	 * @param date
	 * @param pattern
	 * @return converted string from date
	 */
	
	public static String dateToString(Date date,String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		String string = df.format(date);
		return string;
	}
	/**
	 * Convert string to date
	 * 
	 * @param string
	 * Eg
	 * '15.05.2023','15/05/2023'
	 * --> format dd.MM.yyyy, dd/MM/yyyy
	 * d: day
	 * M: month
	 * 
	 * H: hour in day( clock 24)
	 * m: minute
	 * s: second
	 * 
	 * pattern : dd/MM/yyyy HH:mm:ss
	 */
	public static Date stringToDate(String string,String pattern ) {
		// using df --> converter from string
		// if pattern is not throw exception
		DateFormat df = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date =  df.parse(string);
		} catch (ParseException e) {
			System.out.println("'" + string + "'" + "is not valid" + pattern); 
		}
		return date;
	}
	public static Calendar stringToCalendar(String string, String pattern) {
		// B1: convert string to date
		Date date = stringToDate(string , pattern);
		// B2: Convert date to calendar
		// 2.1 : get current time
		Calendar c= Calendar.getInstance();
		// 2.2 : concert date --> calendar
		c.setTime(date);
		return c;
	}
	public static Calendar dateToCalendar(Date date) {
		// B1 : Get now as calendar
		Calendar c = Calendar.getInstance();
		// B2 : Set time(ms)
		c.setTime(date);
		return c;
	}
	public static String calendarToString(Calendar c , String pattern) {
		//B1: Convert calendar to date
		Date date = calendarToDate(c);
		String string =dateToString(date , pattern);
		return string;
	}
	
	public static Date calendarToDate(Calendar c) {
		Date date = c.getTime();
		return date;
	}
	
}
