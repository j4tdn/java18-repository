package inheritance;

public class BusinessEmailService extends EmailService {

	@Override
	void login() {
		System.out.println("BusinessEmailService---> login");
	}
	

}
