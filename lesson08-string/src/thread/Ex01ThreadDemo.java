package thread;


public class Ex01ThreadDemo {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("Start main method...");
		
		System.out.println("--> " + Thread.currentThread().getName());
		Thread t1 = new Thread(new Task("M2", 4, start), "T1");
		t1.start();
		
		ThreadUtils.sleep(2);
		
		ThreadUtils.dotask("m1", 3);
//		sleep(2);
//		
//		doTask("m1", 3);
		System.out.println("End main method...");
		System.out.println("Duration --> " + (System.currentTimeMillis() - start) + " ms");
	}
	
}
