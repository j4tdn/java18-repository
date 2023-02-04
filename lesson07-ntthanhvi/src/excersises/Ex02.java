package excersises;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import utils.DateUtils;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập ngày/tháng/năm: ");
		String date = ip.nextLine();
		
		Calendar dateAsCal = DateUtils.StringToCalendar(date, "dd/MM/yyyy");
		
		String daysInWeek[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		String monthsInYear[] = {"January", "February", "March", "April", "May", "June", 
				"July", "August", "September", "October", "November", "December"};
		
		// Xuất thông tin theo bảng màu xanh
		System.out.println(dateAsCal.get(Calendar.DAY_OF_MONTH) 
				+ " " + monthsInYear[dateAsCal.get(Calendar.MONTH)] 
				+ " " + dateAsCal.get(Calendar.YEAR) 
				+ " is " + daysInWeek[dateAsCal.get(Calendar.DAY_OF_WEEK)-1]);
		
		System.out.println("Additional Fact : ");
		
		System.out.println("* It is day " 
				+ dateAsCal.get(Calendar.DAY_OF_YEAR) 
				+ " of Year, there re "
				+ (dateAsCal.getActualMaximum(Calendar.DAY_OF_YEAR) 
				- dateAsCal.get(Calendar.DAY_OF_YEAR) 
				+ " days left"));
		
		System.out.println("* It is " 
				+ daysInWeek[dateAsCal.get(Calendar.DAY_OF_WEEK)-1] 
				+ " number " 
				+ dateAsCal.get(Calendar.DAY_OF_WEEK_IN_MONTH) 
				+ " in " + monthsInYear[dateAsCal.get(Calendar.MONTH)] 
				+ " " + dateAsCal.get(Calendar.YEAR));
		
	
		System.out.println("* It is day " 
				+ daysInWeek[dateAsCal.get(Calendar.DAY_OF_WEEK)-1] 
				+ " number " 
				+ (int)Math.ceil(dateAsCal.get(Calendar.DAY_OF_YEAR)/7.0) 
				+ " in " + dateAsCal.get(Calendar.YEAR));
		
		System.out.println("* Year " 
				+ dateAsCal.get(Calendar.YEAR) 
				+ " has " + dateAsCal.getActualMaximum(Calendar.DAY_OF_YEAR) 
				+ " days");
		
		System.out.println("* " + monthsInYear[dateAsCal.get(Calendar.MONTH)] 
					+ " " + dateAsCal.get(Calendar.YEAR) + " has " 
					+ dateAsCal.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
	}
	public static boolean isValidFormat(String string) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = df.parse(string);
		} catch (ParseException e) {
			System.out.println("Date is not valid");
			return false;
		}
		return true;
	}
	
}
