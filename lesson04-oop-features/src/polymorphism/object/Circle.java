package polymorphism.object;

public class Circle extends Shape {
	@Override
	void paint() {
		System.out.println("Circle --> paint");
	}
	
	void calSuperficiality() {
		System.out.println("Circle --> cals...");
	}
}
