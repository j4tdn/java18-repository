package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 * 
 * Tìm khoảng thời gian 2 người quen nhau với TimeUnit [Year - Month] - Days -
 * Hours + minutes + Second
 *
 */
public class Ex04DatingTime {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		// 16/10/2022 18:20:22
		start.set(2021, Calendar.JANUARY, 20, 20, 20, 20);

		Calendar now = Calendar.getInstance();
		long startInMls = start.getTimeInMillis();
		long nowInMls = now.getTimeInMillis();
		long duration = nowInMls - startInMls;
		System.out.println("duration in mlS --> " + duration);

		// Day
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		System.out.println("days --> " + days);
		duration = duration - TimeUnit.DAYS.toMillis(days);

		// Hours
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		System.out.println("hours --> " + hours);
		duration = duration - TimeUnit.HOURS.toMillis(hours);

		// Minutes
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		System.out.println("minutes --> " + minutes);
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);

		// seconds
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		System.out.println("seconds --> " + seconds);
		duration = duration - TimeUnit.SECONDS.toMillis(seconds);
		System.out.println("Time dating --> " + days + "days " + hours + ":" + minutes + ":" + seconds);

	}
}
