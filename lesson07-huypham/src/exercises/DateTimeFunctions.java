package exercises;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeFunctions {
	public static void main(String[] args) {
		 DateTimeFunctions dtf = new DateTimeFunctions();
		 dtf.displayCurrentTime();
		 dtf.displayLastDayOfMonth();
		 dtf.displayWeekBoundaries();
		 dtf.displayWeekNumber();
	}

	public void displayCurrentTime() {
		  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		  System.out.println("Current time: " + sdf.format(Calendar.getInstance().getTime()));
	}

	public void displayLastDayOfMonth() {
		  Calendar calendar = Calendar.getInstance();
		  calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		  System.out.println("Last day of the month: " + sdf.format(calendar.getTime()));
	}

	public void displayWeekBoundaries() {
		  Calendar calendar = Calendar.getInstance();
		  calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		  System.out.println("First day of the week: " + sdf.format(calendar.getTime()));
		  calendar.add(Calendar.DAY_OF_WEEK, 6);
		  System.out.println("Last day of the week: " + sdf.format(calendar.getTime()));
	}

	public void displayWeekNumber() {
		 Calendar calendar = Calendar.getInstance();
		 System.out.println("Week number of the year: " + calendar.get(Calendar.WEEK_OF_YEAR));
	}
}
