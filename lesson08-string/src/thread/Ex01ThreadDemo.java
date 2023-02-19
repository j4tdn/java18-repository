package thread;

import java.util.concurrent.TimeUnit;

public class Ex01ThreadDemo {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("Start main method ...");
		System.out.println("---> " + Thread.currentThread().getName());
		//Tạo thread mới
		Thread t1 = new Thread(new Task("M2", 4, start), "T1");
		t1.start();
		
		
		
		
		System.out.println("End main method ...");
	}
	



}
