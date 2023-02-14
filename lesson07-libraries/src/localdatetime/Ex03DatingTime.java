package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Tính thời gian từ lúc sinh ra đến hiện tại
 * years - months - days - hours - minutes - seconds
 */

public class Ex03DatingTime {
	public static void main(String[] args) {
		LocalDateTime dayOfBirth = LocalDateTime.of(1997, 5, 21, 8, 5, 10); // 21/05/1997 08:05:10
		System.out.println("Day of birth: " + format(dayOfBirth));
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Now: " + format(now));
		
		if (now.isBefore(dayOfBirth)) {
			throw new IllegalArgumentException("Day of birth must be less than now (time)");
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
				
		System.out.println(getUnit(period.getYears(), " year(s) ")
				 + getUnit(period.getMonths(), " month(s) ")
				 + getUnit(period.getDays(), " day(s) ")
				 + getUnit(duration.toHoursPart(), " hour(s) ")
				 + getUnit(duration.toMinutesPart(), " minute(s) ")
				 + getUnit(duration.toSecondsPart(), " second(s)"));

	}

	private static String format(LocalDateTime ldatetime) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return dtf.format(ldatetime);
	}

	private static String getUnit(int value, String unit) {
		return value == 0 ? "" : value + unit;
	}

}
