package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Ex01TheUltimateRelationShipCalculator {
	
	private static final String pattern = "HH:mm:ss dd/MM/yyyy";
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String dayStart_Str;
		String dayEnd_Str;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		
		System.out.println("Day start(HH:mm:ss dd/MM/yyyy): "); //11:20:35 15/06/2017
		dayStart_Str = sc.nextLine();
		System.out.println("Day end(HH:mm:ss dd/MM/yyyy): ");  //19:25:45 04/02/2023
		dayEnd_Str = sc.nextLine();
		
		
		LocalDateTime dayStart = LocalDateTime.parse(dayStart_Str, dtf);
		LocalDateTime dayEnd = LocalDateTime.parse(dayEnd_Str, dtf);
		
		if (dayStart.isAfter(dayEnd)) {
			throw new IllegalArgumentException("dateStart cannot exceed dateEnd !!!");
		}
		
		LocalDate startDate = dayStart.toLocalDate();
		LocalDate endDate = dayEnd.toLocalDate();
		
		Period period = Period.between(startDate, endDate);
		
		LocalTime startTime = dayStart.toLocalTime();
		LocalTime endTime = dayEnd.toLocalTime();

		Duration duration = Duration.between(startTime, endTime);

		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			endDate = endDate.minusDays(1);
		}

		System.out.println("----- This relationshop has lasted: ");
		System.out.println(getUnit(period.getYears(), " year(s) ")
				 + getUnit(period.getMonths(), " month(s) ")
				 + getUnit(period.getDays(), " day(s) ")
				 + getUnit(duration.toHoursPart(), " hour(s) ")
				 + getUnit(duration.toMinutesPart(), " minute(s) ")
				 + getUnit(duration.toSecondsPart(), " second(s)"));

		LocalDate date = LocalDate.of(2018, Month.JUNE, 15);
		System.out.print("-->");
		System.out.println(date.getDayOfWeek());

	}
	
	private static String getUnit(int value, String unit) {
		return value == 0 ? "" : value + unit;
	}

}

