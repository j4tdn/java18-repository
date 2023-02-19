package thread;

public class Task implements Runnable {
	private String taskName;
	private long executionTimeInMils;
	private long startInMils;

	public Task(String taskName, long executionTimeInMils, long startInMils) {
		this.taskName = taskName;
		this.executionTimeInMils = executionTimeInMils;
		this.startInMils = startInMils;
	}

	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName() + "is runing ... ");
		doTask(taskName, executionTimeInMils);
		System.out.println("Thread " + Thread.currentThread().getName() + "is finished ay "
				+ (System.currentTimeMillis() - startInMils) + "ms");
	}
}
