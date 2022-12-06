package inheritance;

public class BusinessEmailService extends EmailService{

	@Override
	void login() {
		System.out.println("BusinessEmailService --> login");
	}
	@Override
	void login2Steps() {
		System.out.println("BusinessEmailSevervice --> login with 2 steps");
	}
}
