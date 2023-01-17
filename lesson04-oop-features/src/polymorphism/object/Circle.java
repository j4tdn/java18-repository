package polymorphism.object;

public class Circle extends Shape {

	//this --> đối tượng hiện tại
	//super --> đối tượng thằng cha
	
	@Override
	void paint() {
		System.out.println("paint circle");
	}
	
	@Override
	void calArea() {
		System.out.println("Circle --> calS");
	}
}