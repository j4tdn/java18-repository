package inheritance;

public class Circle implements Shape {

	@Override
	public void paint() {
		System.out.println("s1 --> paint ...");
	}

	@Override
	public void calSuperficialiity() {
		System.out.println("s1 --> calS ...");
	}

}