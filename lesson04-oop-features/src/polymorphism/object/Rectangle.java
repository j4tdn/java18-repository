package polymorphism.object;

public class Rectangle extends Shape {
	@Override
	void paint() {
		System.out.println("Rectangle --> paint");
	}
	
	@Override
	void calSuperficiality() {
		System.out.println("Rectangle --> calS...");
	}
}
