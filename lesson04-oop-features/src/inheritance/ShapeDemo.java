package inheritance;

public class ShapeDemo {
	public static void main(String[] args) {
		// KDL đối tượng: Integer, String...
		//				: Item/Employee --> class		--> methods with body
		//				: Shape			--> interface	--> methods without body
		
		// Tạo ra biến(đối tượng) từ KDL đối tượng
		
		// class
		Rectangle r1 = new Rectangle();
		r1.paint();
		
		// new interface
		// require: override abstract methods immediately
		// --> anonymous class --> lớp ẩn danh
		Shape s1 = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("s1 --> paint ...");
			}
			
			@Override
			public void calSuperficiality() {
				System.out.println("s1 --> cals ...");
			}
		};
		s1.paint();
		
		Shape s2 = new Circle();
		s2.paint();
	}
}
