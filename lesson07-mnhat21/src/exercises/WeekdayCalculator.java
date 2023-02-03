package exercises;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import utils.DateTimeUtils;

public class WeekdayCalculator {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String date = "";
		do {
			System.out.print("Input date (dd/MM/yyyy) : ");
			date = ip.nextLine();
		} while(isValidFormat(date) == false);
		
		Calendar dCal = DateTimeUtils.stringToCalendar(date, "dd/MM/yyyy");
		// System.out.println(dCal);
		
		String daysInWeek[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		String monthsInYear[] = {"January", "February", "March", "April", "May", "June", 
				"July", "August", "September", "October", "November", "December"};
		
		// Print
		System.out.println(dCal.get(Calendar.DAY_OF_MONTH) + " " + monthsInYear[dCal.get(Calendar.MONTH)] 
				+ " " + dCal.get(Calendar.YEAR) + " is " + daysInWeek[dCal.get(Calendar.DAY_OF_WEEK)-1]);
		System.out.println("Additional Fact : ");
		System.out.println("- It is day " + dCal.get(Calendar.DAY_OF_YEAR) + " of Year, there re "
				+ (dCal.getActualMaximum(Calendar.DAY_OF_YEAR) - dCal.get(Calendar.DAY_OF_YEAR) + " days left"));
		System.out.println("- It is " + daysInWeek[dCal.get(Calendar.DAY_OF_WEEK)-1] + " number " 
				+ dCal.get(Calendar.DAY_OF_WEEK_IN_MONTH) + " in " + monthsInYear[dCal.get(Calendar.MONTH)] 
						+ " " + dCal.get(Calendar.YEAR));
		System.out.println("- It is day " + daysInWeek[dCal.get(Calendar.DAY_OF_WEEK)-1] + " number " 
				+ (int)Math.ceil(dCal.get(Calendar.DAY_OF_YEAR)/7.0) + " in " + dCal.get(Calendar.YEAR));
		System.out.println("- Year " + dCal.get(Calendar.YEAR) + " has " + dCal.getActualMaximum(Calendar.DAY_OF_YEAR) + " days");
		System.out.println("- " + monthsInYear[dCal.get(Calendar.MONTH)] 
				+ " " + dCal.get(Calendar.YEAR) + " has " + dCal.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
	
	}
	
	public static boolean isValidFormat(String string) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = df.parse(string);
		} catch (ParseException e) {
			// TODO: handle exception
			System.out.println("Date is not valid");
			return false;
		}
		return true;
	}
}
