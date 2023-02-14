package mutable;

/**
 * Task(Runnable)  
 *   run --> doTask --> StringBuilder, StringBuffer 
 * Thread 1 --> task 
 * Thread 2 --> task
 */
public class Ex02StringBuilderAndBuffer {
	public static long N = 1000 * 1000;
	
	public static void main(String[] args) throws InterruptedException {
		Task task = new Task(); // mutableString
		
		Thread t1 = new Thread(task, "T1");
		Thread t2 = new Thread(task, "T2");
		
		t1.start();
		t2.start();
	}
	
	public static class Task implements Runnable {
		
		private StringBuffer mutableString;
		
		public Task() {
			mutableString = new StringBuffer();
		}
		
		@Override
		public void run() {
			System.out.println("Thread " + Thread.currentThread().getName() + " is running ... ");
			for (int i = 1; i <= N; i++) {
				mutableString.append("a");
			}
			System.out.println("Thread " + Thread.currentThread().getName() + " is finished ... ");
			System.out.println("Mutable String length: " + mutableString.length());
		}
	}
}
