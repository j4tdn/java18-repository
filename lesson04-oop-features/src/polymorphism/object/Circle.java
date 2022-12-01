package polymorphism.object;

	// this --> đối tượng hiện tại
	// 
public class Circle extends Shape {
	@Override
	void paint() {
		System.out.println("Circle ---> paint");
	}
	@Override
	void calSuperficiality() {
		System.out.println("Shape ---> calS...");
	}
}
