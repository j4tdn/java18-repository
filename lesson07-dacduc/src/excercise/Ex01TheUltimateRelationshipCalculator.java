package excercise;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01TheUltimateRelationshipCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDateTime startDate = null;
		LocalDateTime endDate = null;
		boolean status = true;
		do {
			System.out.println("Time to start dating(dd/MM/yyyy HH:mm:ss):");
			String start = sc.nextLine();
			try {
				startDate = format(start);
				status = true;
			} catch (Exception e) {
				status = false;
			}

		} while (status == false);
		System.out.println("The relationship status ended ?(y/n)");
		String choice = sc.nextLine();
		if (choice.equals("y") || choice.equals("Y")) {
			System.out.println("End date(dd/MM/yyyy HH:mm:ss):");
			endDate = format(sc.nextLine());
		} else if (choice.equals("n") || choice.equals("N")) {
			endDate = LocalDateTime.now();
		}
		System.out.println("*______________________________________*");
		if (endDate.toLocalDate().isBefore(startDate.toLocalDate())) {
			throw new IllegalArgumentException("StartDate must be less than EndDate");
		}
		Period period = Period.between(startDate.toLocalDate(), endDate.toLocalDate());
		Duration duration = Duration.between(startDate.toLocalTime(), endDate.toLocalTime());

		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		System.out.println("The date to start dating them is : " + startDate.getDayOfWeek());
		System.out.print("the relationship occurs in the time period :");
		System.out.println(getUnit(period.getYears(), " year ") + getUnit(period.getMonths(), " months ")
				+ getUnit(period.getDays(), " days ") + duration.toHoursPart() + " hours " + duration.toMinutesPart()
				+ " minutes " + duration.toSecondsPart() + " second ");
	}

	private static LocalDateTime format(String datetime) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime date = LocalDateTime.parse(datetime, dtf);
		return date;
	}

	public static String getUnit(int value, String unit) {
		return value == 0 ? "" : value + unit;
	}
}
