package utilyThread;

import java.util.concurrent.TimeUnit;

public class Threadutily {
	public Threadutily() {
		// TODO Auto-generated constructor stub
	}
	public static void printCurThreadName(Thread thread) {
		System.out.println("Name thread # " +  thread.currentThread().getName());
	}
	
	public static void printCurThreadName() {
		System.out.println("Name thread # " + Thread.currentThread().getName());
	}
	
	public static void doTask(int time , TimeUnit timeUnit) {
		try {
			timeUnit.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
