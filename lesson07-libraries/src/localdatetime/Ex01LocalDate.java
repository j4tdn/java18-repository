package localdatetime;

import java.time.LocalDate;
import java.time.Period;

public class Ex01LocalDate {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		
		now = now.withDayOfMonth(18); //18/1/2023
		
		System.out.println("Local date now: " + now);
		
		LocalDate until = LocalDate.of(2023, 3, 8);
		System.out.println("Local date until: " + until);
		//Tìm khoảng thời gian giữa 2 mốc thời gian
		// với localdate --> period
		
		Period period = Period.between(now, until);
		System.out.println("Period --> " + period);
		System.out.println(getUnit(period.getYears()," years ")
						+	getUnit(period.getMonths() , " months ")
						+	getUnit(period.getDays() , " days ")
 				);
	}
	public static String getUnit(int value, String unit) {
		return value == 0 ? "" : value + unit;
	}
}
