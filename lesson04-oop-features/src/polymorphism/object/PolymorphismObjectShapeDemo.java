package polymorphism.object;

public class PolymorphismObjectShapeDemo {
	public static void main(String[] args) {
		// as usual
		Shape shape = new Shape();
		shape.paint();
		
		Circle circle = new Circle();
		circle.paint();
		
		Square square = new Square();
		square.paint();
		
		System.out.println("======= object polymorphism =======");
		// s1
		// compile: Shape
		// runtime: Circle
		// call method
		// compile(coding) --> Shape's paint
		// runtime(running) --> Circle's paint
		Shape s1 = new Circle();
		s1.paint();
		
		Shape s2 = new Square();
		s2.paint();
		
		Shape s3 = new Rectangle();
		
		s3 = new Square();
		s3.paint();
		
		/*
		 * Câu hỏi: Vì sao k lấy class hiện tại new class mà lấy
		 * class cha new class con
		 * 
		 * => Dễ dàng ép kiểu/gán giá trị qua về giữa các bieens có KDL 
		 * thuộc nhóm(cha-con)
		 */
		
		Shape r1 = new Rectangle();
		Shape r2 = new Rectangle();
		Shape r3 = new Rectangle();
		
		Shape sq1 = new Square();
		Shape sq2 = new Square();
		
		//Rectangle[] restangles = {r1,r2,r3,sq1};
		Shape[] shapes = {r1,r2,r3,sq1,sq2};
		for(Shape each:shapes) {
			each.calSuperficiality();
		}
	}
}
