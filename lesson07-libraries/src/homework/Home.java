package homework;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Home {
	public static void main(String[] args) {
		//localdate --> period
		//localtime --> duration
		LocalDateTime dayOfBirth = LocalDateTime.of(2004, 8, 2, 3, 4, 5);
		LocalDateTime now = LocalDateTime.now();
		LocalDate lDate = dayOfBirth.toLocalDate();
		LocalDate NLDate = now.toLocalDate();
		Period period =Period.between(lDate, NLDate);
		LocalTime nLTime = now.toLocalTime();
		LocalTime lTime = dayOfBirth.toLocalTime();
		Duration duration=Duration.between(lTime, nLTime);
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		System.out.println(format(dayOfBirth));
		System.out.println(format(now));
		System.out.println(period);
		System.out.println(duration);
		
	}
	
	private static String format(LocalDateTime ldatetime) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return dtf.format(ldatetime);
	}
}

