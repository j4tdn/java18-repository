package thread.core;

import java.util.concurrent.TimeUnit;

import utilyThread.Threadutily;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("main start");
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Threadutily.doTask(2, TimeUnit.SECONDS);
				
				Threadutily.printCurThreadName();
				System.out.println("running a task .... ");
			}
		},"Thread 1");
		t1.start();
		//current thread
		
		Threadutily.printCurThreadName();
		
		System.out.println("main end ");
	}
}
