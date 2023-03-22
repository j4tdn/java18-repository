package datetime;

/**
 * Ex04: Tìm khoảnh thời gian 2 ngời quen nhau với timeUnit
 * 		:[Years = Months] - Day - Hours  + Minutes + Seconds
 * 
 * */

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex04DatingTime {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		//16/10/2022 18:20:22
		
		start.set(2022, Calendar.OCTOBER, 16, 10, 00, 22);
		Calendar now = Calendar.getInstance();
		long startMillis = start.getTimeInMillis();
		long nowMillis = now.getTimeInMillis();
		long duration = nowMillis - startMillis;
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		
		duration = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		
		System.out.println("Days --> " + days);
		System.out.println("Hours --> " + hours);
		System.out.println("Minutes --> " + minutes);
		System.out.println("Seconds --> " + seconds);
		
		
	}
}
