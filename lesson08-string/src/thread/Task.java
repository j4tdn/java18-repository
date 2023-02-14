package thread;

import static thread.ThreadUtils.doTask;

public class Task implements Runnable {
	private String taskName;
	private long executionTimeMils;
	private long startInMilis;

	public Task() {
		// TODO Auto-generated constructor stub
	}
	
	public Task(String taskName, long executionTimeMils, long startInMilis) {
		this.taskName = taskName;
		this.executionTimeMils = executionTimeMils;
		this.startInMilis = startInMilis;
	}

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName() + " is running...");
		doTask(taskName, executionTimeMils);
		System.out.println("Thread " + Thread.currentThread().getName() + " is finished at "
				+ (System.currentTimeMillis() - startInMilis));
	}

}
