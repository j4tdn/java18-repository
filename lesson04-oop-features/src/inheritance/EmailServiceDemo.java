package inheritance;

public class EmailServiceDemo {
	public static void main(String[] args) {
		StandardEmailService std = new StandardEmailService();
		std.login();

		EmailService es = new EmailService() {

			@Override
			void login() {
				System.out.println("es---> login");
			}
		};
		es.login();
	}

}