package inheritance;

public class BusinessEmailService extends EmailService {
	@Override
	void login() {
		System.out.println("BusinessEmailService --> login");
	}
	@Override
	void login2Step() {
		System.out.println("BusinessEmailService --> login with 2 steps");
	}
}
