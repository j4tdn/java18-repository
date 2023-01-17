package inheritance;

public class EmailDemo {	
	public static void main(String[] args) {
		StandardEmailService std = new StandardEmailService();
		std.login();
		System.out.println("================================");
		BussinessEmail bsn = new BussinessEmail();
		bsn.login();
		bsn.login2Step();
	}
}
