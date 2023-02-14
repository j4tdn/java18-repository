package excercise;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.IsoFields;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
//import java.time.temporal.WeekFields;
import java.util.Locale;
//Không import được java.time.temporal.WeekFields
public class Ex03Java08 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
		String datetime = dtf.format(now);
		System.out.println("1. Current time in Tokyo: " + datetime);
		System.out.println("2. The last day of the current month: "+now.toLocalDate().lengthOfMonth()+"/"+now.toLocalDate().getMonthValue()+"/"+now.toLocalDate().getYear());
		System.out.println("3. The first and last day of the current week: ");
		System.out.println("4. Current day is in week "+now.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR) + " of the year.");
		System.out.println("5. The date after adding 20 days is: " + now.toLocalDate().plusDays(20));
		Timelived(now.toLocalDate());
	}
	private static void Timelived(LocalDate date) {
		LocalDate dayOfBirth = LocalDate.of(2002, 05, 11);
		if (date.isBefore(dayOfBirth)) {
			throw new IllegalArgumentException("Day of birth must be less than now (time)");
		}
		System.out.println("6. I have lived " + ChronoUnit.DAYS.between(dayOfBirth, date)  + " days.");
	}
}
