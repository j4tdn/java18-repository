package excersises;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

import utils.DateUtils;

/**
 * Xây dựng ứng dụng The Ultimate Relationship Calculator
 * Nhập thời gian bắt đầu hẹn hò của 2 người.
 * Nếu đã chia tay, nhập ngày chia tay ngược lại lấy thời gian hiện tại
 * Nhấn Enter để thực hiện tính toán. Hỏi
 * Ngày bắt đầu hẹn họ là ngày thứ mấy.
 * Mối tình đã bắt đầu được bao nhiêu năm, tháng, ngày, giờ, phút, giây
 *
 */
public class Ex01 {
	private static final String Pattern = "dd/MM/yyyy HH:mm:ss";
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Ngày bắt đầu hẹn hò(dd/MM/yyyy HH:mm:ss): ");
		String startDate = ip.nextLine();
		System.out.print("Ngày kết thúc (nếu có - dd/MM/yyyy HH:mm:ss): ");
		String endDate = ip.nextLine();
		Calendar start = DateUtils.StringToCalendar(startDate, "dd/MM/yyyy HH:mm:ss");
		
		// Ngày bắt đầu hẹn hò là thứ mấy
		
		int dow = start.get(Calendar.DAY_OF_WEEK);
		String[] weekDayAsString = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		String weekday = weekDayAsString[dow-1];
		System.out.println(weekDayAsString[dow-1] + " is the start of dating history");
		
		// Khoảng thời gian hẹn hò
		
		TimeZone tz = start.getTimeZone();
		ZoneId zoneId = tz.toZoneId();
		LocalDateTime ldtStart = LocalDateTime.ofInstant(start.toInstant(), zoneId);
		LocalDateTime ldtNow = LocalDateTime.now();
		
		LocalDate ldStart = ldtStart.toLocalDate();
		LocalDate ldNow = ldtNow.toLocalDate();
		Period period = Period.between(ldStart, ldNow);
		
		LocalTime ltStart = ldtStart.toLocalTime();
		LocalTime ltNow = ldtNow.toLocalTime();
		Duration duration = Duration.between(ltStart, ltNow);
		
		System.out.println(getUnit(period.getYears(), " years ")
				+ getUnit(period.getMonths(), " month ")
				+ getUnit(period.getDays(), " days ")
				+ getUnit(duration.toHoursPart(), " hours ")
				+ getUnit(duration.toMinutesPart(), " minutes ")
				+ getUnit(duration.toSecondsPart(), " seconds ")
				);
	}
	
	private static String getUnit(int value, String unit) {
		return value == 0 ? " " : value + unit;
	}
}
