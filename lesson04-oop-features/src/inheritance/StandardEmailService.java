package inheritance;

// kDL con(class) kế thừa(extends) từ KDL cha(abstract class)
// --> bắt buộc: phải override abstract từ KDL cha
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
