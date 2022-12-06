package inheritance;

public class ShapeDemo {
	public static void main(String[] args) {
		// KDL đối tường: Integer, String ...
		// : Item/Employee --> class -->methods with body
		// : Item/Employee --> interface --> method without body

		// tạo ra biến(đối tượng) từ KDL
		// new interface
		// require: override abstract methods immediately
		// anonymous class

		Shape s1 = new Shape() {

			@Override
			public void paint() {
				// TODO Auto-generated method stub

			}

			@Override
			public void calSuperficility() {
				// TODO Auto-generated method stub

			}
		};
		s1.paint();
		// Circle/Square --> implementation classes
		Shape s2 = new Circle();
		s2.paint();

	}

}
