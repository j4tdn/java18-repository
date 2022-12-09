package polymorpgism.object;

public class Square extends Shape{
	@Override
	void paint() {
		System.out.println("Square ---> paint");
	}
	
	@Override
	void calSuperficiality() {
		System.out.println("Square ---> cals...");
	}
}
