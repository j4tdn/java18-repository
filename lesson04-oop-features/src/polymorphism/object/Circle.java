package polymorphism.object;

public class Circle extends Shape {

	// this --> đối tượng hiện tại
	// super --> đối tượng của lớp cha
	
	@Override
	void paint() {
		// super.paint();
		System.out.println("Circle ---> paint");
	}
	
	@Override
	void calSuperficiality() {
		System.out.println("Circle ---> calS...");
	}
	
}
