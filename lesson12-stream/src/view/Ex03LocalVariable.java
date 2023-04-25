package view;

public class Ex03LocalVariable {
	
	static int kms = 0;
	public static void main(String[] args) {
		running(10);
	}

	private static void running(int seconds) {
		// local variable
		int round = 0;

		// anonymous class, function, lambda
		Runnable runner = new Runnable() {

			@Override
			public void run() {
				System.out.println("This round was finished in " + seconds + " (s)");
				// Local variable round defined in an enclosing scope must be final or effectively (ngầm định) final
				// round++;  gọi được nhưng k thể tăng giảm....mặc định là final
				
				// global variable
				kms++;
			}
		};
		runner.run();
	}
}
