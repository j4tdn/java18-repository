package inheritance;

public class StandardEmailService extends EmailService {
	@Override
	void login() {
		System.out.println("login standard email");
	}	
}
	