package thread;

import static thread.ThreadUtils.doTask;

public class Task implements Runnable {
	
	private String taskName;
	private long executionTimeInMilils;
	private long startInMils;
	public Task(String taskName,long executionTimeInMilils,long startInMils) {
		this.taskName=taskName;
		this.executionTimeInMilils=executionTimeInMilils;
		this.startInMils=startInMils;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("---> " + Thread.currentThread().getName()+" is running");
		doTask(taskName, executionTimeInMilils);
		System.out.println("Thread "+Thread.currentThread().getName()+" is finished at "+(System.currentTimeMillis()-startInMils));
	}
}
