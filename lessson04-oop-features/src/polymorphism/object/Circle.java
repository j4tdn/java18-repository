package polymorphism.object;

public class Circle extends Shape {
	@Override
	void paint() {
		System.out.println("Circle --> paint");
	}

	@Override
	void calArea() {
		System.out.println("Circle ---calArea---");
	}

}
