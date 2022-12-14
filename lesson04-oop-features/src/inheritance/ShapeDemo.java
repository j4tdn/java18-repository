package inheritance;

public class ShapeDemo {
	public static void main(String[] args) {
		//KDL đối tượng : Interger, String ...
		//               : Item/Employee --> class --> methods with body
		//               : Shape         --> Interface
		Rectangle r1 = new Rectangle();
		r1.paint();
		
		// new interface
		// require : override abstract methods immediately
		// --> anonymous class --> lớp ẩn danh 
		
		Shape s1 = new Shape() {

			@Override
			public void paint() {
				System.out.println("circle --> paint ...");
				
			}

			@Override
			public void calSuperficiality() {
				System.out.println("circle --> calS ...");
				
			}
			
		};
		s1.paint();
		// CHƯA XONG
	}
      
}
