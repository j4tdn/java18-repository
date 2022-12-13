package polymorphism.object;

public class Circle extends Shape {

	@Override
	void paint() {
//		super.paint();
		System.out.println("circle --> paint");
	}
	@Override
	void calSuperficiality() {
		System.out.println("circle -->  cals...");
	}
	
	
	

}
