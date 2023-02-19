package thread;

public class Task implements Runnable {

	private String taskName;
	private long executionTimeInMilis;
	private long startInMilis;

	public Task(String taskName, long executionTimeInMilis, long startInMilis) {
		this.taskName = taskName;
		this.executionTimeInMilis = executionTimeInMilis;
		this.startInMilis = startInMilis;
		
	}

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName() + " is running...");
		ThreadUtils.doTask(taskName, executionTimeInMilis);
		System.out.println("Thread " + Thread.currentThread().getName() + " is finished at "
				+ (System.currentTimeMillis() - startInMilis) + "ms");
	}

}
