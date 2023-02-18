package thread;

import static thread.ThreadUtils.doTask;

public class Task implements Runnable {

	private String taskName;
	private long executionTimeInMils;
	private long startInMils;

	public Task(String taskName, long executionTimeInMils, long startInMils) {
		this.taskName = taskName;
		this.executionTimeInMils = executionTimeInMils;
		this.startInMils = startInMils;
	}

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName() + " is running ...");
		doTask(taskName, executionTimeInMils);
		System.out.println("Thread " + Thread.currentThread().getName() + " is finished at "
				+ (System.currentTimeMillis() - startInMils) + " ms");
	}
}