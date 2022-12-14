package inheritance;

public class Rectangle implements Shape {

	@Override
	public void paint() {
		System.out.println("Rectangle ---> paint ...");
		
	}

	@Override
	public void calSuperficiality() {
		System.out.println("Rectangle ---> calS ...");
	}
	
	/** bữa giờ học
	 - private
	 - public
	 - defau ko có gì
	 - protected
	          --> using in curent package
	          --> using in diferent package if it's child of curent class
	*/
	protected void clear() {
		System.out.println("Rectangle --> clear");
	}

}
