package polymorphism.object;

public class Square extends Shape {
	@Override
	void paint() {
		//super.paint();
		System.out.println("Square --> paint");
	}
	void calSuperficiality() {
		System.out.println("Square --> cals...");
	}
}
