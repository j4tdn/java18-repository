package LocalDateTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex03DatingTime {
	/*
	 * Ex03: Tính thời gian từ lúc sinh ra đến hiện tại
	 */
	public static void main(String[] args) {
		// 22:22:22 22/10/2001
		LocalDateTime dayOfBirth = LocalDateTime.of(2001, 10, 22, 22, 22, 22);
		System.out.println(format(dayOfBirth));
		LocalDateTime now = LocalDateTime.now();
		System.out.println(format(now));

		// Tìm hiệu giữa 2 thời gian
		Period untilDate = Period.between(dayOfBirth.toLocalDate(), now.toLocalDate());
		Duration untilTime = Duration.between(dayOfBirth.toLocalTime(), now.toLocalTime());

//		if(untilTime.toSecondsPart() < 0 || untilTime.toHoursPart()<0 || untilTime.toMinutesPart()<0) {
//			
//		}
		if (untilTime.isNegative()) {
			untilDate = untilDate.minusDays(1);
			untilTime = untilTime.plusDays(1);
		}

		System.out.println(getUnit(untilDate.getYears(), " Năm ") + getUnit(untilDate.getMonths(), " Tháng ")
				+ getUnit(untilDate.getDays(), " Ngày ") + getUnit(untilTime.toHoursPart(), " Giờ ")
				+ getUnit(untilTime.toMinutesPart(), " Phút ") + getUnit(untilTime.toSecondsPart(), " Giây "));
	}

	private static String getUnit(int value, String unit) {
		return value == 0 ? " " : value + unit;
	}

	private static String format(LocalDateTime ldt) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return dtf.format(ldt);
	}
}
