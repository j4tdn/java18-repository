package inhertance;

public class BusinessEmailService extends EmailServide {
	@Override
	void login() {
		System.out.println("1.1");
	}
	@Override
	void login2Steps() {
		System.out.println("1.2");
	}
}
