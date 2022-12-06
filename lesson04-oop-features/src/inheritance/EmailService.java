package inheritance;

// override require: login
// override optional: login2Steps
public abstract class EmailService {
	// require override in sub classes
	// abstract method
	abstract void login();
	
	void login2Step() {
		System.out.println("optional --->  login with 2 steps....");
	}
}
