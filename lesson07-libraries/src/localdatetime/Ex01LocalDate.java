package localdatetime;

/**
 * change date => .with() => đổi từng cái (day, month, year)
 * set date    => .of()   => đổi luôn cụm day, month, year
 */

import java.time.LocalDate;
import java.time.Period;

public class Ex01LocalDate {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		now = now.withDayOfMonth(18); // 18.01.2023
		System.out.println("LocalDate now: " + now);
		
		LocalDate until = LocalDate.of(2023, 03, 8);
		System.out.println("LocalDate until: " + until);
		
		// Tìm khoảng thời gian giữa 2 mốc thời gian
		// với localdate --> Period 
		
		Period period = Period.between(now, until);
		System.out.println("Period: " + period);
		
		System.out.println(getUnit(period.getYears(), " year(s)")
						 + getUnit(period.getMonths(), " month(s) ")
						 + getUnit(period.getDays(), " day(s)"));
		
	}

	private static String getUnit(int value, String unit) {
		return value == 0 ? "" : value + unit;
	}

}
