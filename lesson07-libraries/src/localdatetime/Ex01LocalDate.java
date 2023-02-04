package localdatetime;

import java.time.LocalDate;
import java.time.Period;

public class Ex01LocalDate {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		now.withDayOfMonth(18);
		System.out.println("ldate now: " + now);
		
		LocalDate until = LocalDate.of(2025, 05, 01);
		System.out.println("Until: " + until);
		
		//Tìm khoảng thời gian từ 2 mốc
		//Localate --> Period
		
		Period period = Period.between(now, until);
		System.out.println("period : " + period);
		

		System.out.println(getUnit(period.getYears(), " year")
							+ getUnit(period.getMonths(), " months")
							+ getUnit(period.getDays(), " days"));
		
	}
	
	
	private static String getUnit(int value, String unit) {
		return value == 0 ? "" : value + unit;
	}
}
