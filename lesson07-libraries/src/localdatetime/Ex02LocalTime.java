package localdatetime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex02LocalTime {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println("now: " + now);
		 
		LocalTime until = LocalTime.of(23,12,02);
		System.out.println("until: " + until);
		
		Duration duration = Duration.between(now, until);
		System.out.println("duration: " + duration);
		
		System.out.println("Hour: " + duration.toHoursPart());
		System.out.println("Minutes: " + duration.toMinutesPart());
		System.out.println("Seconds: " + duration.toSecondsPart());
	}
}
