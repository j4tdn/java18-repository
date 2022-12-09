package polymorpgism.object;

public class PolymorphismObjectShapeDemo {
	public static void main(String[] args) {
		//as usual
		//Shape --> 
		// compile --> Shape --> call 
		// runtime --> Shape
		Shape shape = new Shape();
		shape.paint();
		
		Circle sCircle = new Circle();
		sCircle.paint();
		
		Square square = new Square();
		square.paint();
		
		System.out.println("===== object polymorphirsm =====");
		//S1
		// compile: Shape
		// runtime: Circle
		// call method
		// compile(coding) --> Shape's paint
		// runtime (running) --> Circle's paint
		Shape s1 = new Circle();
		s1.paint();
		
		Shape s2 = new Square();
		s2.paint();
		
		Shape s3 = new Rectangle();
		s3.paint();
		
		s2 = s3;
		s3 = new Square();
		
		//Bài toán: tính S của tất cả các hình --> mảng 
		
		
		Shape r1 = new Rectangle();
		Shape r2 = new Rectangle();
		Shape r3 = new Rectangle();
		Shape r4 = new Rectangle();
		
		Shape sq1 = new Square();
		Shape sq2 = new Square();
		Shape sq3 = new Square();
		
		//Rectangle[] rectangle = {r1, r1, r3, sq1}
		Shape[] shapes = { r1, r1, r3, r4, sq1, sq2, sq3};
		for(Shape each: shapes) {
			each.calSuperficiality();
		}
		
		
		
		/*
		 * Vì sao không lấy class hiện tại new class hiện tại mà phải lấy
		 * class cha new class con ?
		 * 
		 * Trả lời:
		 * 1. Dễ dàng ép kiểu hay gán giá trị qua về giữa các biến có KDL thuộc nhóm cha/con
		 * 	vì tất cả đều là KDL cha lúc compile 
		 * 2. Có thể gộp, gom tất cả các phần tử có kiểu dữ liệu cha/con vào trong 1 mảng/danh sách
		 *  có KDL của cha
		 * 3. Thỏa mãm tính chất trong 
		 *   design pattern --> factory pattern
		 *   Cha cha = new Con()
		 *   
		 * Câu hỏi; KDL cha = KDL con ==> OK
		 */
	}
}
