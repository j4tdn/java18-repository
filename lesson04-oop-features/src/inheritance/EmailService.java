package inheritance;

// override
// require: login
// optional: login2Steps

public abstract class EmailService {
	// require override in sub classes
	// abstract method
	abstract void login();

	void login2Steps() {
		System.out.println("Optional --> login with 2 steps ...");
	}

}