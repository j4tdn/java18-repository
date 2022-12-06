package inheritance;

public class ShapeDemo {
	public static void main(String[] args) {
		// KDL đối tượng: Integer, String,...
		//				: Item/Employee --> class (method with body)
		// 				: Shape         --> Interface (method without body)
		
		// Tạo ra biến (đối tượng) từ KDL đối tượng
		
		// class 
		Rectangle r1 = new Rectangle();
		r1.paint();
		
		// new interface
		// require: override abstract method immediately
		// anonymous class --> method 1 
		Shape s1 = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("s1 --> paint ...");
			}
			
			@Override
			public void calSuperficialiity() {
				System.out.println("s1 --> calS ...");
			}
		};
		s1.paint();
		
		// Circle/Square --> implementation classes --> method 2
		Shape s2 = new Circle();
		s2.paint();
		
	}

}