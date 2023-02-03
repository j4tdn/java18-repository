package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex03DatingTime {

	public static void main(String[] args) {
		// 22.11.2002 11:28:43
		LocalDateTime dayOfBirth = LocalDateTime.of(2002, 11, 22, 11, 28, 43);
		System.out.println("dayOfbirth: " + format(dayOfBirth));
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now: " + format(now));
		
		if(now.isBefore(dayOfBirth)) {
			throw new IllegalArgumentException("Day of birth must be less than now");
		}
		
		LocalTime ltimeStart = dayOfBirth.toLocalTime();
		LocalTime ltimeEnd = now.toLocalTime();
		
		Duration duration = Duration.between(ltimeStart, ltimeEnd);
		
		LocalDate ldateStart = dayOfBirth.toLocalDate();
		LocalDate ldateEnd = now.toLocalDate();
		
		Period period = Period.between(ldateStart, ldateEnd);
		
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.plusDays(1);
		}
		
		System.out.println(getUnit(period.getYears(), " years ")
				+ getUnit(period.getMonths(), " months ")
				+ getUnit(period.getDays(), " days ")
				+ getUnit(duration.toHoursPart(), " hours ")
				+ getUnit(duration.toMinutesPart(), " minutes ")
				+ getUnit(duration.toSecondsPart(), " seconds "));
			
		
	}
	
	private static String format(LocalDateTime ldatetime) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return dtf.format(ldatetime);
	}
	
	private static String getUnit(int value, String unit) {
		return value == 0 ? "" : value + unit;
	}

}
