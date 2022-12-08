package inheritance;

public class Retangle implements Shape {

	@Override
	public void paint() {
		System.out.println("Retangle --> calS ...");

	}

	@Override
	public void calSuperficiality() {
		System.out.println("Retangle --> calS ...");

	}

	protected void clear() {
		System.out.println("Retangle --> clear");
	}
}
