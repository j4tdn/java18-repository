package polymorphism.object;

public class PolymorphismObjectShapeDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.paint();

		Circle circle = new Circle();
		circle.paint();

		Square square = new Square();
		shape.paint();

		System.out.println("======== obj polymorphism ========");

		// s1
		// compile:Shape
		// runtime:Circle
		// call method
		// compile(coding) --> Shape's paint
		// runtime(running) --> Circle's paint

		Shape s1 = new Circle();
		s1.paint();

		Shape s2 = new Square();
		s2.paint();

		Shape r1 = new Rectangle();
		Shape r2 = new Rectangle();
		Shape r3 = new Rectangle();

		Shape sq1 = new Rectangle();
		Shape sq2 = new Rectangle();

		Shape[] shapes = { r1, r2, r3, sq1, sq2 };
		for (Shape each : shapes) {
			each.calArea();
		}

		// vì sao không lấy class hiện tại new class hiện tại
		// mà phải lấy class cha new class con?
		// ==>
		// 1. dễ dàng ép kiểu/gán giá trị qua về giữa các biến
		// có kiểu dữ liệu thuộc nhóm(cha-con)
		// vì tất cả đều là KDL cha lúc compile
		// 2. có thể gộp/gom tất cả các phần tử có KDL
		// 3. thoả mãn tính chất trong
		// design pattern --> factory pattern
		// Cha cha = new Con();

		// câu hỏi: KDL KDL cha = KDL con ==>
		// KDL con = KDL cha ==> fail

	}

}
