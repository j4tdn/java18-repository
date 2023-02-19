package thread;

import java.util.concurrent.TimeUnit;

public class Ex01ThreadDemo {
	public static void main(String[] args) {
		long stard = System.currentTimeMillis();
		System.out.println("Start main method ...");
		System.out.println("Thread name: " + Thread.currentThread().getName());
		//doTask("M1", 3);
		
		Thread t1 = new Thread(new Task("M2", 4, start), "T1");
		t1.start();
		
		sleep(2);
		
		doTask("M2", 3);
		System.out.println("End main method ...");
		System.out.println("duration --> " + (System.currentTimeMillis() - start) + " ms");
	}
}
