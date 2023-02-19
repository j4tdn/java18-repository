package thread;

import java.util.concurrent.TimeUnit;

public class ThreadUnit {
	
	private ThreadUnit() {
		
	}
	
	public static void sleep(long seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void doTask(String taskName, long executionTimeInSeconds) {
		try {
			System.out.println(">> Task " + taskName + " is being executied ... "
					+ "by thread " + Thread.currentThread().getName());
			for ( int i = 1; i <= executionTimeInSeconds; i++) {
				System.out.println("Task " + taskName + " ... " + i);
				TimeUnit.SECONDS.sleep(1);
			}
			TimeUnit.SECONDS.sleep(executionTimeInSeconds);
			System.out.println(">> Task " + taskName + " is finished ...");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
