package view;

public class Ex03LocalVariable {
	static int kms = 0;
	public static void main(String[] args) {
		running(10);
	}
	private static void running(int seconds) {
		//local variable
		int round = 0;
		
		// accessible --> closure
		
		//anonymous class,function
		Runnable runner = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("This round was finished in "+ seconds+"(s)");
				//Local variable round defined in an enclosing scope must be final or effectively final
//				round++;
				//global variable
				kms++;
			}
		};
		runner.run();
	}
	//Runable --->run();
	//Ex02 --> running() --> local variable -->round
	//Closure function là 1 function có thể truy cập đến non localvariable
}
