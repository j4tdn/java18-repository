package inheritance;

public abstract class EmailService {
	//require override in sub classes
	//abstract method
	abstract void login();
	
	void login2Step() {
		System.out.println("2 step");
	}
}
