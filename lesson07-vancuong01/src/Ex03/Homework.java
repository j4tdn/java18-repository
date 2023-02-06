package Ex03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Homework {
	public static void main(String[] args) {
		String area = "Asia/Ho_Chi_Minh";
		System.out.println("Date Time: " + formatDateTime(getDateTimeArea(area).toLocalDateTime()));
		System.out.println("Last Day In This Month: " + formatDate(getLastDayInThisMonth().toLocalDate()));
		System.out.println("First Day In This Week: " + formatDate(getfirstDayInThisWeek().toLocalDate()));
		System.out.println("Last Day In This Week: " + formatDate(getLastDayInThisWeek().toLocalDate()));
		System.out.println("This week is " + checkThisWeekInYear() + "th week of year");
		dayFuture();
		System.out.println("You have lived " + liveDay(LocalDate.of(2001, 10, 22)) + " days");
	}
	public static ZonedDateTime getDateTimeArea(String area) {
		ZoneId timeZone = ZoneId.of(area);
		LocalDateTime dateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = dateTime.atZone(timeZone);
		return zonedDateTime;
	}
	public static LocalDateTime getLastDayInThisMonth() {
		LocalDateTime dateTime = LocalDateTime.now();
		LocalDateTime lastDay = dateTime.with(TemporalAdjusters.lastDayOfMonth());
		return lastDay;
	}
	public static LocalDateTime getfirstDayInThisWeek() {
		LocalDateTime dateTime = LocalDateTime.now();
		LocalDateTime lastDay = dateTime.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		return lastDay;
	}
	private static LocalDateTime getLastDayInThisWeek() {
		LocalDateTime dateTime = LocalDateTime.now();
		LocalDateTime lastDay = dateTime.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
		return lastDay;
	}
	private static int checkThisWeekInYear() {
		LocalDateTime now = LocalDateTime.now();
		WeekFields weekFields = WeekFields.of(Locale.getDefault());
		int weekOfYear = now.get(weekFields.weekOfYear());
		return weekOfYear;
	}
	public static void dayFuture() {
		LocalDate now = LocalDate.now();
		LocalDate futureDate = now.plusDays(20);
		System.out.println("20 day after is: " + formatDate(futureDate) + ", " + futureDate.getDayOfWeek());
	}

	public static long liveDay(LocalDate dayOfBirth) {
		LocalDate now = LocalDate.now();
		long days = ChronoUnit.DAYS.between(dayOfBirth, now);
		return days;
	}
	public static String formatDateTime(LocalDateTime ldt) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
		return dtf.format(ldt);
	}
	public static String formatDate(LocalDate ldt) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return dtf.format(ldt);
	}
}