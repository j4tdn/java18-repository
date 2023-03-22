package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Ex03: Tính thời gian từ lúc sinh ra đến hiện tại
 * 		:Years - Months - Day - Hours  + Minutes + Seconds
 * 
 * */

public class Ex03DatingTime {
	public static void main(String[] args) {
		//07.02.2002
		LocalDateTime dayOfBirth = LocalDateTime.of(2002, 2, 7, 23, 23, 40);
		// 
		LocalDateTime now = LocalDateTime.now();
		if (now.isBefore(dayOfBirth)) {
			throw new IllegalArgumentException("Day of birth must be less than now (time)");
		}
		
		System.out.println("Day of Birth: " + format(dayOfBirth));
		System.out.println("Now: " + format(now));
		System.out.println("============================");
		//LocalDateTime to LocalDate
		LocalDate ldateStart = dayOfBirth.toLocalDate();
		LocalDate ldateNow = now.toLocalDate();
		
		Period period = Period.between(ldateStart, ldateNow);
		
		LocalTime ltdateStart = dayOfBirth.toLocalTime();
		LocalTime ltdateNow = now.toLocalTime();
		
		Duration duration = Duration.between(ltdateStart, ltdateNow);
		
		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		System.out.println(getUnit(period.getYears()," years ")
				+	getUnit(period.getMonths() , " months ")
				+	getUnit(period.getDays() , " days ")
			);
		System.out.println(duration.toHoursPart()  + "Hours"
						+ duration.toMinutesPart() + "Minutes" 
						+ duration.toSecondsPart() + "Seconds");
	}
	private static String format(LocalDateTime ldatime) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return dtf.format(ldatime);
	}
	public static String getUnit(int value, String unit) {
		return value == 0 ? "" : value + unit;
	}
}
