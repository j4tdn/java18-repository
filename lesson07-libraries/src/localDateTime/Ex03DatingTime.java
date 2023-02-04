package localDateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Ex04: Tính thời gian từ lúc sinh ra đến hiện tại : years - months - days -
 * hours + minutes + seconds
 */

public class Ex03DatingTime {
	public static void main(String[] args) {
		// 22.02.2001
		LocalDateTime dayOfBirth = LocalDateTime.of(2001, 02, 22, 7, 0, 0);
		System.out.println("dayofbirth: " + format(dayOfBirth));

		// 31.01.2023
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Now: " + format(now));

		if (now.isBefore(dayOfBirth)) {
			throw new IllegalArgumentException("Day of birth must be less than now (time)");
		}

		// B1: DayOfBirth --> LocalDate
		// : Now --> LocalDate
		// ==> period

		LocalDate ldateStart = dayOfBirth.toLocalDate();
		LocalDate ldateEnd = now.toLocalDate();
		Period period = Period.between(ldateStart, ldateEnd);

		// B1: DayOfBirth --> LocalDate
		// : Now --> LocalDate
		// ==> period

		LocalTime ltimeStart = dayOfBirth.toLocalTime();
		LocalTime ltimeEnd = now.toLocalTime();
		Duration duration = Duration.between(ltimeStart, ltimeEnd);

		if (duration.isNegative()) {
			// cộng 24 tiếng (plus)
			duration = duration.plusHours(24);
			// trừ 1 ngày (minus)
			period = period.minusDays(1);
		}

		System.out.println(getUnit(period.getYears(), " years ") + getUnit(period.getMonths(), " months ")
				+ getUnit(period.getDays(), " days ") + getUnit(duration.toHoursPart(), " hours ")
				+ getUnit(duration.toMinutesPart(), " minutes ") + getUnit(duration.toSecondsPart(), " seconds "));
	}

	private static String format(LocalDateTime ldaDateTime) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		return dtf.format(ldaDateTime);
	}

	private static String getUnit(int value, String unit) {
		return value == 0 ? " " : value + unit;
	}
}
