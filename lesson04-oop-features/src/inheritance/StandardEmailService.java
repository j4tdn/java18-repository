package inheritance;

// KDL con (Class) kế thừa (extends) từ KDL cha (Abstract class)
// --> bắt buộc phải override abstract method từ KDL cha

public class StandardEmailService extends EmailService {

	@Override
	void login() {
		System.out.println("StandardEmailService --> login ...");
	}

}