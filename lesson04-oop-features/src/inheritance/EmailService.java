package inheritance;

public abstract class EmailService {
      // require oveerride in sub classes
	  // abstracct method
	abstract void login();
	
	void login2Steps() {
		System.out.println("Optional --> login with 2 stesp ... ");
	} 
}
