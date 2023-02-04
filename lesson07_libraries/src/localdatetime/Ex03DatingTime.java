package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex03DatingTime {
	public static void main(String[] args) {
		LocalDateTime dayOfBirth = LocalDateTime.of(2002, 06, 29, 23, 50, 40);
		System.out.println("dayOfBirth: " + format(dayOfBirth));
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now: " + format(now));
		
		if (now.isBefore(dayOfBirth)) {
			throw new IllegalArgumentException("DayOfBirth");
		}
		
		LocalDate ldateStart = dayOfBirth.toLocalDate();
		LocalDate ldateEnd = now.toLocalDate();
		Period period = Period.between(ldateStart, ldateEnd);
		
		LocalTime ltimeStart = dayOfBirth.toLocalTime();
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
				+ getUnit(duration.toMinutesPart(), "minutes")
				+ getUnit(duration.toSecondsPart(), "seconds"));
		
		
	}
	
	private static String format(LocalDateTime lDateTime) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return dtf.format(lDateTime);
	}
	
	private static String getUnit(int value, String unit) {
		return value == 0 ? "" : value + unit;
	}
	//                       

}
