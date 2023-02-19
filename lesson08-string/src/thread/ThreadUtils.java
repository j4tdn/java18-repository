package thread;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {
	private ThreadUtils() {
		
	}

	public static void sleep(long seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void dotask(String taskname, long executionTimeSeconds) {
		try {
			System.out.println(">> Task " + taskname + " is being executed... by thread " + Thread.currentThread().getName() );
			for (int i = 1; i <= executionTimeSeconds; i ++) {
				System.out.println(">> Task " + taskname + "..." + i);
				TimeUnit.SECONDS.sleep(i);
			}
			System.out.println(">> Task " + taskname + " is finished");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
