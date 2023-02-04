package localDateTime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex02LocalTime {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println("Now: " + now);
		
		LocalTime until = LocalTime.of(21, 15, 02);
		System.out.println("Until: " + until);
		
		// Tìm khoảng thời gian giữa 2 mốc thời gian với
		// LocalTime -dùng-> Duration
		
		Duration duration = Duration.between(now, until);
		System.out.println("duration: " + duration);
		
		System.out.println("hours: " + duration.toHoursPart());
		System.out.println("minutes: " + duration.toMinutesPart());
		System.out.println("seconds: " + duration.toSecondsPart());
		
	}
}
