package inheritance;

public class Circle implements Shape {
	@Override
	public void paint() {
		System.out.println("circle --> paint ...");
	}

	@Override
	public void calSuperficiality() {
		System.out.println("circle --> calS ...");
	}
}
