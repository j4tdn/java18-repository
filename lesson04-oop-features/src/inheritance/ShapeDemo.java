package inheritance;

public class ShapeDemo {	
	public static void main(String[] args) {
		// Tạo ra biến (đối tượng) từ KDL đối tượng
		
		Rectangle r1 = new Rectangle();
		r1.paint();
		
		
		// Cách 1:
		// new interface
		// require: override abstract methods immediately
		// anonumous class (lớp ẩn danh)
		Shape s1 = new Shape() {
		
			@Override
			public void paint() {
				System.out.println("");
			}
			
			@Override
			public void calSuperficiality() {
				
			}
		};
		s1.paint();
		
		// Cách 2:
		// Circle/Square --> implementation class
		Shape s2 = new Square();
		s2.paint();
	}
}
