package inheritance;

public class Rectangle implements Shape {

	@Override
	public void paint() {
		System.out.println("rectangle-->paint");
		
	}

	@Override
	public void calSuperficiality() {
		System.out.println("Rectangle-->cal");
		
	}
	/*
	 * protected : dungf trong package
	 * dùng ngoài package khi là con kế thừa nó
	 */
		protected void clear() {
			System.out.println("rectangle-->clear");

		}
	

}
