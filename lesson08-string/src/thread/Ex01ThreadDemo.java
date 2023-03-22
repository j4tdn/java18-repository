package thread;
import static thread.ThreadUtils.doTask;
public class Ex01ThreadDemo {
	public static void main(String[] args) {
		System.out.println("Start main method");
		System.out.println("Thread name -->" + Thread.currentThread().getName());
		System.out.println("End main method");
		long start = System.currentTimeMillis();
		//Create new thread
		
		Thread t1 = new Thread(new Task("M2", 4, start), "T1");
		t1.start();
		doTask("M1", 3);
		
	}
	//main --> doTask (taskName, executionTimeInSecond);
}
