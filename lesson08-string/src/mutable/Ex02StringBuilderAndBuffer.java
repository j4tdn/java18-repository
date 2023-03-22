package mutable;

import java.util.concurrent.TimeUnit;

public class Ex02StringBuilderAndBuffer {
	public static long N = 1000*1000;
	
	public static void main(String[] args) {
		
		Task task = new Task();
		Thread t1 = new Thread(task, "T1");
		Thread t2 = new Thread(task, "T2");
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	private static class Task implements Runnable {
		private StringBuilder mutableString;
		
		public Task() {
			mutableString = new StringBuilder();
		}
		public StringBuffer getMutableString() {
			return mutableString;
		}
		
		@Override
		public void run() {
			System.out.println("Thread " + Thread.currentThread().getName() + " is running");
			for (int i = 1; i <= N; i++) {
				mutableString.append("a");
			}
			System.out.println("Thread " + Thread.currentThread().getName() + " is finished");
			System.out.println("Mutable String length: " + mutableString.length());
		}
	}
}
