package inheritance;

public class ShapeDemo {
	public static void main(String[] args) {
		//KDL đối tượng: Integer,String..
		// 				: Item/Employee --> Class --> methods with body
		// 				: Shape --> là interface --> methods without body
		
		
		// tạo ra 1 biên (đối tương) từ KDL đối tượng
		//class
		Rectangle r1 = new Rectangle();
		r1.paint();
		
		
		
		// new interface
		// require: override abstract methods immediately
		// --> anonymous class --> lớp ẩn danh
		Shape s1 = new Shape() {
			
			 @Override
			public void paint() {
				 System.out.println("circle --> paint ...");
			}
			 
			 @Override
			public void calSuperficiality() {
				 System.out.println("circle --> calS..");
			}
		};
		s1.paint();
		
		//Cach2
		//Circle/Square --> implementation classes
		Shape s2 = new Circle();
		s2.paint();
	}
}

