package inheritance;

public class StandardEmailService extends EmailService {

	@Override
	void login() {
		System.out.println("StandarEmailService ---> login");
	}
	@Override
	void login2Step() {
		System.out.println("optional --->  login with 2 steps....");
	}
}
