package polymorphism.object;

public class PolymorphismObjectShapeDemo {
	public static void main(String[] args) {

		//
		// as usual
		// shape
		// compile --> Shape --> call Shape's method
		// runtime --> Shape
		Shape shape = new Shape();
		shape.paint();

		Circle circle = new Circle();
		circle.paint();

		Square square = new Square();
		square.paint();

		System.out.println("==== object polymorphism ====");

		// s1
		// compile: Shape
		// runtime: Circle
		// call method
		// compile( coding) --> Shape's paint
		// runtime(runing) --> Circle's paint

		Shape s1 = new Circle();
		s1.paint();

		Shape s2 = new Square();
		s2.paint();

		Shape s3 = new Rectangle();
		// s3.width = 10; s3.heigth = 10; --> Square
		// = ( gán) : cho phep gan trong truong hop: KDL x = KDL x,hoac  KDL cha = KDL con
		// int a = 5;
		// long b = MA
		s3 = s2;
		s3.paint();

		/*
		 * Bài toán: tính S của tất cả các hình' --> mảng <--- trong hệ thống Rectangle,
		 * Square, Circle Mảng : Lưu trữ tập hợp các phần tử + cung KDL với KDL khai báo
		 * mảng hoặc con của nó int[] i = {2,2,3,4} String[] s = {"a", "b"}
		 */

		// ví dụ:
		Shape r1 = new Rectangle();
		Shape r2 = new Rectangle();
		Shape r3 = new Rectangle();

		Shape sq1 = new Square();
		Shape sq2 = new Square();

		// Rectangle[] rectangles = {r1, r2, r3};
		Shape[] shapes = { r1, r2, r3, sq1, sq2 };
		for (Shape each : shapes) {
			each.calSuperficiality();
		}

		/*
		 * Câu hỏi: vì sao không lấy class hiện tại new class hiện tại mà phải lấy class
		 * cha new class con? Trả lời: 1. dễ dàng ép kiểu( gán giá trị qua về) giữa các
		 * biến có KDL thuộc nhóm ( cha - con) Vì tất cả đều là KDl cha lúc compile 2.
		 * Có thể gộp/gom tất cả các phần tử có KDL cha/con vào trong 1 mảng/ danh sách
		 * có KDL của cha. 3. Thỏa mãn tính chất trong design pattern --> factory
		 * pattern Cha cha = new Con() Câu hỏi : KDL cha = KDL con => OK KDL con = KDL
		 * cha => fail
		 * 
		 */
	}
}
