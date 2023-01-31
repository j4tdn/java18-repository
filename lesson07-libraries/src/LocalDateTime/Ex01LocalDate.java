package LocalDateTime;

import java.time.LocalDate;
import java.time.Period;

public class Ex01LocalDate {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println("now: " + now);
		now = now.withDayOfMonth(12);

		LocalDate until = LocalDate.of(2023, 05, 18);
		System.out.println("until: " + until);

		// Tìm khoảng thời gian giữa 2 mốc thời gian với localDate --> Period

		Period period = Period.between(now, until);
		System.out.println("period --> " + period);

		System.out.println(getUnit(period.getYears(), " Năm ") + getUnit(period.getMonths(), " Tháng ")
				+ getUnit(period.getDays(), " Ngày "));

	}

	private static String getUnit(int value, String unit) {
		return value == 0 ? " " : value + unit;
	}
}
