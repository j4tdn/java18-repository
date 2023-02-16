package excercise;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Ex04DaysToWork {
	public static void main(String[] args) {
		LocalDate today = LocalDate.of(2022, 06, 07);
		int countDay = 0;
		do {
			if (today.getMonth() == Month.SEPTEMBER) {
				if (today.getDayOfMonth() == 1 || today.getDayOfMonth() == 2) {

					System.out.println("Day off: "+today);
					today = today.plusDays(1);
				} else if (today.getDayOfWeek() == DayOfWeek.SATURDAY || today.getDayOfWeek() == DayOfWeek.SUNDAY) {
					System.out.println("Day off: "+today);

					today = today.plusDays(1);
				} else if (today.getDayOfWeek() == DayOfWeek.SATURDAY || today.getDayOfWeek() == DayOfWeek.SUNDAY) {
					today = today.plusDays(1);
				} else {
					today = today.plusDays(1);
					countDay = countDay + 1;
				}
			} else if (today.getDayOfWeek() == DayOfWeek.SATURDAY || today.getDayOfWeek() == DayOfWeek.SUNDAY) {
				System.out.println("Day off: "+today);
				today = today.plusDays(1);
			} else {
				today = today.plusDays(1);
				countDay = countDay + 1;
			}
		} while (countDay != 110);
		System.out.println("Day which we finish 110days project is: " + formatDate(today));
	}

	public static String formatDate(LocalDate ldt) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return dtf.format(ldt);
	}
}
