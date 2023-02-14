package excercise;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import utils.DateUtils;

public class Ex02Java07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date :");
		String input = sc.nextLine();
		Date date = DateUtils.stringToDate(input, "dd/MM/yyyy");
		System.out.println("*____________________________*");
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		String[] dayOfWeeks = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		System.out.println(dayOfMonth+ " " +months[month-1]+" "+year + " is " + dayOfWeeks[dayOfWeek-1] );
		System.out.println("\nAdditional facts");
		System.out.println(" * It is a day number "+dayOfYear+" of the year, "+(c.getMaximum(Calendar.DAY_OF_YEAR)-1-dayOfYear)+" days left");
		System.out.println(" * It is a "+ dayOfWeeks[dayOfWeek-1]+" number "+(c.get(Calendar.DAY_OF_YEAR)/7+1)+" out of "+(c.getMaximum(Calendar.DAY_OF_YEAR)-1)/7+" in "+year);
		System.out.println(" * It is a "+ dayOfWeeks[dayOfWeek-1]+" number "+c.get(Calendar.DAY_OF_WEEK_IN_MONTH)+" out of "+(dayOfMonth/7+1)+" in "+months[month-1]+" "+year);
		System.out.println(" * Year "+year+" has " +(c.getMaximum(Calendar.DAY_OF_YEAR)-1)+" days ");
		System.out.println(" * "+months[month-1]+" "+year+" has "+(c.getMaximum(Calendar.DAY_OF_MONTH)-1)+" days ");
		
	}
}
