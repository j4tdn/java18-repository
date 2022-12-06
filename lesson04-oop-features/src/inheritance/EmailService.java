package inheritance;

// override require: login
//override optional: login2Step
public abstract class EmailService {
	// require override in sub classes
	// abstract method
	abstract void login();
	
	void login2Steps() {
			System.out.println("Optinal --> login with 2 step ...");
			
	}
	
}
