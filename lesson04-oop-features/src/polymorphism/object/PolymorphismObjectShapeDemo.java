package polymorphism.object;

public class PolymorphismObjectShapeDemo {

	// as usual
	// shape -->
	// compile --> Shape --> call Shape's methods
	//

	public static void main(String[] args) {

		Shape shape = new Shape();
		shape.paint();

		Circle circle = new Circle();
		circle.paint();

		Square square = new Square();
		square.paint();

		System.out.println("==== object polymorphism ===");
		// s1
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
		/*
		 Q: Vì sao không lấy class hiện tại new class hiện tại new class
		  mà phải lấy class cha new class con ?
		 A: 
		 1. Dễ dàng ép kiểu/gán giá trị qua về giữa các biến có KDL 
		 thuộc nhóm (cha-con)
		 	Vì tất cả đều là KDL cha lúc compile
		 2. Có thể gộp/gom tât cả các phần tử có KDL cha/con
		 vào trong 1 mảng/danh sách có KDL của cha
		 
		 3. Thỏa mãn tính chất trong design pattern --> factory pattern
		 Cha cha = new con
		 
		 Q: KDL cha = KDL con => OK
		 	KDL con = KDL cha => fail
		 	
		 	VD: 
		 	KNT: long 1 = .. -- int i = ...
		 	l = i => OK
		 	i = l => fail
		 	KDT: Shape s = ... -- Square sq = ...
		 	s = sq => OK
		 	sq = s => fail
		 */
		
		Shape r1 = new Rectangle();
		Shape r2 = new Rectangle();
		Shape r3 = new Rectangle();

		Shape sq1 = new Rectangle();
		Shape sq2 = new Rectangle();
		
		// Rectangle[] rectangles = {r1, r2, r3, sq1}
		Shape[] shapes = {r1, r2, r3, sq1, sq2};
		for(Shape each: shapes) {
			each.calSuperficility();
		}

	}
}
