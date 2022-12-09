package inhertance;

public class EmailServideDemo {
	public static void main(String[] args) {
		StandardEmailService std = new StandardEmailService();
		std.login();
		
		EmailServide se = new EmailServide() {
			
			@Override
			void login() {
				// TODO Auto-generated method stub
				System.out.println("se --> login");
			}
		};
		se.login();
	}
}
