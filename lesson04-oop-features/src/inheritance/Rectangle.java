package inheritance;

public class Rectangle implements Shape {

	@Override
	public void paint() {
		System.out.println("Rectangle --> paint");
	}

	@Override
	public void calSuperficiality() {
		System.out.println("Rectangle --> calS ...");
	}
	
	// public
	// private
	// ... -> [abstract]class --> using in current package
	// ... -> interface --> using same as public
	// protected 
	// --> using in current package
	// --> using in other package if there's a sub class of current class 
	
	protected void clear() {
		System.out.println("Rectangle --> clear");
	}
	
}
