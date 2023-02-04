package homework;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex02Homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		System.out.print("Enter month: ");
		int month = sc.nextInt();
		System.out.print("Enter day: ");
		int day = sc.nextInt();
		LocalDate checkDate = LocalDate.of(year, month, day);
		System.out.println(checkDate.getDayOfMonth() + " " + checkDate.getMonth() + " " + checkDate.getYear() + " is a "
				+ checkDate.getDayOfWeek());
		detailDay(checkDate);
	}

	public static void detailDay(LocalDate checkDate) {
		long totalDay = ChronoUnit.DAYS.between(LocalDate.of(checkDate.getYear(), 1, 1),
				LocalDate.of(checkDate.getYear(), 12, 31)) + 1;
		System.out.println("It is day number " + checkDate.getDayOfYear() + " of the year, "
				+ (totalDay - checkDate.getDayOfYear()) + " days left");
	}
}
