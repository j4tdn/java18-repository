package inheritance;


public class ShapeDemo {
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		r1.paint();
		// new interface
				// require: override abstract method immediately
				// ---> anonyoums class --> lớp ẩn danh
				
				Shape s1 = new Shape() {

					@Override
					public void paint() {
						System.out.println("circle ---> paint...");
					}

					@Override
					public void calSuperficiality() {
						System.out.println("circle ---> cal...");
					}
				};
				s1.paint();
				
				Shape s2 = new Circle();
				s2.paint();

	}

}
