package thread;

public class Ex02MultiThreads {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Task w1 = new Task("W1", 3, start);
		Task w2 = new Task("W2", 3, start);
		Task w3 = new Task("W3", 3, start);
		
		Thread t1 = new Thread(w1, "T1");
		Thread t2 = new Thread(w2, "T2");
		Thread t3 = new Thread(w3, "T3");
		t1.start();
		t2.start();
		t3.start();
		
	}
}
