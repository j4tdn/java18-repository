package view;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.IsoFields;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Ex03Java08 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now(ZoneId.of("Europe/Paris"));
		
		LocalDate localDate = LocalDate.now();
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("1. Currentime in VN: " + format(now));
		System.out.println("2. Last day of month: " + lastDayOfMonth(localDate) );
		System.out.println("3. First day and last day of week: " + firstAndLastDayOfWeek(localDate));
		System.out.println("4. Week of year: " + localDate.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR));
		System.out.println("5. The date after 20 days: " + df.format(localDate.plusDays(20)));
		live();
	}
	
	private static String lastDayOfMonth(LocalDate now) {
		LocalDate lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return df.format(lastDayOfMonth);
	}
	
	private static String firstAndLastDayOfWeek(LocalDate date) {
		Locale france = Locale.FRANCE;
		WeekFields weekFields = WeekFields.of(france);
		DayOfWeek firstDayOfWeek = weekFields.getFirstDayOfWeek();
		DayOfWeek lastDayOfWeek = firstDayOfWeek.minus(1);
		
		LocalDate firstDate = date.with(TemporalAdjusters.previousOrSame(firstDayOfWeek));
		LocalDate lastDate = date.with(TemporalAdjusters.nextOrSame(lastDayOfWeek));
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
		return df.format(firstDate) + " & " + df.format(lastDate);
	}
	
	private static void live() {
		LocalDate dayOfBirth = LocalDate.of(2002, 06, 29);
		LocalDate now = LocalDate.now();
		if (now.isBefore(dayOfBirth)) {
			throw new IllegalArgumentException("Day of birth must be than now");
		}
		
		System.out.println("6. I have lived " + ChronoUnit.DAYS.between(dayOfBirth, now) + "days.");
	}
	
	
	
	private static String format(LocalDateTime ldatetime) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return df.format(ldatetime);
	}

}
