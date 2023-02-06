package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01DateCalculator {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2019, 7, 28, 16, 15, 26);
		System.out.println("start: " + format(start));
		
		LocalDateTime end = LocalDateTime.now();
		System.out.println("end: " + format(end));
		
		if(end.isBefore(start)) {
			throw new IllegalArgumentException("start must be less then end");
		}
		
		LocalDate ldateStart = start.toLocalDate();
		LocalDate ldateEnd = end.toLocalDate();
		Period period = Period.between(ldateStart, ldateEnd);
		
		LocalTime ltimeStart = start.toLocalTime();
		LocalTime ltimeEnd = end.toLocalTime();
		Duration duration = Duration.between(ltimeStart, ltimeEnd);
		
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println("---------thời gian hẹn hò------------");
		System.out.println(getUnit(period.getYears(), " years ")
				 + getUnit(period.getMonths(), " months ")
				 + getUnit(period.getDays(), " days ")
				 + getUnit(duration.toHoursPart(), " hours ")
				 + getUnit(duration.toMinutesPart(), " minutes ")
				 + getUnit(duration.toSecondsPart(), " seconds"));
		System.out.println("Ngày bắt đầu hẹn hò là " + start.getDayOfWeek());
	}
	
	private static String format(LocalDateTime ldatetime) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return dtf.format(ldatetime);
	}
	
	private static String getUnit(int value, String unit) {
		return value == 0 ? "" : value + unit;
	}
}
