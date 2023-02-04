package localdatetime;

import java.time.LocalDate;
import java.time.Period;

public class Ex01LocalDate {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		now = now.withDayOfMonth(18);
		System.out.println("ldate now: " + now);
		
		LocalDate until = LocalDate.of(2023, 3, 8);
		System.out.println("until: " + until);
		
		// Tìm khoàn thời gian giữa 2 mốc thời gian
		// với localdate --> Period
		
		Period period = Period.between(now, until);
		System.out.println("period --> " + period);
		
		System.out.println(getUnit(period.getYears(), " years ")
						 + getUnit(period.getMonths(), " months ")
						 + getUnit(period.getDays(), " days"));
		
	}
	
	private static String getUnit(int value, String unit) {
		return value == 0 ? "" : value + unit;
	}
}
