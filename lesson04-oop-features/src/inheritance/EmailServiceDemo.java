package inheritance;

public class EmailServiceDemo {
       public static void main(String[] args) {
		StandarEmailService std = new StandarEmailService();
		std.login();
		
		EmailService es = new EmailService() {
			
			@Override
			void login() {
				System.out.println("es --> login");
				
			}
		};
		es.login();
	}
}
