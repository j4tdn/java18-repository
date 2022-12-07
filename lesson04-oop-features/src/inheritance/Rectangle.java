package inheritance;

public class Rectangle implements Shape{

	@Override
	public void paint() {
		System.out.println("Rectangle --> paint ...");
	}

	@Override
	public void calSuperficiality() {
		System.out.println("Rectangle --> calS ...");
	}
	// A
	// private
	// public
	// ... --> [abstract]class --> using in current package
	// ... --> interface --> same as public
	// protected
	// --> using in current package
	// --> using in different package if it's child of current class
	
	protected void clear() {
		System.out.println("Rectangle ---> clear");
	}
	
}