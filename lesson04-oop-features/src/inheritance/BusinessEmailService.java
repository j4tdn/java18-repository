package inheritance;

public class BusinessEmailService extends EmailService {

	@Override
	void login() {
		// TODO Auto-generated method stub
		System.out.println("BusinessEmailService ---> login ...");
	}
	
	@Override
	void login2Steps() {
		System.out.println("BusinessEmailService ---> login 2 step ...");
	}
	
}
