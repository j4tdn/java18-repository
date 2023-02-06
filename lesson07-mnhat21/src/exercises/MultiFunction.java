package exercises;

import java.util.Calendar;
import java.util.Scanner;

import utils.DateTimeUtils;

public class MultiFunction {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println("Now : " + DateTimeUtils.calendarToString(c, "dd/MM/yyyy HH:mm:ss"));
		System.out.println("Last day of Month : " + c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("First day of Current Week : " + getDayOfFdow(c).get(Calendar.DAY_OF_MONTH));
		System.out.println("Last day of Current Week : " + getDayOfLdow(c).get(Calendar.DAY_OF_MONTH));
		System.out.println("Current week is number : " + c.get(Calendar.WEEK_OF_YEAR) + " in year");
		System.out.println("Day of day after 20 days : " + getDayAfter(c, 20).get(Calendar.DAY_OF_MONTH));
		System.out.println("Day of week of day after 20 days : " + getDayAfter(c, 20).get(Calendar.DAY_OF_WEEK));
		
		Scanner ip = new Scanner(System.in);
		System.out.print("Input your date of birth : ");
		String Sdob = ip.nextLine();
		Calendar dob = DateTimeUtils.stringToCalendar(Sdob, "dd/MM/yyyy");
		System.out.println("You have lived for " + ((c.getTimeInMillis() - dob.getTimeInMillis())/(3600000 * 24)));
	}
	
	public static Calendar getDayOfFdow(Calendar c) {
		Calendar cr = Calendar.getInstance();
		cr.setTimeInMillis(c.getTimeInMillis());
		int dow = c.get(Calendar.DAY_OF_WEEK);
		int fdow = c.getFirstDayOfWeek();
		cr.add(Calendar.DAY_OF_MONTH, fdow - dow);
		if(dow == Calendar.SUNDAY) {
			cr.add(Calendar.WEEK_OF_YEAR, -1);
		}
		return cr;
	}
	
	public static Calendar getDayOfLdow(Calendar c) {
		Calendar cr = Calendar.getInstance();
		cr.setTimeInMillis(c.getTimeInMillis());
		cr = getDayOfFdow(cr);
		cr.add(Calendar.DAY_OF_MONTH, 6);
		return cr;
	}
	
	public static Calendar getDayAfter(Calendar c, int after) {
		Calendar cr = Calendar.getInstance();
		cr.setTimeInMillis(c.getTimeInMillis());
		cr.add(Calendar.DAY_OF_MONTH, after);
		return cr;
	}
}
