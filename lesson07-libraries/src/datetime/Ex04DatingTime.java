package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex04DatingTime {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2022, Calendar.OCTOBER,16, 10, 05, 22);
		
		Calendar now = Calendar.getInstance();
		
		long startInMls = start.getTimeInMillis();
		long nowInMls = now.getTimeInMillis();
		
		long duration = nowInMls - startInMls;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		System.out.println("Days: " + days);
		
		duration = duration - TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		System.out.println("Hours: " + hours);
		
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		System.out.println("Minutes: " + minutes);
		
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		System.out.println("Seconds: " + seconds);
		
		duration = duration - TimeUnit.SECONDS.toMillis(seconds);
	}
}
