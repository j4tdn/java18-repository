package localDateTime;

import java.time.LocalDate;
import java.time.Period;

public class Ex01LocalDate {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println("ldate now: " + now);
		
		LocalDate until = LocalDate.of(2023, 03, 01);
		System.out.println("until: " + until);
		
		// Tìm khoảng thời gian giữa hai mốc thời gian
		// với localdate -dùng-> period
		
		Period period = Period.between(now, until);
		System.out.println("period: " + period);
		
		System.out.println(getUnit(period.getYears(), " years ") + 
							getUnit(period.getMonths()," months ") + 
							getUnit(period.getDays(), " days "));
	}
	private static String getUnit (int value, String unit) {
		return value == 0 ? " " : value + unit;
	}

}
