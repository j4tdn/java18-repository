package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;
/**
 * Tìm khoảng thơi gian 2 người yêu nhau ??
 */

public class Ex04DatingTime {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		
		start.set(2022,Calendar.OCTOBER, 16, 10, 05, 22);
		
		Calendar now = Calendar.getInstance();
		
		long startInMls = start.getTimeInMillis();
		long nowInMls = now.getTimeInMillis();
		
		long duration = nowInMls - startInMls;
		
		System.out.println("duration : " + duration + " ms");
		
		//duration / (1000*60*60*24)
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		System.out.println("days : " + days);
		
		duration = duration - TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		System.out.println("hours : " + hours);

		duration = duration - TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		System.out.println("minutes : " + minutes);
		
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		System.out.println("seconds : " + seconds);
	}
}
