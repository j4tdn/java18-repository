package excersises;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

import utils.DateUtils;

public class Ex03 {
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();

		String area = "Asia/Saigon";
		System.out.println("Thời gian HT của khu vực: " + formatDateTime(getDateTimeArea(area).toLocalDateTime()));
		System.out.println("Ngày cuối của tháng (hiện tại): " + formatDate(getLastDayInThisMonth().toLocalDate()));
		System.out.println("Ngày đầu của tuần (HT): " + formatDate(getfirstDayInThisWeek().toLocalDate()));
		System.out.println("Ngày cuối của tuần (HT): " + formatDate(getLastDayInThisWeek().toLocalDate()));
		System.out.println("Ngày hiện tại là tuần thứ " + checkThisWeekInYear() + " trong năm");
		dayFuture();

		// Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập ngày tháng năm sinh: ");
		String Bir = ip.nextLine();
		Calendar live = DateUtils.StringToCalendar(Bir, "dd/MM/yyyy");
		System.out.println(
				"Bạn đã sống được " + ((c.getTimeInMillis() - live.getTimeInMillis()) / (3600000 * 24)) + " ngày");

	}
	// Xem thời gian hiện tại(dd/MM/yyyy HH:mm:ss) ở khu vực bất kỳ.

	public static ZonedDateTime getDateTimeArea(String area) {
		ZoneId timeZone = ZoneId.of(area);
		LocalDateTime dateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = dateTime.atZone(timeZone);
		return zonedDateTime;
	}

	// In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).

	public static LocalDateTime getLastDayInThisMonth() {
		LocalDateTime dateTime = LocalDateTime.now();
		LocalDateTime lastDay = dateTime.with(TemporalAdjusters.lastDayOfMonth());
		return lastDay;

	}
	// Xem ngày đầu tiền của tuần hiện tại.

	public static LocalDateTime getfirstDayInThisWeek() {
		LocalDateTime dateTime = LocalDateTime.now();
		LocalDateTime lastDay = dateTime.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		return lastDay;
	}

	// Xem ngày cuối cùng của tuần hiện tại.

	private static LocalDateTime getLastDayInThisWeek() {
		LocalDateTime dateTime = LocalDateTime.now();
		LocalDateTime lastDay = dateTime.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
		return lastDay;
	}

	// Xem ngày hiện tại đang ở tuần thứ mấy trong năm.

	private static int checkThisWeekInYear() {
		LocalDateTime now = LocalDateTime.now();
		WeekFields weekFields = WeekFields.of(Locale.getDefault());
		int weekOfYear = now.get(weekFields.weekOfYear());
		return weekOfYear;
	}

	// Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.

	public static void dayFuture() {
		LocalDate now = LocalDate.now();
		LocalDate futureDate = now.plusDays(20);
		System.out.println("20 ngày nữa là ngày: " + formatDate(futureDate) + ", " + futureDate.getDayOfWeek());
	}

	// --------------------------------------------------------

	public static String formatDateTime(LocalDateTime ldt) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
		return dtf.format(ldt);
	}

	public static String formatDate(LocalDate ldt) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return dtf.format(ldt);
	}
}