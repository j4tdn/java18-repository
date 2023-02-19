package thread;

public class Task {
	private String taskName;
	private long executionTimeInMils;
	private long startInMils;
	
	
	public Task(String taskName, long executionTimeInmils, long startInMils) {
		super();
		this.taskName = taskName;
		this.executionTimeInMils = executionTimeInmils;
		this.startInMils = startInMils;
	}
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName() + " is runing ...");
		doTask(taskName, executionTimeInMils);
		System.out.println("Thread " + Thread.currentThread().getName() + "is finished ay "
				+ (System.currentTimeMillis() - startInMils) + "ms");
	}

}
