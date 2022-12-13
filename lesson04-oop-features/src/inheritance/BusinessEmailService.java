package inheritance;

public class BusinessEmailService extends EmailService {

	@Override
	void login() {
		System.out.println("businessEmailService--> login");

	}

	@Override
	void login2Step() {
		System.out.println("businessEmailService--> login 2 step ");

	}


}
