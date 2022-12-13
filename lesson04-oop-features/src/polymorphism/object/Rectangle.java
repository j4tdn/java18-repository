package polymorphism.object;

public class Rectangle extends Shape {
	@Override
	void paint() {
		System.out.println("rectangle-->paint");
	}
	 
	@Override
	void calSuperficiality() {
		System.out.println("rectangle -->  cals...");
	}

}
