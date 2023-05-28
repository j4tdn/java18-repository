package thread.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import utilyThread.Threadutily;

public class Ex01 {
	public static void main(String[] args) {
		List<Thread> threads = new ArrayList<>(20);
		
	}
	
	private static class Task implements Runnable {
		@Override
		public void run() {
			Threadutily.doTask(3, TimeUnit.SECONDS);
		}
	}
}
