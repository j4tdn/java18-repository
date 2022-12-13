package inheritance;

public class Rectangle implements Shape {
	@Override
	public void calSuperficiality() {
		System.out.println("Rectangle ---> calS....");
	}
	@Override
	public void paint() {
		System.out.println("Rectangle -----> paint");
	}
	
	protected void clear () {
		System.out.println("Rectangle ---> clear");
	}
}       