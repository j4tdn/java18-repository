package inherritan;

public class Rectangle implements Shape {
	@Override
	public void paint() {
		System.out.println("Rectangle...---> paint ");
	}
	@Override
	public void calSuperficiality() {
		System.out.println("Rectangle...---> Cals " );
	}
	// private 
	// public
	// ... ( class) 
	// ... (interface)
	//protectied
	// --> using in curren backage
	protected void clear() {
		System.out.println("Rectangle ---> clear ");
	}
}
