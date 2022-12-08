package inheritance;

// KLD con (class) kế thừa (extends) từ KLD cha (abstract class)
// bắt buộc: phả override abstract method từ KDL cha
public class StandardEmailService extends EmailService {

	@Override
	void login() {
		System.out.println("StandardEmailService --> login..");
	}

}
