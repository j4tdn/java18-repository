package LocalDateTime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex02LocalTime {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println("Time now: " + now);

		LocalTime until = LocalTime.of(23, 12, 32);
		System.out.println("until: " + until);

		// Tìm khoảng thời gian giữa 2 mốc thời gian với LocalTime --> Duration
		Duration duration = Duration.between(now, until);
		System.out.println("duration --> " + duration);
		
		System.out.println("Hour: "+duration.toHoursPart());
		System.out.println("Minute: "+duration.toMinutesPart());
		System.out.println("Second: "+duration.toSecondsPart());
	}

}
