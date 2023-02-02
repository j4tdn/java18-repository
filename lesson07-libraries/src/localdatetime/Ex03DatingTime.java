package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex03DatingTime {
	public static void main(String[] args) {
		// LocalDate --> Period
		// LocalTime --> Duration
		
		LocalDateTime dayOfBirth = LocalDateTime.of(2001, 12, 21, 19, 12, 21);
		System.out.println("Day of Birth : " + dayOfBirth);
		
		LocalDateTime now = LocalDateTime.of(2023, 1, 31, 20, 15, 15);
		System.out.println("Now : " + now);
		
		if(now.isBefore(dayOfBirth)) {
			throw new IllegalArgumentException("Day of Birth must be less than now (time)");
		}
		
		// B1 : DayOfBirth -> LocalDate
		//    : Now -> LocalDate
		// ==> Period
		
		LocalDate startInLocalDate = dayOfBirth.toLocalDate();
		LocalDate endInLocalDate = now.toLocalDate();
		Period period = Period.between(startInLocalDate, endInLocalDate);
		
		// B2 : DayOfBirth -> LocalTime
		//    : Now -> LocalTime
		// ==> Duration
		LocalTime startInLocalTime = dayOfBirth.toLocalTime();
		LocalTime endInLocalTime = now.toLocalTime();
		Duration duration = Duration.between(startInLocalTime, endInLocalTime);
		
		if(duration.isNegative()) {
			duration = duration.plusHours(24);
			period = period.minusDays(1);
		}
//		System.out.println(period + " " + duration);
		System.out.println(getUnit(period.getYears(), " years ")
				+ getUnit(period.getMonths(), " month ")
				+ getUnit(period.getDays(), " days ")
				+ getUnit(duration.toHoursPart(), " hours ")
				+ getUnit(duration.toMinutesPart(), " minutes ")
				+ getUnit(duration.toSecondsPart(), " seconds ")
				);
		
	}
	private static String format(LocalDateTime ldatetime) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return dtf.format(ldatetime);
	}
	
	private static String getUnit(int value, String unit) {
		return value == 0 ? " " : value + unit;
	}
}
