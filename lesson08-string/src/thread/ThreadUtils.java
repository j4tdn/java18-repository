package thread;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {
	
	private ThreadUtils() {
	}
	
	public static void sleep(long seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void doTask(String taskName, long executionTimeInSeconds) {
			System.out.println("Task " + taskName + " is being executed by " + Thread.currentThread().getName());
			// TimeUnit.SECONDS.sleep(executionTimeInSeconds);
			for(int i = 1; i <= executionTimeInSeconds; i++) {
				System.out.println("Task " + taskName + " " + i + " time(s)");
				sleep(1);
			}
			System.out.println(" >> Task " + taskName + " is finished ...");
	}
}
