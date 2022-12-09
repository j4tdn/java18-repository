package inhertance;

public class Rectangle implements Shape {

	@Override
	public void paint() {
		System.out.println("Rectangle --> paint");
	}

	@Override
	public void calSuperficiality() {
		System.out.println("Rectangle --> paint");
	}
	
	/**
	 * private 
	 * public
	 * ... --> [abstract]class --> ussing in curent package
	 * ... --> interface --> same as public 
	 * protected
	 * --> using in curent package
	 * --> using in different package if it's child of curent  pk
	 * 
	 */
	
	protected void clear() {
		System.out.println("Rectangle --> clear");
	}
}
