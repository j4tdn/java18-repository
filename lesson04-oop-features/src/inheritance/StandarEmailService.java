package inheritance;
//KDL con (class) kế thừa từ kdl cha
//bắt buộc phải override abstrac method từ kdl cha
public class StandarEmailService extends EmailService {

	@Override
	void login() {
		System.out.println("login");
		
	}
	

}
