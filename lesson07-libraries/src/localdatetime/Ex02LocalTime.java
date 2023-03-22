package localdatetime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex02LocalTime {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println("Local time now --> " + now);
		
		LocalTime until = LocalTime.of(23, 12, 02);
		System.out.println("Local time until --> "  + until);
		
		//tìm khoảng thời gian giữa 2 mốc thời gian với Local time
		// --> duration
		Duration duration = Duration.between(now, until);
		
		System.out.println("Hours: " + duration.toHoursPart());
		System.out.println("Minutes: " + duration.toMinutesPart());
		System.out.println("Seconds: " + duration.toSecondsPart());
		
	}
}
