package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex02WeekdayCalculator {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2023, 2, 8);
		System.out.println("Date: " + format(date));

		System.out.println(
				date.getDayOfMonth() + " " + date.getMonth() + " " + date.getYear() + " is a " + date.getDayOfWeek());

		LocalDate startDayOfYear = LocalDate.of(date.getYear(), 1, 1);

		LocalDate startDayOfMonths = LocalDate.of(date.getYear(), date.getMonth(), 1);

		System.out.println("Additional facts");
		System.out.println("It is day number " + date.getDayOfYear() + " of the year, "
				+ (date.lengthOfYear() - date.getDayOfYear()) + " days left.");

		if (date.getDayOfWeek().getValue() >= startDayOfYear.getDayOfWeek().getValue()) {
			System.out.println("It is " + date.getDayOfWeek() + " number " + (date.getDayOfYear() / 7 + 1) + " out of "
					+ (date.lengthOfYear() / 7 + 1) + " in " + date.getYear());
		} else {
			System.out.println("It is " + date.getDayOfWeek() + " number "
					+ ((date.getDayOfYear()
							+ (startDayOfYear.getDayOfWeek().getValue() - date.getDayOfWeek().getValue())) / 7)
					+ " out of " + (date.lengthOfYear() / 7) + " in " + date.getYear());
		}

		if (date.getDayOfWeek().getValue() >= startDayOfMonths.getDayOfWeek().getValue()) {
			System.out.println("It is " + date.getDayOfWeek() + " number " + (date.getDayOfMonth() / 7 + 1) + " out of "
					+ (date.lengthOfMonth() / 7 + 1) + " in " + date.getMonth() + " " + date.getYear());
		} else {
			System.out.println("It is " + date.getDayOfWeek() + " number "
					+ ((date.getDayOfMonth()
							+ (startDayOfMonths.getDayOfWeek().getValue() - date.getDayOfWeek().getValue())) / 7)
					+ " out of " + (date.lengthOfMonth() / 7) + " in " + date.getMonth() + " " + date.getYear());
		}

		System.out.println("Year " + date.getYear() + " has " + date.lengthOfYear() + " days.");
		System.out.println(date.getMonth() + " " + date.getYear() + " has " + date.lengthOfMonth() + " days.");

	}

	private static String format(LocalDate ldate) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return df.format(ldate);
	}

}
