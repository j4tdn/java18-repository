package inheritance;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape s1 = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("s1 ==> paint");
				
			}
			
			@Override
			public void calSuperFicaiality() {
				System.out.println("s1 ==> call");
				
			}
		};
		s1.paint();
		
		
		Shape s2  = new Square();
		s2.paint();
		
		Retangle s3 = new Retangle();
		s3.clear();
		
	}
}
