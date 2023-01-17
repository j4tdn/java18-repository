package polymorphism.object;

public class Square extends Shape {

	@Override
	void paint() {
//		super.paint();
		System.out.println("paint square");
	}
	
	@Override
	void calArea() {
		System.out.println("Square --> calS");
	}
}
