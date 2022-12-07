package inheritance;

public class Square implements Shape {

	@Override
	public void paint() {
		System.out.println("Square --> paint");
	}

	@Override
	public void calSuperficiality() {
		System.out.println("Square --> calS...");
	}
	
}
