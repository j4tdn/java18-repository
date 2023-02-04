package homework1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class homework2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("scanner day/month/year : ");
		String a = ip.nextLine();
		Calendar b = StringToCalendar(a);
		//System.out.println(b);
		System.out.println(b.get(Calendar.DAY_OF_MONTH) + " " + monthOfYear((b.get(Calendar.MONTH)+1)) + " " + b.get(Calendar.YEAR) + " is a " + dayofweek(b.get(Calendar.DAY_OF_WEEK)));
		System.out.println("Additional facts");
		System.out.println("  .  It is day number " + b.get(Calendar.DAY_OF_YEAR) + " of the year ," + (b.getActualMaximum(Calendar.DAY_OF_YEAR)-b.get(Calendar.DAY_OF_YEAR)) + " days left");
		System.out.println("  .  It is " + monthOfYear((b.get(Calendar.MONTH)+1)) + " number " + b.get(Calendar.WEEK_OF_YEAR) + " Out of "+ b.getActualMaximum(Calendar.WEEK_OF_YEAR) + " in " + b.get(Calendar.YEAR));
		System.out.println("  .  It is " + monthOfYear((b.get(Calendar.MONTH)+1)) + " number " + b.get(Calendar.DAY_OF_MONTH) + " Out of "+ b.getActualMaximum(Calendar.DAY_OF_MONTH) + " in " + monthOfYear((b.get(Calendar.MONTH)+1)) + " " + b.get(Calendar.YEAR));
		System.out.println("  .  Year "+ b.get(Calendar.YEAR)+ " has " + b.getActualMaximum(Calendar.DAY_OF_YEAR) + " days ");
		System.out.println("  .  " + monthOfYear((b.get(Calendar.MONTH)+1)) + " " + b.get(Calendar.YEAR) + " has " + b.getActualMaximum(Calendar.DAY_OF_MONTH));
	}
	
	private static Date StringToDate(String string){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = df.parse(string);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	private static Calendar StringToCalendar(String string ) {
		Date date = StringToDate(string);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}
	private static String dayofweek(int dayofweek){
		if(dayofweek==7) {
			return "SATURDAY";
		}
		if(dayofweek==6) {
			return "FRIDAY";
		}
		if(dayofweek==5) {
			return "THURSDAY";
		}
		if(dayofweek==4) {
			return "WEDNESDAY";
		}
		if(dayofweek==3) {
			return "TUESDAY";
		}
		if(dayofweek==2) {
			return "MONDAY";
		}
		if(dayofweek==1) {
			return "SUNDAY";
		}
		return null;
	}
//	JANUARY
//    * @see #FEBRUARY
//    * @see #MARCH
//    * @see #APRIL
//    * @see #MAY
//    * @see #JUNE
//    * @see #JULY
//    * @see #AUGUST
//    * @see #SEPTEMBER
//    * @see #OCTOBER
//    * @see #NOVEMBER
//    * @see #DECEMBER
    private static String monthOfYear(int monthOfYear) {
		String a[] = {"FEBRUARY","MARCH","APRIL","MAY","JULY","AUGUST",
				"SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
		return a[monthOfYear];
	}
    
    
}
