package views;

/**
 * run() -> thuộc class Runnable 
 * running() -> thuộc class Ex03LocalVariable --> local variable -> round
 *                                                global variable -> kms
 * => Một hàm không thể truy cập đến biến cục bộ của hàm thuộc class khác
 * 
 * Closure: có thể truy cập đến nonlocal variable
 *
 */

public class Ex03LocalVariable {
	
	static int kms = 0;
	
	public static void main(String[] args) {
		running(10);
	}
	
	private static void running(int seconds) {
		// anonymous class, function, lambda
		// local variable
		int round = 0;
		
		Runnable runner = new Runnable() {		
			
			@Override
			public void run() {
				System.out.println("This round was finished in " + seconds + "(s)");
				// round++; fail -> Local variable round defined in an enclosing scope must be final or effectively final
				
				// global variable
				kms++;
			}
		};
		runner.run();
	}

}