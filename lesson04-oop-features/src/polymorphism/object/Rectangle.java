package polymorphism.object;

public class Rectangle extends Shape {
	private void to() {
		System.out.println("Rectangle ---> Shape");

	}
	@Override
	void calSuperficiality() {
		System.out.println("Rectangle ---> calS....");
	}
}
