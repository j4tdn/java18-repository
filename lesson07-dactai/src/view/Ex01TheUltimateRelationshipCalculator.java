package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class Ex01TheUltimateRelationshipCalculator {

	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2002, 11, 22, 11, 28, 43);
		LocalDateTime end = LocalDateTime.of(2010, 2, 14, 19, 23, 13);

		Scanner in = new Scanner(System.in);
		System.out.println("Did they break up ?");
		String choice = in.next();
		if (choice.equals("N")|| choice.equals("n")) {
			end = LocalDateTime.now();
		}

		LocalTime ltimeStart = start.toLocalTime();
		LocalTime ltimeEnd = end.toLocalTime();

		Duration duration = Duration.between(ltimeStart, ltimeEnd);

		LocalDate ldateStart = start.toLocalDate();
		LocalDate ldateEnd = end.toLocalDate();

		Period period = Period.between(ldateStart, ldateEnd);

		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.plusDays(1);
		}
		System.out.println("==> " + getUnit(period.getYears(), " years ") + getUnit(period.getMonths(), " months ")
				+ getUnit(period.getDays(), " days ") + getUnit(duration.toHoursPart(), " hours ")
				+ getUnit(duration.toMinutesPart(), " minutes ") + getUnit(duration.toSecondsPart(), " seconds "));

	}

	private static String getUnit(int value, String unit) {
		return value == 0 ? "" : value + unit;
	}

}
