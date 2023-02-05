package localdatetime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex02LocalTime {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println("now: " + now);
		
		LocalTime until = LocalTime.of(23, 12, 02);
		System.out.println("until: " + until);
		
		// Tìm khoảng thời gian giữa 2 mốc thời gian với
		// LocalTime ---> Duration
		Duration duration = Duration.between(now, until);
		System.out.println("duration: " + duration);
		
		System.out.println("hours: " + duration.toHoursPart());
		System.out.println("minutes: " + duration.toMinutesPart());
		System.out.println("seconds: " + duration.toSecondsPart());
	}
}