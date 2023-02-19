package thread;

public class Ex01ThreadDemo {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("Start main method");
		System.out.println("thread name --->  " + Thread.currentThread().getName());

		// tạo thread mới
		// start thread t1 --> t1.start() --> t1.run() --> runable.run()
		Thread t1 = new Thread(new Task("M2", 4, start), "T1");
		t1.start();

		sleep(2);

		doTask("M1", 3);
		System.out.println("End main method");
		System.out.println("duration --> " + (System.currentTimeMillis() - start) + "ms");

	}

}
