package inheritance;

public class BussinessEmailService extends EmailService {

	@Override
	void login() {
		System.out.println("BusinessEmailService --> login");
	}
	
	@Override
	void login2Steps () {
		System.out.println("");
	}
}
