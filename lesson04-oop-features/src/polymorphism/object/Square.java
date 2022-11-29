package polymorphism.object;

public class Square extends Shape {
	@Override
	void paint() {
		System.out.println("Square ---> paint");
	}
	
	@Override
	void calSuperficialiity() {
		System.out.println("Square ---> calS...");
	}

}
