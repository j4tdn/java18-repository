package inheritance;

// require require: login
// optional optional: login2Steps 
public abstract class EmailService {
	// require override in sub class
	// abstract method
	abstract void login();
	
	void login2Step() {
		System.out.println("Optional --> login with 2 stepp ...");
	}
}
