package inheritance;

public class BusimessEmailService extends EmailService {

	@Override
	void login() {
		System.out.println("BusimessEmailService --> login");
		
	}


}
