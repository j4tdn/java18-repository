package thread;

public class Task implements Runnable {
	
	private String taskName;
	private long executionTimeInMls;
	private long startInMls;
	
	public Task(String taskName, long executionTimeInMls, long startInMls) {
		this.taskName = taskName;
		this.executionTimeInMls = executionTimeInMls;
		this.startInMls = startInMls;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread " + Thread.currentThread().getName() + " is running ...");
		ThreadUtils.doTask(taskName, executionTimeInMls);
		System.out.println("Thread " + Thread.currentThread().getName() + " is finished at " + (System.currentTimeMillis() - startInMls) + " ms");
	}
}
