package inheritance;

public class ShapeDemo {
	public static void main(String[] args) {
		// KDL đối tượng: Integer, String, ...
		// 				: Item, Employee --> class			--> method with body
		//				: Shape			 --> interface		--> method without body
		
		// Tạo ra biến (đối tượng) từ KDL đối tượng
		
		// class
		Rectangle r1 = new Rectangle();
		r1.paint();
		
		// new interface
		// override abstract method immediately
		// anonymous class
		Shape s1 = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("s1 --> paint");
			}
			
			@Override
			public void calSuperficiality() {
				System.out.println("s1 --> calS ...");
			}
		};
		
		s1.paint();
		
		// Circle/Square --> implements class
		Shape c1 = new Circle();
		c1.paint();
	}
}
