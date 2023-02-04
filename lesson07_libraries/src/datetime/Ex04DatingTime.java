package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex04DatingTime {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2022, Calendar.OCTOBER, 23, 18, 01, 02);
		
		Calendar now = Calendar.getInstance();
		
		long startInMls = start.getTimeInMillis();
		long nowInMls = now.getTimeInMillis();
		long duration = nowInMls -startInMls;
		
		System.out.println("duration: " + duration + " ms");
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		System.out.println("days: " + days);
		
		duration = duration - TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		System.out.println("hours: " + hours);
		
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		System.out.println("minutes: " + minutes);
		
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(minutes);
		System.out.println("seconds: " + seconds);
	}

}
