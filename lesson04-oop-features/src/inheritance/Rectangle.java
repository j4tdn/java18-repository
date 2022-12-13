package inheritance;

public class Rectangle implements Shape {
	@Override
	public void calSuperficiality() {
		System.out.println("Rectangle ---> calS....");
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle -----> paint");
	}

	protected void clear() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle -----> clear....");

	}
}
