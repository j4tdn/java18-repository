package thread;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {
	
	public static void sleep(long timeInMils) {
		try {
			TimeUnit.SECONDS.sleep(timeInMils);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void doTask(String taskname, long executionTimeInSeconds) {
		try {
			System.out.println(">> " + taskname + " Executing task  ... by " + Thread.currentThread().getName());
			for (int i = 1; i <= executionTimeInSeconds; i++) {
				System.out.println("Task " + taskname + "...." + i);
				TimeUnit.SECONDS.sleep(1);
			}
			System.out.println(">> Task " + taskname + " is finished ...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
