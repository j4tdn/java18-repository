package inheritance;

public class StandarEmailService extends EmailService {

	@Override
	void login() {
		System.out.println("StandarEmailService --> login...");
		
	}

}
