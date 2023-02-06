package exercises;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

import utils.DateTimeUtils;

public class TheUltimateRelationshipCalculator {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Input start date (dd/MM/yy) : ");
		String temp = ip.nextLine();
		Calendar start = DateTimeUtils.stringToCalendar(temp, "dd/MM/yy");
		int dow = start.get(Calendar.DAY_OF_WEEK);
		// System.out.println("Day of week : " + dow);
		String[] weekDayAsString = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		String weekday = weekDayAsString[dow-1];
		System.out.println("Start day in week : " + weekDayAsString[dow-1]);
		
		// Calendar to LocalDateTime
		TimeZone tz = start.getTimeZone();
		ZoneId zoneId = tz.toZoneId();
		LocalDateTime ldtStart = LocalDateTime.ofInstant(start.toInstant(), zoneId);
		// System.out.println(ldtStart);
		
		LocalDateTime ldtNow = LocalDateTime.now();
		
		// To LocalDate
		LocalDate ldStart = ldtStart.toLocalDate();
		LocalDate ldNow = ldtNow.toLocalDate();
		Period period = Period.between(ldStart, ldNow);
		// System.out.println(period);
		
		// To LocalTime
		LocalTime ltStart = ldtStart.toLocalTime();
		LocalTime ltNow = ldtNow.toLocalTime();
		Duration duration = Duration.between(ltStart, ltNow);
		// System.out.println(duration);
		
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
