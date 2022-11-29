package polymorphism.object;

public class Circle extends Shape {
	
	// this  --> đại diện cho đối tượng hiện tại
	// super --> đại diện cho đối tượng của lớp cha
	
	@Override
	void paint() {
		System.out.println("Circle ---> paint");
	}
	
	@Override
	void calSuperficialiity() {
		System.out.println("Circle ---> calS...");
	}

}
