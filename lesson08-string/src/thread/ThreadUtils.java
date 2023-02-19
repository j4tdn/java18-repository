package thread;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {
	private ThreadUtils() {

	}

	public static void sleep(long seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void doTask(String taskName, long executionTimeInMils) {
		try {
			System.out.println(">> Task " + taskName + " is being executed... by thread "
					+ Thread.currentThread().getName());
			for (int i = 0; i <= executionTimeInMils; i++) {
				System.out.println("Task " + taskName + "..." + i);
				TimeUnit.SECONDS.sleep(1);
			}
			System.out.println(">> Task " + taskName + " is finished...");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
