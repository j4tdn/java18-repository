package view;

public class Ex03LocalVariable {
	public static void main(String[] args) {
		running(5);
	}

	private static void running(int seconds) {
		
		//Local variable
		int round = 0;
		
		// anonymous class, function, lamda
		Runnable runner = new Runnable() {

			@Override
			public void run() {
				System.out.println("this task will be ran in " + seconds + " (s)");
//				round++; ->Không dùng đc 
			}
		};
		runner.run();
	}
}
