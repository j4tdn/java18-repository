package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex03DatingTime {
	public static void main(String[] args) {
		LocalDateTime dayOfBirth = LocalDateTime.of(2001, 11, 26, 18, 12, 24);
		System.out.println("DayOfBirth: " + dayOfBirth);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Now: " + now);
		
		if (now.isBefore(dayOfBirth)) {
			throw new IllegalArgumentException("Day of birth must be less than now (time");
		}
		
		//B1: DayOfBirth --> LocalDate
		//  : now        --> localDate
		//==> Period
		LocalDate ldateStart = dayOfBirth.toLocalDate();
		LocalDate ldateEnd = now.toLocalDate();
		Period period = Period.between(ldateStart, ldateEnd);
		
		
		//B2: DayOfBirth --> LocalTime
		//  : now        --> LocalTime
		//==> Duration
		LocalTime ltimeStart = dayOfBirth.toLocalTime();
		LocalTime ltimeEnd = now.toLocalTime();
		Duration duration = Duration.between(ltimeStart, ltimeEnd);
		
		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println(period + " " + duration);
	}
	
	private static String format(LocalDateTime ldatetime) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("đ/")
	}
}
