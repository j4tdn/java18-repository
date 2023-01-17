package polymorphism.object;

public class Rectangle extends Shape {

	@Override
	void paint() {
		System.out.println("paint rectangle");
	}
	@Override
	void calArea() {
		System.out.println("Rectangle --> calS");
	}
	
}
