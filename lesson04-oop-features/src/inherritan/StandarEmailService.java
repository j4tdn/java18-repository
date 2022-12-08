package inherritan;
// KDL con ( class) kế thừa (extende) từ KDL cha (abstract)
// yêu cầu override abstracct
public class StandarEmailService extends EmailService {

	@Override
	void login() {
			System.out.println("StandarEmailService --> login");
	}
	

}
