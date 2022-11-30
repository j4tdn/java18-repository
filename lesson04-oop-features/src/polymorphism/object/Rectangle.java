package polymorphism.object;

public class Rectangle extends Shape{
	@Override
	void paint() {
		super.paint();
	}
	void calSupergiciality () {
		System.out.println("Rectangle --> calS");
	}

}
