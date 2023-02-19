package thread;

import java.util.concurrent.TimeUnit;
import static thread.ThreadUtils.*;

public class Ex01ThreadDemo {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("start main method ...");
		
		System.out.println("---> " + Thread.currentThread().getName());
		
		//doTask("M1", 3);
		
		// tao thread moi
		Thread t1=new Thread(new Task("M2", 4, start),"T1");
		t1.start();
		//doTask("M5", 3);
		doTask("M1", 3);
		
		System.out.println("end main method ...");
		System.out.println("duration --> " + (System.currentTimeMillis()-start));
	}
	
	
}
