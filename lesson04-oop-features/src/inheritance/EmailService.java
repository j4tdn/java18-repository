package inheritance;


// require: login
// optional: login2Steps
public abstract class EmailService {
	// require override in sub classes
	// abstract method
	abstract void login();
	
	void login2step() {
		System.out.println("optianal --> login with 2 steps ...");
	}
}
