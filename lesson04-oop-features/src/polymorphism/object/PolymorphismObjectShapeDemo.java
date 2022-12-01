package polymorphism.object;

public class PolymorphismObjectShapeDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.paint();
		
		Circle circle = new Circle();
		circle.paint();
		
		Square square = new Square();
		shape.paint();
		
		System.out.println("===== object polymorphism ======");
		// s1
		// compile: shape
		// runtime; Circle
		// call method
		// compile(coding) --> Shape's paint
		// runtime(running) --> Circle's paint
		Shape s1 = new Circle();
		s1.paint();
		
		Shape s2 = new Square();
		s2.paint();
		
		Shape s3 = new Shape();
		s3.paint();
		
		Shape r1 = new Rectangle();
		Shape r2 = new Rectangle();
		Shape r3 = new Rectangle();
		
		Shape sq1 = new Square();
		Shape sq2 = new Square();
		
		Shape[] shapes = {r1,r2,r3,sq1,sq2};
		for (Shape each: shapes) {
			each.calSuperficiality();
		}
		
		
		/* Câu hỏi: Vì sao k lấy class hiện tại new class 
		 * mà phải lấy class cha new class con
		 * 
		 * 
		 * Trả lời:
		 * 1. Dễ dàng ép kiểu/gán giá trị qua về giữa các biến có KDL
		 * thuộc nhóm (cha - con) --> Vì tất cả đều là KDL cha lúc compile
		 * 2. Có thể gộp/gom tất cả các phần tử có KDL
		 * cha/con vào trong 1 mảng/danh sách có KDL của cha
		 * 3. Thỏa mãn tính chất trong
		 *  design pattern(mẫu thiết kế) --> factory pattern
		 *  Cha cha = new Con()
		 *  
		 *
		 * 
		 *
		 */
	}
}
