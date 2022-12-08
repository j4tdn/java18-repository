package inheritance;

public class BusinessEmailService extends EmailService{

	@Override
	void login() {
		System.out.println("BusinessEmailService --> login");
	}
	
	@Override
	void login2step() {
		System.out.println("BusinessEmailService --> login");
	}
	
	
}
