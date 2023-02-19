package thread;

public class Task implements Runnable {
	private String taskname;
	private long executionTimeInMils;
	private long startInMils;
	
	public Task(String taskname, long executionTimeInMils, long startInMils) {
		this.taskname = taskname;
		this.executionTimeInMils = executionTimeInMils;
		this.startInMils = startInMils;
	
	}
	
	@Override
	public void run() {
		System.out.println("Thread "+ Thread.currentThread().getName() + " is running...");
		ThreadUtils.dotask(taskname, executionTimeInMils);
//		dotask(taskname, executionTimeInMils);
		
		System.out.println("Thread " + Thread.currentThread().getName() + " is finished at " + (System.currentTimeMillis() - startInMils) + " ms");
		
		
	}

}
