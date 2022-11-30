package polymorphism.object;

public class Circle extends Shape {

	// this --> đối tượng hiện tại
	// super --> đối tượng của lớp cha
	
	@Override
	void paint() {
		// super.paint();
		System.out.println("Circle --> paint");
	}
	void calSupergiciality () {
		System.out.println("Circle --> calS");
	}
	
}
