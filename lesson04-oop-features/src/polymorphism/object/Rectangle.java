package polymorphism.object;

public class Rectangle extends Shape {
	
	@Override
	void paint() {
		System.out.println("Rectangle ---> paint");
	}
	void calSuperficiality() {
		System.out.println("Rectangle ----> calS...");
	}
}
