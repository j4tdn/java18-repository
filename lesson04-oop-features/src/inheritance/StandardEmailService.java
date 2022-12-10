package inheritance;

// KDL con(class) kế thừa(extends) từ KDL cha(abstract class)
// --> bắt buộc: phải override abstract method từ KDL cha
public class StandardEmailService extends EmailService {

	@Override
	void login() {
		System.out.println("StandardEmailService --> login ...");		
	}
	
}
