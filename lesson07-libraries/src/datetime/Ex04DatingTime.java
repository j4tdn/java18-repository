package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 Ex04: Tìm khoảng thời gian 2 người quen nhau với TimeUnit
    : [Years - Months] - Days - Hours + Minutes + Seconds
 
    --> 1m 6dm 2cm 8mm -> 8m 6dm 9cm 9mm  --> m dm cm mm
    --> 1682mm -> 8611mm
    --> 6929 --> 6m 9dm 2cm 9mm
    --> 6929/1000 = 6m
    --> 6929 - 6*1000 = 929
    --> 929/100 = 9dm
    --> 929 - 9*100 = 29
 */
public class Ex04DatingTime {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		// 16/10/2022 18:20:22
		start.set(2022, Calendar.OCTOBER, 16, 10, 05, 22);
		
		// 31.01.2023 18:52:20
		Calendar now = Calendar.getInstance();
		
		long startInMls = start.getTimeInMillis();
		long nowInMls = now.getTimeInMillis();
		
		long duration = nowInMls - startInMls;
		
		System.out.println("duration: " + duration + " ms");
		
		// duration / (1000*60*60*24) -- ms --> day
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		System.out.println("days: " + days);
		
		duration = duration - TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		System.out.println("hours: " + hours);
		
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		System.out.println("minutes: " + minutes);
		
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		System.out.println("seconds: " + seconds);
		
		// 31.01.2023 1:2:3... --> 01.03.2023 4:5:6 --> 29days(mls)
		// 31.03.2023      ... --> 30.04.2023       --> 30days
	}
}