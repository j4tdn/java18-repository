package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex02DateTimeConverter {
	//String - Date - Calender
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Hãy nhập ngày đúng form: ");
//		String date = sc.nextLine();
		String date = "31/01/2023";
		String pattern = "dd/MM/yyyy";
		System.out.println("StringTODate --> "+StringToDate(date,pattern));
		System.out.println("StringToCalendar --> "+StringToCalender(date, pattern));
		
 	}
	/*
	 * Convert string to date 
	 * 
	 * @param string given string convert to date
	 * E.g: '15.05.2023', '15/05/2023'
	 * -->format dd/MM/yyyy : patern trong lớp con SimpleDateFormat	
	 * d: day of month
	 * M: month
	 * y: year
	 * 
	 * H: hour
	 * m: minute
	 * s: second
	 */
	public static Date StringToDate(String string, String pattern) {
		//using df --> convert from string (with pattern dd//MM/yyyy) to java.util.Date
		//if pattern is not 'dd/MM/yyyy' throw exception
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
	 * 
	 * @param string string to convert
	 * @param pattern patern
	 * @return convert string to calender
	 */
	public static Calendar StringToCalender(String string, String pattern) {
		//B1: Convert to date
		Date date = StringToDate(string, pattern);
		//B2: Convert to calender
		//2.1: get current time
		Calendar c = Calendar.getInstance();
		//2.2: set time from date to calender
		c.setTime(date);
		return c;
	}
}
