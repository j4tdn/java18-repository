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

		System.out.println("======== object polymorphism =========");

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
		// Bài toán: Tính s tất cả các hình
		
		Shape r1 = new Rectangle();
		Shape r2 = new Rectangle();
		Shape r3 = new Rectangle();
		
		Shape sq1 = new Square();
		Shape sq2 = new Square();
		
		Shape[] shapes = {r1, r2, r3, sq1, sq2};
		for(Shape each: shapes) {
			each.calSuperficiality();
		}
		
		
//		câu hỏi: vì sao lấy class hiện tại new class cha mà phải lấy class cha new class con
//		trả lời:
//		1. Dễ dàng ép kiểu/gán giá trị qua về giữa các biến có KDL thuộc nhóm(cha-con)
//			vì tất cả đều là KDL cha lúc compile
//		2. có thể gộp vào trong mảng/danh sách có KDL của cha
//		3. Thỏa mãn tính chất trong design pattern --> factory pattern
		
//		câu hỏi: KDL cha = KDL con ==> OK
//				 KDL con = KDL cha ==> fail
	}
}
