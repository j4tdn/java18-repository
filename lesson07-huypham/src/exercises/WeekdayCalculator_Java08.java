package exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class WeekdayCalculator_Java08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate date = null;
		boolean status = true;
		do {
			System.out.println("Enter the date (dd/MM/yyyy):");
			String start = sc.nextLine();
			try {
				date = format(start);
				status = true;
			} catch (Exception e) {
				status = false;
			}
		} while (status == false);
		System.out.println(date.getDayOfMonth()+ " " + date.getMonth()+" " + date.getYear() + " is " + date.getDayOfWeek() );
		System.out.println("\nAdditional facts");
		System.out.println(" * It is a day number " + date.getDayOfYear() + " of the year, " + (date.lengthOfYear() - date.getDayOfYear()) + " days left");
		System.out.println(" * It is a " + date.getDayOfWeek() + " number " + (date.getDayOfYear()/7+1) + " out of " + date.lengthOfYear()/7 + " in " + date.getYear());
		System.out.println(" * It is a " + date.getDayOfWeek() + " number " + date.lengthOfMonth()/7 + " out of " + date.lengthOfMonth()/7 + " in " + date.getMonth() + " " + date.getYear());
		System.out.println(" * Year " + date.getYear() + " has " + date.lengthOfYear() + " days ");
		System.out.println(" * " + date.getMonth() + " " + date.getYear() + " has " + date.lengthOfMonth() + " days ");
	}
	private static LocalDate format(String datetime) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(datetime, dtf);
		return date;
	}
}
