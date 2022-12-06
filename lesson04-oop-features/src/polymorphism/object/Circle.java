package polymorphism.object;

public class Circle extends Shape{
	@Override
	void paint() {
		System.out.println("Circle --> paint");
		//super.paint();
	}
	@Override
	void calSuperficiality() {
		System.out.println("Circle ---> calS....");
	}

}
