package polymorphism.object;

public class Square extends Shape{

	void paint() {
		System.out.println("Square --- > paint");
	}
	@Override
	void calSuperficiality() {
		System.out.println("Square ---> calS...");
	}
}
