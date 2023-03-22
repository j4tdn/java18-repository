package thread;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {
	
	private ThreadUtils() {
	}
	
	public static void doTask(String taskName, long executionTimeInSecond) {
		try {
			System.out.println(">> Task " + taskName + " is being excuted ... by thread"
								+ Thread.currentThread().getName());
			for (int i = 0; i < executionTimeInSecond; i++) {
				System.out.println("Task " + taskName + "..." + ((float)i/(float)executionTimeInSecond*100) + "%");
				TimeUnit.SECONDS.sleep(1);
			}
			
			System.out.println(">> Task " + taskName	+ " is finished ...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
