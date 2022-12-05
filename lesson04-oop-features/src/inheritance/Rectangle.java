package inheritance;

public class Rectangle implements Shape {

	@Override
	public void paint() {
		System.out.println("Rectangle --> paint ...");
	}

	@Override
	public void calSuperficialiity() {
		System.out.println("Rectangle --> calS ...");
	}

}
