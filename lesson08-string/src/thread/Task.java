package thread;
import static thread.ThreadUtils.doTask;

public class Task implements Runnable{
	
	private String taskName;
	private long excutionTimeInMils;
	private long startInMils;
	
	public Task(String taskName, long excutionTimeInMils, long startInMils) {
		this.taskName = taskName;
		this.excutionTimeInMils = excutionTimeInMils;
		this.startInMils = startInMils;
	}
	
	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName() + " is running");
		doTask(taskName, excutionTimeInMils);
		System.out.println("thread is finish at " + (System.currentTimeMillis()-startInMils));
	}

}
