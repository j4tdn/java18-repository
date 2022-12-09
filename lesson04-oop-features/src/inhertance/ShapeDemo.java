package inhertance;

public class ShapeDemo{
	public static void main(String[] args) {
		/**
		 * KDL hướng đối tượng: Interge, String ...
		 * 					  : Item/Employee --> class  --> method with body
		 * 					  : Shape 		  --> interface --> method without body
		 * 
		 *  Tạo ra biến/đối tượng từ KDL đối tượng
		 *  
		 *  clas Retangle
		 *  Retangle
		 */
		
		// new Interface
		//require: override abstract method immediately
		// --> anonymous class --> lớp ẩn danh
		Shape s1 = new Shape() {

			@Override
			public void paint() {
				System.out.println("Circle --> paint");

			}

			@Override
			public void calSuperficiality() {
				System.out.println("Circle --> calS..");
			}
		};
		s1.paint();
		// Cricle/square --> implement
		Shape s2 = new Circle();
		s2.paint();
	}

}
