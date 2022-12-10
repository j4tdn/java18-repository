package inheritance;

public class Circle implements Shape {

	@Override
	public void paint() {
		System.out.println("s1 --> paint ...");
	}
	
	@Override
	public void calSuperficiality() {
		System.out.println("s1 --> cals ...");
	}
}
