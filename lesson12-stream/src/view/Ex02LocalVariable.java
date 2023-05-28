package view;

public class Ex02LocalVariable {
	
	static int kms = 0;
	
	public static void main(String[] args) {
		running(10);
	}
	
	private static void running(int seconds) {
		//local variable --> ngầm định là final
		int round = 0;
		
		//anonymous class, function, lamda
		Runnable runner = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("This task will be ran in " + seconds + "(s)");
				
				//Local variable round 
				//round++;
				
				//global variable
				kms++;
			}
		};
		runner.run();
	}
}
