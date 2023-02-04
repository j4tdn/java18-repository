package exercises;

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
public class Ex01TheUltiMate {
	private static final String Pattern = "dd/MM/yyyy HH:mm:ss";
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Ngày bắt đầu hẹn hò(dd/MM/yyyy HH:mm:ss): ");
	
		String startDate = ip.nextLine();
		System.out.print("Ngày kết thúc (nếu có - dd/MM/yyyy HH:mm:ss): ");
		
		String endDate = ip.nextLine();
		
		Calendar start = DateUtils.StringToCalendar(startDate, "dd/MM/yyyy HH:mm:ss");
		int DoW = start.get(Calendar.DAY_OF_WEEK);
		String[] weekDayAsString = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		String weekday = weekDayAsString[DoW-1];
		System.out.println(weekDayAsString[DoW-1] + " is the start of dating history");
		
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
				+ getUnit(period.getMonths(), " months ")
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