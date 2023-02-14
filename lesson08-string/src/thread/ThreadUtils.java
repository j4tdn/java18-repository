package thread;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {
	public static void sleep(long seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void doTask(String taskName, long executionTimeInseconds) {
		try {
			System.out.println("Executing task --> " + taskName + " by " + Thread.currentThread().getName()+ "  is being started");
			TimeUnit.SECONDS.sleep(executionTimeInseconds);
			System.out.println(">> Task " + taskName + " is finished");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
