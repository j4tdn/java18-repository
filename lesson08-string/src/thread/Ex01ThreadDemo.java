package thread;

import static thread.ThreadUtils.*; //import hết tất cả hàm trong class
public interface Ex01ThreadDemo {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("start method ...");
		System.out.println("--> " + Thread.currentThread().getName());
		
		Thread t1 = new Thread(new Task("M2", 4, start),"T1");
		t1.start();
		doTask("m1", 3);
		System.out.println("end main method");
		System.out.println("durtion: "+(System.currentTimeMillis()-start));
	}
}