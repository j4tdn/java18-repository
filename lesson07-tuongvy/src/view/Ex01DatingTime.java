package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01DatingTime {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2022, 01, 29, 23, 50, 40);
		System.out.println("Start date: " + format(start));
		
		LocalDateTime now = LocalDateTime.now();
		
		
		System.out.println("The date to start dating is " + start.getDayOfWeek());
		if (now.isBefore(start)) {
			throw new IllegalArgumentException("Start date");
		}
		
		LocalDate ldtateStart = start.toLocalDate();
		LocalDate ldateEnd = now.toLocalDate();
		Period period = Period.between(ldtateStart, ldateEnd);
		
		
		LocalTime ltimeStart = start.toLocalTime();
		LocalTime ltimeEnd = now.toLocalTime();
		Duration duration = Duration.between(ltimeStart, ltimeEnd);
		
		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println(getUnit(period.getYears(), " years ")
				+ getUnit(period.getMonths(), " months ")
				+ getUnit(period.getDays(), " days ")
				+ getUnit(duration.toHoursPart(), " hours ")
				+ getUnit(duration.toMinutesPart(), " minutes ")
				+ getUnit(duration.toSecondsPart(), " seconds "));
		
	}
	
	private static String format(LocalDateTime lDateTime) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return dtf.format(lDateTime);
	}
	
	private static String getUnit(int value, String unit) {
		return value == 0 ? "" : value + unit;
	}

}
