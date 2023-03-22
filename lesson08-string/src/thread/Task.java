package thread;
import static thread.ThreadUtils.doTask;

public class Task implements Runnable {
	String taskName;
	long executionTime;
	long startInMillis;
	public Task(String taskName, long executionTime, long startInTime) {
		this.taskName = taskName;
		this.executionTime = executionTime;
		this.startInMillis = startInTime;
	}
	
	public void run() {
		System.out.println("Thread name -->" + Thread.currentThread().getName() + " is running");
		doTask(taskName, executionTime);
		System.out.println("Thread " + Thread.currentThread().getName() + " is finished at "
				+ (System.currentTimeMillis() - startInMillis) + " ms"
				);
	}
}
