package view;

public class Ex03LocalVariable {
	
	static int kms=0;
	
	public static void main(String[] args) {
		running(10);
	}
	private static void running(int seconds) {
		// local variable
		int round =0;
		
		
		Runnable runner = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("This round was finished in " + seconds + "(s)");
				kms++;
			}
		};
		runner.run();
	}
}
