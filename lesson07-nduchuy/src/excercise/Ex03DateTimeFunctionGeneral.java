package excercise;

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


public class Ex03DateTimeFunctionGeneral {
	public static void main(String[] args) {
		String area = "Asia/Ho_Chi_Minh";
		System.out.println("Date Time: "+ formatDateTime(getDateTimeArea(area).toLocalDateTime()));
		System.out.println("Last Day In This Month: "+ formatDate(getLastDayInThisMonth().toLocalDate()));
		System.out.println("First Day In This Week: "+ formatDate(getfirstDayInThisWeek().toLocalDate()));
		System.out.println("Last Day In This Week: "+ formatDate(getLastDayInThisWeek().toLocalDate()));
		System.out.println("This week is "+checkThisWeekInYear()+"th week of year");
		dayFuture() ;
		System.out.println("You have lived "+liveDay(LocalDate.of(2001, 10, 22))+" days");
	}
	/**
	 * 1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
	 * @param area
	 * @return ZonedDateTime
	 */
	public static ZonedDateTime getDateTimeArea(String area) {
		ZoneId timeZone = ZoneId.of(area);
		LocalDateTime dateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = dateTime.atZone(timeZone);
		return zonedDateTime;
	}
	/**
	 * In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
	 * @return lastDay
	 */
	public static LocalDateTime getLastDayInThisMonth() {
		LocalDateTime dateTime = LocalDateTime.now();
		LocalDateTime lastDay = dateTime.with(TemporalAdjusters.lastDayOfMonth());
		return lastDay;
	}
	/**
	 * Xem ngày đầu tiền của tuần hiện tại.
	 * @return
	 */
	public static LocalDateTime getfirstDayInThisWeek() {
		LocalDateTime dateTime = LocalDateTime.now();
		LocalDateTime lastDay = dateTime.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		return lastDay;
	}
	/**
	 * Xem ngày cuối cùng của tuần hiện tại.
	 * @return lastDay
	 */
	private static LocalDateTime getLastDayInThisWeek() {
		LocalDateTime dateTime = LocalDateTime.now();
		LocalDateTime lastDay = dateTime.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
		return lastDay;
	}
	/**
	 * Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
	 * @return
	 */
	private static int checkThisWeekInYear() {
		LocalDateTime now = LocalDateTime.now();
		WeekFields weekFields = WeekFields.of(Locale.getDefault());
		int weekOfYear = now.get(weekFields.weekOfYear());
		return weekOfYear;
	}
	/**
	 * Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
	 */
	public static void dayFuture() {
		LocalDate now = LocalDate.now();
		LocalDate futureDate = now.plusDays(20);
		System.out.println("20 day after is: "+formatDate(futureDate)+", "+futureDate.getDayOfWeek());
	}
	public static long liveDay(LocalDate dayOfBirth) {
		LocalDate now = LocalDate.now();
		long days = ChronoUnit.DAYS.between(dayOfBirth, now);
		return days;
	}
	/**
	 * 
	 * @param ldt
	 * @return formatDateTime
	 */
	public static String formatDateTime(LocalDateTime ldt) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
		return dtf.format(ldt);
	}
	/**
	 * 
	 * @param ldt
	 * @return formatDate
	 */
	public static String formatDate(LocalDate ldt) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return dtf.format(ldt);
	}
}
