package polymorphism.object;

public class Rectangle extends Shape{
	void paint() {
		System.out.println("Rectangle --> paint");
	}
	
	void calSuperficiality() {
		System.out.println("Rectangle --> cals...");
	}
}
