package view;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.IsoFields;
import java.time.temporal.TemporalAdjusters;

public class Ex03Function {
	public static void main(String[] args) {
		LocalDateTime ld = LocalDateTime.now(ZoneId.of("Iran"));
		System.out.println("thời gian hiện tại ở Iran: " + format(ld));
		
		LocalDate ld2 = LocalDate.now();
		System.out.println("ngày cuối cùng của tháng hiện tại: " + ld2.lengthOfMonth());
		System.out.println("Ngày đầu của tuần hiện tại: " + formatDate(getfirstDayInThisWeek().toLocalDate()));
		System.out.println("Ngày cuối của tuần hiện tại: " + formatDate(getLastDayInThisWeek().toLocalDate()));	
		System.out.println("Đây là tuần thứ " + ld2.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR) + " của năm");
		System.out.println("20 ngày sau là ngày thứ " + ld2.plusDays(20).getDayOfWeek() + " ngày " + ld2.plusDays(20).getDayOfMonth());
		
		LocalDate dOB = LocalDate.of(2002, Month.JULY, 28);
		LocalDate now = LocalDate.now();
		if (now.isBefore(dOB)) {
			throw new IllegalArgumentException("Day of birth must be less than now");
		}
		System.out.println("Bạn đã sống được " + ChronoUnit.DAYS.between(dOB, now) + " ngày.");
	}
	
	private static String format(LocalDateTime ldatetime) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return dtf.format(ldatetime);
	}
	
	public static String formatDate(LocalDate ldt) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return dtf.format(ldt);
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
}
